package experiment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.problem.solution.variable.ITransformationVariable;
import smart_nursing_home.SmartNursingHome;
import smart_nursing_home.Clazz;
import smart_nursing_home.Diabetes;
import smart_nursing_home.Disease;
import smart_nursing_home.Door;
import smart_nursing_home.Elder;
import smart_nursing_home.HeartAttack;
import smart_nursing_home.Room;

public class DemandFactory {
	public static double PROPAGATION_RATE = 0.1;

	public static class Pair<L, R> {

		private final L left;
		private final R right;

		public Pair(L left, R right) {
			this.left = left;
			this.right = right;
		}

		public L getLeft() {
			return left;
		}

		public R getRight() {
			return right;
		}

		@Override
		public int hashCode() {
			return left.hashCode() ^ right.hashCode();
		}

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof Pair))
				return false;
			Pair pairo = (Pair) o;
			return this.left.equals(pairo.getLeft()) && this.right.equals(pairo.getRight());
		}

	}

	public static abstract class Demand {

		public abstract double eval(final SmartNursingHome smartNursingHome, TransformationSolution solution, boolean propagation) throws Exception;
	}

	public static abstract class ObservableDemand extends Demand {

		@Override
		public double eval(final SmartNursingHome smartNursingHome, TransformationSolution solution, boolean propagation) throws Exception {
			if (propagation) {
				int dis = propagationDistance(smartNursingHome);
				return dis < 0 ? 0.0 : Math.pow(PROPAGATION_RATE, dis);
			}
			return satisfied(smartNursingHome) ? 1.0 : 0.0;
		}
		
		abstract boolean satisfied(final SmartNursingHome smartNursingHome) throws Exception;
		
		int propagationDistance(final SmartNursingHome smartNursingHome) throws Exception {
			return satisfied(smartNursingHome) ? 0 : -1;
		}
	}
	
	public static class CompositeDemand extends Demand {
		
		List<Pair<Demand, Double>> children = new ArrayList<>();

		public CompositeDemand(List<Demand> children, List<Double> weights) {
			for (int i = 0; i < children.size(); i ++) {
				this.children.add(new Pair<>(children.get(i), weights.get(i)));
			}
		}
		
		public CompositeDemand(List<Pair<Demand, Double>> children) {
			this.children = children;
		}

		@Override
		public double eval(SmartNursingHome smartNursingHome, TransformationSolution solution, boolean propagation) throws Exception {
			double res = 0;
			for (Pair<Demand, Double> child : children) {
				res += child.getLeft().eval(smartNursingHome, solution, propagation) * child.getRight();
			}
			return res;
		}
		
	}



	public static abstract class SingleRoomDemand extends ObservableDemand {

		String roomName;

		public SingleRoomDemand(String roomName) {
			this.roomName = roomName;
		}

		@Override
		public boolean satisfied(SmartNursingHome smartNursingHome) throws Exception {
			// TODO Auto-generated method stub
			List<Room> rooms = new ArrayList<Room>();
			for (Clazz clazz : smartNursingHome.getClazz()) {
				if (clazz instanceof Room) {
					rooms.add((Room) clazz);
				}
			}
			for (Room room : rooms) {
				if (room.getName().equals(roomName)) {
					return this.func(room);
				}
			}
			throw new Exception(String.format("Room not found: %s", roomName));
		}

		abstract boolean func(Room room);

	}
	
	public static class HeaterOff extends SingleRoomDemand {

		public HeaterOff(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return !room.getHeater().isOn();
		}

	}

	public static class LightOff extends SingleRoomDemand {

		public LightOff(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return !room.getLight().isOn();
		}

	}
	
	public static class HumidifierOff extends SingleRoomDemand {
		
		public HumidifierOff(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		boolean func(Room room) {
			return !room.getHumidifier().isOn();
		}
	}

	public static class TemperatureHigh extends SingleRoomDemand {

		public TemperatureHigh(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return !room.getTemperature().getValue().equals("low");
		}

	}

	public static class BrightnessHigh extends SingleRoomDemand {

		public BrightnessHigh(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return !room.getBrightness().getValue().equals("low");
		}

	}
	
	public static class HumidityHigh extends SingleRoomDemand {
		
		public HumidityHigh(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		boolean func(Room room) {
			return !room.getHumidity().getValue().equals("low");
		}
	}

	public static class Clean extends SingleRoomDemand {

		public Clean(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return !room.getCleanness().getValue().equals("dirty");
		}

		@Override
		int propagationDistance(SmartNursingHome smartNursingHome) throws Exception {
			List<Room> rooms = new ArrayList<Room>();
			for (Clazz clazz : smartNursingHome.getClazz()) {
				if (clazz instanceof Room) {
					rooms.add((Room) clazz);
				}
			}
			Room st = null;
			for (Room room : rooms) {
				if (room.getName().equals(roomName)) {
					st = room;
					break;
				}
			}
			if (st == null)
				throw new Exception(String.format("Room not found: %s", roomName));
			if (func(st))
				return 0;
			
			Set<String> names = new HashSet<String>();
			Queue<Pair<Room, Integer>> queue = new LinkedList<Pair<Room, Integer>>();
			names.add(st.getName());
			queue.offer(new Pair<Room, Integer>(st, 0));
			while (!queue.isEmpty()) {
				Pair<Room, Integer> pair = queue.remove();
				Room cur = pair.getLeft();
				int dis = pair.getRight();
				if (cur.getRoomba().size() > 0) return dis == 0 ? 2 : dis;
				
				names.add(cur.getName());
				
				List<Door> doors = cur.getDoor();
				if (doors.size() > 0) {
					for (Door door : doors) {
						List<Room> rs = door.getRoom();
						for (Room r : rs) {
							if (names.contains(r.getName()))
								continue;
							queue.offer(new Pair<Room, Integer>(r, dis + 1));
						}
					}
				}
			}
			return -1;
		}

	}
	
	public static abstract class ElderDemand extends ObservableDemand {

		String elderName;

		public ElderDemand(String elderName) {
			this.elderName = elderName;
		}

		@Override
		public boolean satisfied(SmartNursingHome smartNursingHome) throws Exception {
			// TODO Auto-generated method stub
			List<Elder> elders = new ArrayList<Elder>();
			for (Clazz clazz : smartNursingHome.getClazz()) {
				if (clazz instanceof Elder) {
					elders.add((Elder) clazz);
				}
			}
			for (Elder elder : elders) {
				if (elder.getName().equals(elderName)) {
					return this.func(elder);
				}
			}
			throw new Exception(String.format("Elder not found: %s", elderName));
		}

		abstract boolean func(Elder elder);

	}
	
	public static class IsTidy extends ElderDemand {
		
		public IsTidy(String elderName) {
			super(elderName);
		}
		
		@Override
		boolean func(Elder elder) {
			return elder.isTidy();
		}
	}
	
	public static class TemperatureChecked extends ElderDemand {
		
		public TemperatureChecked(String elderName) {
			super(elderName);
		}
		
		@Override
		boolean func(Elder elder) {
			return elder.isTemperatureCheck();
		}
	}
	
	public static class BloodOxygenChecked extends ElderDemand {
		
		public BloodOxygenChecked(String elderName) {
			super(elderName);
		}
		
		@Override
		boolean func(Elder elder) {
			return elder.isBloodOxygenCheck();
		}
	}
	
	public static abstract class DiseaseDemand extends ObservableDemand {

		String diseaseName;

		public DiseaseDemand(String diseaseName) {
			this.diseaseName = diseaseName;
		}

		@Override
		public boolean satisfied(SmartNursingHome smartNursingHome) throws Exception {
			// TODO Auto-generated method stub
			List<Disease> diseases = new ArrayList<Disease>();
			for (Clazz clazz : smartNursingHome.getClazz()) {
				if (clazz instanceof Disease) {
					diseases.add((Disease) clazz);
				}
			}
			for (Disease disease : diseases) {
				if (disease.getName().equals(diseaseName)) {
					return this.func(disease);
				}
			}
			throw new Exception(String.format("Disease not found: %s", diseaseName));
		}

		abstract boolean func(Disease disease);

	}
	
	public static class GlucoseMeasured extends DiseaseDemand {
		
		public GlucoseMeasured(String diseaseName) {
			super(diseaseName);
		}
		
		@Override
		boolean func(Disease disease) {
			if(disease instanceof Diabetes)
				return ((Diabetes) disease).isGlucoseMeasured();
			return false;
		}
	}
	
	public static class HeartRateChecked extends DiseaseDemand {
		
		public HeartRateChecked(String diseaseName) {
			super(diseaseName);
		}
		
		@Override
		boolean func(Disease disease) {
			if(disease instanceof HeartAttack)
				return ((HeartAttack) disease).isHeartRateCheck();
			return false;
		}
	}
	
	public static class InsulinInjected extends DiseaseDemand {
		
		public InsulinInjected(String diseaseName) {
			super(diseaseName);
		}
		
		@Override
		boolean func(Disease disease) {
			if(disease instanceof Diabetes)
				return ((Diabetes) disease).isInsulinInjected();
			return false;
		}
	}
	
	public static class AspirinTaken extends DiseaseDemand {
		
		public AspirinTaken(String diseaseName) {
			super(diseaseName);
		}
		
		@Override
		boolean func(Disease disease) {
			if(disease instanceof HeartAttack)
				return ((HeartAttack) disease).isAspirinTaken();
			return false;
		}
	}
	
	public static class CareWorkerLoad extends Demand {
		
		@Override
		public double eval(final SmartNursingHome smartNursingHome, TransformationSolution solution, boolean propagation) throws Exception {
			int count = 1;
			ITransformationVariable[] variables =  solution.getVariables();
			for(ITransformationVariable variable : variables) {
				if(variable.getUnit()!= null) {
					String ruleName = variable.getUnit().getName();
					if(ruleName.contains("Help"))
						count++;
				}
			}
			
			return 1.0/count;
		}
	}

	
//	public static CompositeDemand root = new CompositeDemand(
//			Arrays.asList(assetCollected, clean, withSecretary), 
//			Arrays.asList(0.3, 0.3, 0.4)
//		);
	
	private static List<List<Demand>> bfs(Demand root) {
		List<List<Demand>> res = new ArrayList<>();
		List<Demand> curLevel = new ArrayList<>();
		curLevel.add(root);
		while (curLevel.size() > 0) {
			List<Demand> newLevel = new ArrayList<>();
			for (Demand req : curLevel) {
//				System.out.println(req.isLeaf);
				if (req instanceof CompositeDemand) {
					CompositeDemand creq = (CompositeDemand) req;
					for (Pair<Demand, Double> child: creq.children) {
						newLevel.add(child.getLeft());
					}
				}
			}
			res.add(curLevel);
			curLevel = newLevel;
		}
		return res;
	}
	
	public static List<List<Demand>> defaultDemands() {
		
		List<Demand> heaterOffs = Arrays.asList(
				new HeaterOff("rA"), new HeaterOff("rB"), new HeaterOff("rC"), new HeaterOff("rD"));
		
		List<Double> heaterOffWeights = Arrays.asList(
				0.25, 0.25, 0.25, 0.25);
		
		CompositeDemand heaterOff = new CompositeDemand(heaterOffs, heaterOffWeights);
		
		List<Demand> humidifierOffs = Arrays.asList(
				new HumidifierOff("rA"), new HumidifierOff("rB"), new HumidifierOff("rC"), new HumidifierOff("rD"));
		
		List<Double> humidifierOffWeights = Arrays.asList(
				0.25, 0.25, 0.25, 0.25);
		
		CompositeDemand humidifierOff = new CompositeDemand(humidifierOffs, humidifierOffWeights);
		
		List<Demand> lightOffs = Arrays.asList(
				new LightOff("hall"), new LightOff("c1"));
		
		List<Double> lightOffWeights = Arrays.asList(
				0.5, 0.5);
		
		CompositeDemand lightOff = new CompositeDemand(lightOffs, lightOffWeights);
		
		List<Demand> energyEfficiencies = Arrays.asList(heaterOff, humidifierOff, lightOff);
		List<Double> energyEfficiencyWeights = Arrays.asList(0.6, 0.3, 0.1);
		CompositeDemand energyEfficiency = new CompositeDemand(energyEfficiencies, energyEfficiencyWeights);
		
		List<Demand> temperatureHighs = Arrays.asList(
				new TemperatureHigh("rA"), new TemperatureHigh("rB"), new TemperatureHigh("rC"), new TemperatureHigh("rD"));
		
		List<Double> temperatureHighWeights = Arrays.asList(
				0.25, 0.25, 0.25, 0.25);
		
		CompositeDemand temperatureHigh = new CompositeDemand(temperatureHighs, temperatureHighWeights);
		
		List<Demand> humidityHighs = Arrays.asList(
				new HumidityHigh("rA"), new HumidityHigh("rB"), new HumidityHigh("rC"), new HumidityHigh("rD"));
		
		List<Double> humidityHighWeights = Arrays.asList(
				0.25, 0.25, 0.25, 0.25);
		
		CompositeDemand humidityHigh = new CompositeDemand(humidityHighs, humidityHighWeights);
		
		List<Demand> brightnessHighs = Arrays.asList(
				new BrightnessHigh("hall"), new BrightnessHigh("c1"), new BrightnessHigh("rA"),
				new BrightnessHigh("rB"), new BrightnessHigh("rC"), new BrightnessHigh("rD"));
		
		List<Double> brightnessHighWeights = Arrays.asList(
				0.1, 0.1, 0.2, 0.2, 0.2, 0.2);
		
		CompositeDemand brightnessHigh = new CompositeDemand(brightnessHighs, brightnessHighWeights);
		
		List<Demand> cleans = Arrays.asList(
				new Clean("hall"), new Clean("c1"), new Clean("p1"), new Clean("rA"), new Clean("rB"),
				new Clean("rC"), new Clean("rD"));
		
		List<Double> cleanWeights = Arrays.asList(
				0.1, 0.1, 0.1, 0.175, 0.175, 0.175, 0.175);
		
		CompositeDemand clean = new CompositeDemand(cleans, cleanWeights);
		
		List<Demand> isTidys = Arrays.asList(
				new IsTidy("elder_A"), new IsTidy("elder_B"), new IsTidy("elder_C"), new IsTidy("elder_D"));
		
		List<Double> isTidyWeights = Arrays.asList(0.25, 0.25, 0.25, 0.25);
		
		CompositeDemand isTidy = new CompositeDemand(isTidys, isTidyWeights);
		
		List<Demand> comforts = Arrays.asList(temperatureHigh, humidityHigh, brightnessHigh, clean, isTidy);
		List<Double> comfortWeights = Arrays.asList(0.2, 0.2, 0.2, 0.2, 0.2);
		CompositeDemand comfort = new CompositeDemand(comforts, comfortWeights);
		
		List<Demand> temperatureChecks = Arrays.asList(
				new IsTidy("elder_A"), new IsTidy("elder_B"), new IsTidy("elder_C"), new IsTidy("elder_D"));
		
		List<Double> temperatureCheckWeights = Arrays.asList(0.25, 0.25, 0.25, 0.25);
		
		CompositeDemand temperatureCheck = new CompositeDemand(temperatureChecks, temperatureCheckWeights);
		
		List<Demand> bloodOxygenChecks = Arrays.asList(
				new BloodOxygenChecked("elder_A"), new BloodOxygenChecked("elder_B"), 
				new BloodOxygenChecked("elder_C"), new BloodOxygenChecked("elder_D"));
		
		List<Double> bloodOxygenCheckWeights = Arrays.asList(0.25, 0.25, 0.25, 0.25);
		
		CompositeDemand bloodOxygenCheck = new CompositeDemand(bloodOxygenChecks, bloodOxygenCheckWeights);
		
		List<Demand> routineChecks = Arrays.asList(temperatureCheck, bloodOxygenCheck);
		List<Double> routineCheckWeights = Arrays.asList(0.5, 0.5);
		CompositeDemand routineCheck = new CompositeDemand(routineChecks, routineCheckWeights);
		
		List<Demand> glucoseMeasures = Arrays.asList(new GlucoseMeasured("diabetes_A"), new GlucoseMeasured("diabetes_B"));
		List<Double> glucoseMeasureWeights = Arrays.asList(0.5, 0.5);
		CompositeDemand glucoseMeasure = new CompositeDemand(glucoseMeasures, glucoseMeasureWeights);
		
		List<Demand> heartRateChecks = Arrays.asList(new HeartRateChecked("heart_attack_C"), new HeartRateChecked("heart_attack_D"));
		List<Double> heartRateCheckWeights = Arrays.asList(0.5, 0.5);
		CompositeDemand heartRateCheck = new CompositeDemand(heartRateChecks, heartRateCheckWeights);
		
		List<Demand> specialChecks = Arrays.asList(glucoseMeasure, heartRateCheck);
		List<Double> specialCheckWeights = Arrays.asList(0.5, 0.5);
		CompositeDemand specialCheck = new CompositeDemand(specialChecks, specialCheckWeights);
		
		List<Demand> insulinInjects = Arrays.asList(new InsulinInjected("diabetes_A"), new InsulinInjected("diabetes_B"));
		List<Double> insulinInjectWeights = Arrays.asList(0.5, 0.5);
		CompositeDemand insulinInject = new CompositeDemand(insulinInjects, insulinInjectWeights);
		
		List<Demand> aspirinTakens = Arrays.asList(new AspirinTaken("heart_attack_C"), new AspirinTaken("heart_attack_D"));
		List<Double> aspirinTakenWeights = Arrays.asList(0.5, 0.5);
		CompositeDemand aspirinTaken = new CompositeDemand(aspirinTakens, aspirinTakenWeights);
		
		List<Demand> medicineTakens = Arrays.asList(insulinInject, aspirinTaken);
		List<Double> medicineTakenWeights = Arrays.asList(0.5, 0.5);
		CompositeDemand medicineTaken = new CompositeDemand(medicineTakens, medicineTakenWeights);
		
		List<Demand> healthCares = Arrays.asList(routineCheck, specialCheck, medicineTaken);
		List<Double> healthCareWeights = Arrays.asList(0.35, 0.35, 0.3);
		CompositeDemand healthCare = new CompositeDemand(healthCares, healthCareWeights);
		
		List<Demand> elderSatisfactions = Arrays.asList(comfort, healthCare);
		List<Double> elderSatisfactionWeights = Arrays.asList(0.45, 0.55);
		CompositeDemand elderSatisfaction = new CompositeDemand(elderSatisfactions, elderSatisfactionWeights);
		
		List<Demand> careWorkerSatisfactions = Arrays.asList(new CareWorkerLoad());
		List<Double> careWorkerSatisfactionWeights = Arrays.asList(0.95);
		CompositeDemand careWorkerSatisfaction = new CompositeDemand(careWorkerSatisfactions, careWorkerSatisfactionWeights);
		
		List<Demand> roots = Arrays.asList(energyEfficiency, elderSatisfaction, careWorkerSatisfaction);
		List<Double> rootWeights = Arrays.asList(0.15, 0.75, 0.1);
		CompositeDemand root = new CompositeDemand(roots, rootWeights);
		
		return bfs(root);
	}
}
