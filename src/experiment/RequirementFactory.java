package experiment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;
import org.json.*;

import smart_office.Clazz;
import smart_office.Door;
import smart_office.Room;
import smart_office.SmartOffice;

public class RequirementFactory {
	
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

	public static abstract class Requirement {

		public abstract double eval(final SmartOffice smartOffice, boolean propagation) throws Exception;
	}

	public static abstract class ObservableRequirement extends Requirement {

		@Override
		public double eval(final SmartOffice smartOffice, boolean propagation) throws Exception {
			if (propagation) {
				int dis = propagationDistance(smartOffice);
				return dis < 0 ? 0.0 : Math.pow(PROPAGATION_RATE, dis);
			}
			return satisfied(smartOffice) ? 1.0 : 0.0;
		}
		
		abstract boolean satisfied(final SmartOffice smartOffice) throws Exception;
		
		int propagationDistance(final SmartOffice smartOffice) throws Exception {
			return satisfied(smartOffice) ? 0 : -1;
		}
	}
	
	public static class CompositeRequirement extends Requirement {
		
		List<Pair<Requirement, Double>> children = new ArrayList<>();

		public CompositeRequirement(List<Requirement> children, List<Double> weights) {
			for (int i = 0; i < children.size(); i ++) {
				this.children.add(new Pair<>(children.get(i), weights.get(i)));
			}
		}
		
		public CompositeRequirement(List<Pair<Requirement, Double>> children) {
			this.children = children;
		}

		@Override
		public double eval(SmartOffice smartOffice, boolean propagation) throws Exception {
			double res = 0;
			for (Pair<Requirement, Double> child : children) {
				res += child.getLeft().eval(smartOffice, propagation) * child.getRight();
			}
			return res;
		}
		
	}



	public static abstract class SingleRoomRequirement extends ObservableRequirement {

		String roomName;

		public SingleRoomRequirement(String roomName) {
			this.roomName = roomName;
		}

		@Override
		public boolean satisfied(SmartOffice smartOffice) throws Exception {
			// TODO Auto-generated method stub
			List<Room> rooms = new ArrayList<Room>();
			for (Clazz clazz : smartOffice.getClazz()) {
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
	
	public static class HeaterOff extends SingleRoomRequirement {

		public HeaterOff(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return !room.getHeater().isOn();
		}

	}

	public static class LightOff extends SingleRoomRequirement {

		public LightOff(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return !room.getLight().isOn();
		}

	}

	public static class TemperatureHigh extends SingleRoomRequirement {

		public TemperatureHigh(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return !room.getTemperature().getValue().equals("low");
		}

	}

	public static class BrightnessHigh extends SingleRoomRequirement {

		public BrightnessHigh(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return !room.getBrightness().getValue().equals("low");
		}

	}

	public static class NoRoomba extends SingleRoomRequirement {

		public NoRoomba(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return room.getRoomba().size() == 0;
		}

	}

	public static class AssetCollected extends SingleRoomRequirement {

		public AssetCollected(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return room.getPrinter().get(0).getAsset() == null;
		}

		@Override
		int propagationDistance(SmartOffice smartOffice) throws Exception {
			List<Room> rooms = new ArrayList<Room>();
			for (Clazz clazz : smartOffice.getClazz()) {
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
			queue.offer(new Pair<Room, Integer>(st, 1));
			while (!queue.isEmpty()) {
				Pair<Room, Integer> pair = queue.remove();
				Room cur = pair.getLeft();
				int dis = pair.getRight();
				if (cur.getSecretary().size() > 0) return dis;
				
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

	public static class Clean extends SingleRoomRequirement {

		public Clean(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return !room.getCleanness().getValue().equals("dirty");
		}

		@Override
		int propagationDistance(SmartOffice smartOffice) throws Exception {
			List<Room> rooms = new ArrayList<Room>();
			for (Clazz clazz : smartOffice.getClazz()) {
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

	public static class WithSecretary extends SingleRoomRequirement {

		public WithSecretary(String roomName) {
			super(roomName);
			// TODO Auto-generated constructor stub
		}

		@Override
		boolean func(Room room) {
			return room.getSecretary().size() > 0;
		}
		
		@Override
		int propagationDistance(SmartOffice smartOffice) throws Exception {
			List<Room> rooms = new ArrayList<Room>();
			for (Clazz clazz : smartOffice.getClazz()) {
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
			
			Set<String> names = new HashSet<String>();
			Queue<Pair<Room, Integer>> queue = new LinkedList<Pair<Room, Integer>>();
			names.add(st.getName());
			queue.offer(new Pair<Room, Integer>(st, 0));
			while (!queue.isEmpty()) {
				Pair<Room, Integer> pair = queue.remove();
				Room cur = pair.getLeft();
				int dis = pair.getRight();
				if (func(cur)) return dis;
				
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

	
//	public static CompositeRequirement root = new CompositeRequirement(
//			Arrays.asList(assetCollected, clean, withSecretary), 
//			Arrays.asList(0.3, 0.3, 0.4)
//		);
	
	private static List<List<Requirement>> bfs(Requirement root) {
		List<List<Requirement>> res = new ArrayList<>();
		List<Requirement> curLevel = new ArrayList<>();
		curLevel.add(root);
		while (curLevel.size() > 0) {
			List<Requirement> newLevel = new ArrayList<>();
			for (Requirement req : curLevel) {
//				System.out.println(req.isLeaf);
				if (req instanceof CompositeRequirement) {
					CompositeRequirement creq = (CompositeRequirement) req;
					for (Pair<Requirement, Double> child: creq.children) {
						newLevel.add(child.getLeft());
					}
				}
			}
			res.add(curLevel);
			curLevel = newLevel;
		}
		return res;
	}
	
	public static List<List<Requirement>> defaultRequirements() {
		
		List<Requirement> heaterOffs = Arrays.asList(
			new HeaterOff("pr2"), new HeaterOff("pr4"), new HeaterOff("pr6"), new HeaterOff("pr8"), 
			new HeaterOff("pr12"), new HeaterOff("phda"), new HeaterOff("st"), new HeaterOff("bf"), 
			new HeaterOff("phdb"), new HeaterOff("sec"), new HeaterOff("chr")
	    );

		List<Double> heaterOffsWeights = Arrays.asList(
			0.05, 0.05, 0.05, 0.05, 
			0.05, 0.1, 0.1, 0.2, 
			0.1, 0.1, 0.15
		);
		
		List<Requirement> lightOffs = Arrays.asList(
			new LightOff("pr1"), new LightOff("pr3"), new LightOff("pr5"), new LightOff("pr9"), 
			new LightOff("pr11"), new LightOff("pr13"), new LightOff("bd"), new LightOff("bm"), 
			new LightOff("maestro"), new LightOff("meet"), new LightOff("rec"), new LightOff("lab")
	    );
		List<Double> lightOffsWeights = Arrays.asList(
			0.05, 0.05, 0.05, 0.05, 
			0.05, 0.05, 0.1, 0.1, 
			0.2, 0.1, 0.1, 0.1
		);
		
		List<Requirement> temperatureHighs = Arrays.asList(
			new TemperatureHigh("pr7"), new TemperatureHigh("pr10")
		);
		List<Double> temperatureHighsWeights = Arrays.asList(0.6, 0.4);
		
		List<Requirement> brightnessHighs = Arrays.asList(
			new BrightnessHigh("pr7"), new BrightnessHigh("pr14")
		);
		List<Double> brightnessHighsWeights = Arrays.asList(0.3, 0.7);
		
		List<Requirement> noRoombas = Arrays.asList(
			new NoRoomba("pr7"), new NoRoomba("pr10"), new NoRoomba("pr14"), new NoRoomba("srv")
		);
		List<Double> noRoombasWeights = Arrays.asList(0.25, 0.25, 0.25, 0.25);
		
		List<Requirement> assetCollecteds = Arrays.asList(
			new AssetCollected("prt1"), new AssetCollected("prt2"), new AssetCollected("prt3")
		);
		List<Double> assetCollectedsWeights = Arrays.asList(0.3, 0.4, 0.3);
		
		List<Requirement> cleans = Arrays.asList(
			new Clean("pr7"), new Clean("pr10"), new Clean("pr14")
		);
		List<Double> cleansWeights = Arrays.asList(0.2, 0.5, 0.3);
		
		List<Requirement> withSecretarys = Arrays.asList(
			new WithSecretary("srv")
		);
		List<Double> withSecretarysWeights = Arrays.asList(1.0);
		
		CompositeRequirement heaterOff = new CompositeRequirement(heaterOffs, heaterOffsWeights);
		CompositeRequirement lightOff = new CompositeRequirement(lightOffs, lightOffsWeights);
		CompositeRequirement temperatureHigh = new CompositeRequirement(temperatureHighs, temperatureHighsWeights);
		CompositeRequirement brightnessHigh = new CompositeRequirement(brightnessHighs, brightnessHighsWeights);
		CompositeRequirement noRoomba = new CompositeRequirement(noRoombas, noRoombasWeights);
		CompositeRequirement assetCollected = new CompositeRequirement(assetCollecteds, assetCollectedsWeights);
		CompositeRequirement clean = new CompositeRequirement(cleans, cleansWeights);
		CompositeRequirement withSecretary = new CompositeRequirement(withSecretarys, withSecretarysWeights);
		
		CompositeRequirement security = new CompositeRequirement(
			Arrays.asList(noRoomba, assetCollected, withSecretary), 
			Arrays.asList(0.5, 0.2, 0.3)
		);
		
		CompositeRequirement energyEfficiency = new CompositeRequirement(
			Arrays.asList(heaterOff, lightOff), 
			Arrays.asList(0.7, 0.3)
		);
		
		CompositeRequirement usability = new CompositeRequirement(
			Arrays.asList(temperatureHigh, brightnessHigh, clean), 
			Arrays.asList(0.3, 0.3, 0.4)
		);
		
		CompositeRequirement root = new CompositeRequirement(
			Arrays.asList(security, energyEfficiency, usability), 
			Arrays.asList(0.5, 0.1, 0.4)
		);
		
		return bfs(root);
		
//		List<List<Requirement>> levels = new ArrayList<>();
//		List<Requirement> leaves = new ArrayList<>();
//		List<Requirement> level2 = new ArrayList<>();
//		List<Requirement> level1 = new ArrayList<>();
//		List<Requirement> top = new ArrayList<>();
//		
//		leaves.addAll(heaterOffs);
//		leaves.addAll(lightOffs);
//		leaves.addAll(temperatureHighs);
//		leaves.addAll(brightnessHighs);
//		leaves.addAll(noRoombas);
//		leaves.addAll(assetCollecteds);
//		leaves.addAll(cleans);
//		leaves.addAll(withSecretarys);
//		
//		level2.add(heaterOff);
//		level2.add(lightOff);
//		level2.add(temperatureHigh);
//		level2.add(brightnessHigh);
//		level2.add(noRoomba);
//		level2.add(assetCollected);
//		level2.add(clean);
//		level2.add(withSecretary);
//		
//		level1.add(security);
//		level1.add(energyEfficiency);
//		level1.add(usability);
//		
//		top.add(root);
//		
//		levels.addAll(Arrays.asList(top, level1, level2, leaves));
//		return levels;
	}
	
	private static Pair<Requirement, Double> jsonToReq(JSONObject obj, String fatherType) throws Exception {
		JSONArray subs = obj.getJSONArray("subs");
		String name = obj.getString("name");
		Double weight = obj.getDouble("weight");
		if (subs.length() == 0) {
			switch(fatherType) {
				case "noRoomba":
					return new Pair<>(new NoRoomba(name), weight);
				case "assetCollected":
					return new Pair<>(new AssetCollected(name), weight);
				case "withSecretary":
					return new Pair<>(new WithSecretary(name), weight);
				case "heaterOff":
					return new Pair<>(new HeaterOff(name), weight);
				case "lightOff":
					return new Pair<>(new LightOff(name), weight);
				case "temperatureHigh":
					return new Pair<>(new TemperatureHigh(name), weight);
				case "brightnessHigh":
					return new Pair<>(new BrightnessHigh(name), weight);
				case "clean":
					return new Pair<>(new Clean(name), weight);
				default:
					throw new Exception("Unknown requirement type.");
			}
		} else {
			List<Pair<Requirement, Double>> children = new ArrayList<>();
			for (Object sub : subs) {
				JSONObject subObj = (JSONObject) sub;
				children.add(jsonToReq(subObj, name));
			}
			Requirement r = new CompositeRequirement(children);
			return new Pair<>(r, weight);
		}
	}
	
	public static List<List<Requirement>> fromFile(String path) {
		String content;
		try {
			content = new String(Files.readAllBytes(Paths.get(path)));
			JSONObject rootGoal = new JSONObject(content);
			Pair<Requirement, Double> req = jsonToReq(rootGoal, null);
			return bfs(req.getLeft());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String []args) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get("/Users/liboyuan/repos/CPS_experiment/case_generator/1543846873305/goal.json")));
		JSONObject rootGoal = new JSONObject(content);
		System.out.println(rootGoal.getJSONArray("subs"));
	}
}
