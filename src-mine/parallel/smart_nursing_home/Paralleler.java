package parallel.smart_nursing_home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.problem.solution.variable.ITransformationVariable;
import parallel.util.Action;
import parallel.util.Fact;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class Paralleler {

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
	
	private ArrayList<Fact> initialState;
	private ArrayList<Action> actionsList;
	private HashSet<Pair<Action, Action>> mutexFactsList;
	private int executionTime = 20;
	private static final Paralleler pl = new Paralleler();
	
	
	private Paralleler() {
		this.initialState = initSystemState();
		this.actionsList = initActions();
		
		HashSet<Pair<Fact, Fact>> mutexFactsList = computeMutexFacts(initialState, actionsList);
		this.mutexFactsList = computeMutexActions(mutexFactsList, actionsList);
	}
	
	public ArrayList<Fact> initSystemState() {
		ArrayList<Fact> systemState = new ArrayList<Fact>();
		
		// from the xmi file
		// hall
		systemState.add(new HaveFact("hall", "light_hall"));
		systemState.add(new IsFact("light_hall", "off"));
		systemState.add(new HaveFact("hall", "brightness_hall"));
		systemState.add(new IsFact("brightness_hall", "high"));
		systemState.add(new HaveFact("hall", "humidifier_hall"));
		systemState.add(new IsFact("humidifier_hall", "off"));
		systemState.add(new HaveFact("hall","humidity_hall"));
		systemState.add(new IsFact("humidity_hall", "low"));
		systemState.add(new HaveFact("hall", "heater_hall"));
		systemState.add(new IsFact("heater_hall", "off"));
		systemState.add(new HaveFact("hall", "temperature_hall"));
		systemState.add(new IsFact("temperature_hall", "low"));
		systemState.add(new HaveFact("hall", "window_hall"));
		systemState.add(new IsFact("window_hall", "on"));
		systemState.add(new HaveFact("hall", "cleanness_hall"));
		systemState.add(new IsFact("cleanness_hall", "dirty"));
		
		// cW
		systemState.add(new HaveFact("hall", "cW1"));
		systemState.add(new HaveFact("cW1", "hall"));
		systemState.add(new HaveFact("hall", "cW2"));
		systemState.add(new HaveFact("cW2", "hall"));
		
		// roomba
		systemState.add(new HaveFact("hall", "roomba_1"));
		systemState.add(new HaveFact("roomba_1", "hall"));
		systemState.add(new HaveFact("hall", "roomba_2"));
		systemState.add(new HaveFact("roomba_2", "hall"));
		systemState.add(new HaveFact("hall", "roomba_3"));
		systemState.add(new HaveFact("roomba_3", "hall"));
		systemState.add(new HaveFact("hall", "roomba_4"));
		systemState.add(new HaveFact("roomba_4", "hall"));
		
		// door_hall_pass1
		systemState.add(new HaveFact("hall", "door_hall_pass1"));
		systemState.add(new HaveFact("door_hall_pass1", "hall"));
		systemState.add(new HaveFact("pass1", "door_hall_pass1"));
		systemState.add(new HaveFact("door_hall_pass1", "pass1"));
		
		// c1
		systemState.add(new HaveFact("c1", "light_c1"));
		systemState.add(new IsFact("light_c1", "off"));
		systemState.add(new HaveFact("c1", "brightness_c1"));
		systemState.add(new IsFact("brightness_c1", "high"));
		systemState.add(new HaveFact("c1", "humidifier_c1"));
		systemState.add(new IsFact("humidifier_c1", "off"));
		systemState.add(new HaveFact("c1","humidity_c1"));
		systemState.add(new IsFact("humidity_c1", "low"));
		systemState.add(new HaveFact("c1", "heater_c1"));
		systemState.add(new IsFact("heater_c1", "off"));
		systemState.add(new HaveFact("c1", "temperature_c1"));
		systemState.add(new IsFact("temperature_c1", "low"));
		systemState.add(new HaveFact("c1", "window_c1"));
		systemState.add(new IsFact("window_c1", "on"));
		systemState.add(new HaveFact("c1", "cleanness_c1"));
		systemState.add(new IsFact("cleanness_c1", "dirty"));
		
		// door_c1_pass1
		systemState.add(new HaveFact("c1", "door_c1_pass1"));
		systemState.add(new HaveFact("door_c1_pass1", "c1"));
		systemState.add(new HaveFact("pass1", "door_c1_pass1"));
		systemState.add(new HaveFact("door_c1_pass1", "pass1"));
		
		// p1
		systemState.add(new HaveFact("p1", "light_p1"));
		systemState.add(new IsFact("light_p1", "off"));
		systemState.add(new HaveFact("p1", "brightness_p1"));
		systemState.add(new IsFact("brightness_p1", "high"));
		systemState.add(new HaveFact("p1", "cleanness_p1"));
		systemState.add(new IsFact("cleanness_p1", "dirty"));
		
		// door_p1_pass1
		systemState.add(new HaveFact("p1", "door_p1_pass1"));
		systemState.add(new HaveFact("door_p1_pass1", "p1"));
		systemState.add(new HaveFact("pass1", "door_p1_pass1"));
		systemState.add(new HaveFact("door_p1_pass1", "pass1"));
		
		// pass1
		systemState.add(new HaveFact("pass1", "cleanness_pass1"));
		systemState.add(new IsFact("cleanness_pass1", "dirty"));
		
		// door_pass1_l1
		systemState.add(new HaveFact("pass1", "door_pass1_l1"));
		systemState.add(new HaveFact("door_pass1_l1", "pass1"));
		systemState.add(new HaveFact("l1", "door_pass1_l1"));
		systemState.add(new HaveFact("door_pass1_l1", "l1"));
		
		// door_pass1_l2
		systemState.add(new HaveFact("pass1", "door_pass1_l2"));
		systemState.add(new HaveFact("door_pass1_l2", "pass1"));
		systemState.add(new HaveFact("l2", "door_pass1_l2"));
		systemState.add(new HaveFact("door_pass1_l2", "l2"));
		
		// rA
		systemState.add(new HaveFact("rA", "light_rA"));
		systemState.add(new IsFact("light_rA", "off"));
		systemState.add(new HaveFact("rA", "brightness_rA"));
		systemState.add(new IsFact("brightness_rA", "high"));
		systemState.add(new HaveFact("rA", "humidifier_rA"));
		systemState.add(new IsFact("humidifier_rA", "off"));
		systemState.add(new HaveFact("rA","humidity_rA"));
		systemState.add(new IsFact("humidity_rA", "low"));
		systemState.add(new HaveFact("rA", "heater_rA"));
		systemState.add(new IsFact("heater_rA", "off"));
		systemState.add(new HaveFact("rA", "temperature_rA"));
		systemState.add(new IsFact("temperature_rA", "low"));
		systemState.add(new HaveFact("rA", "window_rA"));
		systemState.add(new IsFact("window_rA", "on"));
		systemState.add(new HaveFact("rA", "cleanness_rA"));
		systemState.add(new IsFact("cleanness_rA", "dirty"));
		
		// door_rA_pass2
		systemState.add(new HaveFact("rA", "door_rA_pass2"));
		systemState.add(new HaveFact("door_rA_pass2", "rA"));
		systemState.add(new HaveFact("pass2", "door_rA_pass2"));
		systemState.add(new HaveFact("door_rA_pass2", "pass2"));
		
		// elder_A
		systemState.add(new HaveFact("elder_A", "rA"));
		systemState.add(new HaveFact("rA", "elder_A"));
		systemState.add(new HaveFact("elder_A", "bySelf_A"));
		systemState.add(new IsFact("bySelf_A", "true"));
		systemState.add(new HaveFact("elder_A", "temperatureCheck_A"));
		systemState.add(new IsFact("temperatureCheck_A", "false"));
		systemState.add(new HaveFact("elder_A", "bloodOxygenCheck_A"));
		systemState.add(new IsFact("bloodOxygenCheck_A", "false"));
		
		// diabetes_A
		systemState.add(new HaveFact("elder_A", "diabetes_A"));
		systemState.add(new HaveFact("diabetes_A", "glucoseMeasured_A"));
		systemState.add(new IsFact("glucoseMeasured_A", "false"));
		systemState.add(new HaveFact("diabetes_A", "insulinInjected_A"));
		systemState.add(new IsFact("insulinInjected_A", "false"));
		
		// rB
		systemState.add(new HaveFact("rB", "light_rB"));
		systemState.add(new IsFact("light_rB", "off"));
		systemState.add(new HaveFact("rB", "brightness_rB"));
		systemState.add(new IsFact("brightness_rB", "high"));
		systemState.add(new HaveFact("rB", "humidifier_rB"));
		systemState.add(new IsFact("humidifier_rB", "off"));
		systemState.add(new HaveFact("rB","humidity_rB"));
		systemState.add(new IsFact("humidity_rB", "low"));
		systemState.add(new HaveFact("rB", "heater_rB"));
		systemState.add(new IsFact("heater_rB", "off"));
		systemState.add(new HaveFact("rB", "temperature_rB"));
		systemState.add(new IsFact("temperature_rB", "low"));
		systemState.add(new HaveFact("rB", "window_rB"));
		systemState.add(new IsFact("window_rB", "on"));
		systemState.add(new HaveFact("rB", "cleanness_rB"));
		systemState.add(new IsFact("cleanness_rB", "dirty"));
		
		// door_rB_pass2
		systemState.add(new HaveFact("rB", "door_rB_pass2"));
		systemState.add(new HaveFact("door_rB_pass2", "rB"));
		systemState.add(new HaveFact("pass2", "door_rB_pass2"));
		systemState.add(new HaveFact("door_rB_pass2", "pass2"));
		
		// elder_B
		systemState.add(new HaveFact("elder_B", "rB"));
		systemState.add(new HaveFact("rB", "elder_B"));
		systemState.add(new HaveFact("elder_B", "bySelf_B"));
		systemState.add(new IsFact("bySelf_B", "false"));
		systemState.add(new HaveFact("elder_B", "temperatureCheck_B"));
		systemState.add(new IsFact("temperatureCheck_B", "false"));
		systemState.add(new HaveFact("elder_B", "bloodOxygenCheck_B"));
		systemState.add(new IsFact("bloodOxygenCheck_B", "false"));
		
		// diabetes_B
		systemState.add(new HaveFact("elder_B", "diabetes_B"));
		systemState.add(new HaveFact("diabetes_B", "glucoseMeasured_B"));
		systemState.add(new IsFact("glucoseMeasured_B", "false"));
		systemState.add(new HaveFact("diabetes_B", "insulinInjected_B"));
		systemState.add(new IsFact("insulinInjected_B", "false"));
		
		// rC
		systemState.add(new HaveFact("rC", "light_rC"));
		systemState.add(new IsFact("light_rC", "off"));
		systemState.add(new HaveFact("rC", "brightness_rC"));
		systemState.add(new IsFact("brightness_rC", "high"));
		systemState.add(new HaveFact("rC", "humidifier_rC"));
		systemState.add(new IsFact("humidifier_rC", "off"));
		systemState.add(new HaveFact("rC","humidity_rC"));
		systemState.add(new IsFact("humidity_rC", "low"));
		systemState.add(new HaveFact("rC", "heater_rC"));
		systemState.add(new IsFact("heater_rC", "off"));
		systemState.add(new HaveFact("rC", "temperature_rC"));
		systemState.add(new IsFact("temperature_rC", "low"));
		systemState.add(new HaveFact("rC", "window_rC"));
		systemState.add(new IsFact("window_rC", "on"));
		systemState.add(new HaveFact("rC", "cleanness_rC"));
		systemState.add(new IsFact("cleanness_rC", "dirty"));
		
		// door_rC_pass2
		systemState.add(new HaveFact("rC", "door_rC_pass2"));
		systemState.add(new HaveFact("door_rC_pass2", "rC"));
		systemState.add(new HaveFact("pass2", "door_rC_pass2"));
		systemState.add(new HaveFact("door_rC_pass2", "pass2"));
		
		// elder_C
		systemState.add(new HaveFact("elder_C", "rC"));
		systemState.add(new HaveFact("rC", "elder_C"));
		systemState.add(new HaveFact("elder_C", "bySelf_C"));
		systemState.add(new IsFact("bySelf_C", "true"));
		systemState.add(new HaveFact("elder_C", "temperatureCheck_C"));
		systemState.add(new IsFact("temperatureCheck_C", "false"));
		systemState.add(new HaveFact("elder_C", "bloodOxygenCheck_C"));
		systemState.add(new IsFact("bloodOxygenCheck_C", "false"));
		
		// heart_attack_C
		systemState.add(new HaveFact("elder_C", "heart_attack_C"));
		systemState.add(new HaveFact("heart_attack_C", "heartRateCheck_C"));
		systemState.add(new IsFact("heartRateCheck_C", "false"));
		systemState.add(new HaveFact("heart_attack_C", "aspirinTaken_C"));
		systemState.add(new IsFact("aspirinTaken_C", "false"));
		
		// rD
		systemState.add(new HaveFact("rD", "light_rD"));
		systemState.add(new IsFact("light_rD", "off"));
		systemState.add(new HaveFact("rD", "brightness_rD"));
		systemState.add(new IsFact("brightness_rD", "high"));
		systemState.add(new HaveFact("rD", "humidifier_rD"));
		systemState.add(new IsFact("humidifier_rD", "off"));
		systemState.add(new HaveFact("rD","humidity_rD"));
		systemState.add(new IsFact("humidity_rD", "low"));
		systemState.add(new HaveFact("rD", "heater_rD"));
		systemState.add(new IsFact("heater_rD", "off"));
		systemState.add(new HaveFact("rD", "temperature_rD"));
		systemState.add(new IsFact("temperature_rD", "low"));
		systemState.add(new HaveFact("rD", "window_rD"));
		systemState.add(new IsFact("window_rD", "on"));
		systemState.add(new HaveFact("rD", "cleanness_rD"));
		systemState.add(new IsFact("cleanness_rD", "dirty"));
		
		// door_rD_pass2
		systemState.add(new HaveFact("rD", "door_rD_pass2"));
		systemState.add(new HaveFact("door_rD_pass2", "rD"));
		systemState.add(new HaveFact("pass2", "door_rD_pass2"));
		systemState.add(new HaveFact("door_rD_pass2", "pass2"));
		
		// elder_D
		systemState.add(new HaveFact("elder_D", "rD"));
		systemState.add(new HaveFact("rD", "elder_D"));
		systemState.add(new HaveFact("elder_D", "bySelf_D"));
		systemState.add(new IsFact("bySelf_D", "false"));
		systemState.add(new HaveFact("elder_D", "temperatureCheck_D"));
		systemState.add(new IsFact("temperatureCheck_D", "false"));
		systemState.add(new HaveFact("elder_D", "bloodOxygenCheck_D"));
		systemState.add(new IsFact("bloodOxygenCheck_D", "false"));
		
		// heart_attack_D
		systemState.add(new HaveFact("elder_D", "heart_attack_D"));
		systemState.add(new HaveFact("heart_attack_D", "heartRateCheck_D"));
		systemState.add(new IsFact("heartRateCheck_D", "false"));
		systemState.add(new HaveFact("heart_attack_D", "aspirinTaken_D"));
		systemState.add(new IsFact("aspirinTaken_D", "false"));
		
		// b1
		systemState.add(new HaveFact("b1", "light_b1"));
		systemState.add(new IsFact("light_b1", "off"));
		systemState.add(new HaveFact("b1", "brightness_b1"));
		systemState.add(new IsFact("brightness_b1", "high"));
		
		// door_b1_pass2
		systemState.add(new HaveFact("b1", "door_b1_pass2"));
		systemState.add(new HaveFact("door_b1_pass2", "b1"));
		systemState.add(new HaveFact("pass2", "door_b1_pass2"));
		systemState.add(new HaveFact("door_b1_pass2", "pass2"));
		
		// pass2
		systemState.add(new HaveFact("pass2", "cleanness_pass2"));
		systemState.add(new IsFact("cleanness_pass2", "dirty"));
		
		// door_pass2_l1
		systemState.add(new HaveFact("pass2", "door_pass2_l1"));
		systemState.add(new HaveFact("door_pass2_l1", "pass2"));
		systemState.add(new HaveFact("l1", "door_pass2_l1"));
		systemState.add(new HaveFact("door_pass2_l1", "l1"));
		
		// door_pass2_l2
		systemState.add(new HaveFact("pass2", "door_pass2_l2"));
		systemState.add(new HaveFact("door_pass2_l2", "pass2"));
		systemState.add(new HaveFact("l2", "door_pass2_l2"));
		systemState.add(new HaveFact("door_pass2_l2", "l2"));
		
		// l1
		systemState.add(new HaveFact("l1", "cleanness_l1"));
		systemState.add(new IsFact("cleanness_l1", "dirty"));
		
		// l2
		systemState.add(new HaveFact("l2", "cleanness_l2"));
		systemState.add(new IsFact("cleanness_l2", "dirty"));

		return systemState;
	}
	
	public ArrayList<Action> initActions() {
		ArrayList<Action> actionsList = new ArrayList<Action>();
		
		// rule lightOn
		actionsList.add(new LightOnAction("hall", "light_hall", "brightness_hall"));
		actionsList.add(new LightOnAction("c1", "light_c1", "brightness_c1"));
		actionsList.add(new LightOnAction("p1", "light_p1", "brightness_p1"));
		actionsList.add(new LightOnAction("rA", "light_rA", "brightness_rA"));
		actionsList.add(new LightOnAction("rB", "light_rB", "brightness_rB"));
		actionsList.add(new LightOnAction("rC", "light_rC", "brightness_rC"));
		actionsList.add(new LightOnAction("rD", "light_rD", "brightness_rD"));
		actionsList.add(new LightOnAction("b1", "light_b1", "brightness_b1"));
		
		// rule lightOff
		actionsList.add(new LightOffAction("hall", "light_hall", "brightness_hall"));
		actionsList.add(new LightOffAction("c1", "light_c1", "brightness_c1"));
		actionsList.add(new LightOffAction("p1", "light_p1", "brightness_p1"));
		actionsList.add(new LightOffAction("rA", "light_rA", "brightness_rA"));
		actionsList.add(new LightOffAction("rB", "light_rB", "brightness_rB"));
		actionsList.add(new LightOffAction("rC", "light_rC", "brightness_rC"));
		actionsList.add(new LightOffAction("rD", "light_rD", "brightness_rD"));
		actionsList.add(new LightOffAction("b1", "light_b1", "brightness_b1"));
		
		// rule windowOn
		actionsList.add(new WindowOnAction("hall", "window_hall", "brightness_hall", "humidity_hall", "temperature_hall"));
		actionsList.add(new WindowOnAction("c1", "window_c1", "brightness_c1", "humidity_c1", "temperature_c1"));
		actionsList.add(new WindowOnAction("rA", "window_rA", "brightness_rA", "humidity_rA", "temperature_rA"));
		actionsList.add(new WindowOnAction("rB", "window_rB", "brightness_rB", "humidity_rB", "temperature_rB"));
		actionsList.add(new WindowOnAction("rC", "window_rC", "brightness_rC", "humidity_rC", "temperature_rC"));
		actionsList.add(new WindowOnAction("rD", "window_rD", "brightness_rD", "humidity_rD", "temperature_rD"));
		
		// rule windowOff
		actionsList.add(new WindowOffAction("hall", "window_hall", "brightness_hall", "humidity_hall", "temperature_hall"));
		actionsList.add(new WindowOffAction("c1", "window_c1", "brightness_c1", "humidity_c1", "temperature_c1"));
		actionsList.add(new WindowOffAction("rA", "window_rA", "brightness_rA", "humidity_rA", "temperature_rA"));
		actionsList.add(new WindowOffAction("rB", "window_rB", "brightness_rB", "humidity_rB", "temperature_rB"));
		actionsList.add(new WindowOffAction("rC", "window_rC", "brightness_rC", "humidity_rC", "temperature_rC"));
		actionsList.add(new WindowOffAction("rD", "window_rD", "brightness_rD", "humidity_rD", "temperature_rD"));
		
		// rule heaterOn
		actionsList.add(new HeaterOnAction("hall", "heater_hall", "temperature_hall"));
		actionsList.add(new HeaterOnAction("c1", "heater_c1", "temperature_c1"));
		actionsList.add(new HeaterOnAction("rA", "heater_rA", "temperature_rA"));
		actionsList.add(new HeaterOnAction("rB", "heater_rB", "temperature_rB"));
		actionsList.add(new HeaterOnAction("rC", "heater_rC", "temperature_rC"));
		actionsList.add(new HeaterOnAction("rD", "heater_rD", "temperature_rD"));
		
		// rule heaterOff
		actionsList.add(new HeaterOffAction("hall", "heater_hall", "temperature_hall"));
		actionsList.add(new HeaterOffAction("c1", "heater_c1", "temperature_c1"));
		actionsList.add(new HeaterOffAction("rA", "heater_rA", "temperature_rA"));
		actionsList.add(new HeaterOffAction("rB", "heater_rB", "temperature_rB"));
		actionsList.add(new HeaterOffAction("rC", "heater_rC", "temperature_rC"));
		actionsList.add(new HeaterOffAction("rD", "heater_rD", "temperature_rD"));
		
		// rule humidifierOn
		actionsList.add(new HumidifierOnAction("hall", "humidifier_hall", "humidity_hall"));
		actionsList.add(new HumidifierOnAction("c1", "humidifier_c1", "humidity_c1"));
		actionsList.add(new HumidifierOnAction("rA", "humidifier_rA", "humidity_rA"));
		actionsList.add(new HumidifierOnAction("rB", "humidifier_rB", "humidity_rB"));
		actionsList.add(new HumidifierOnAction("rC", "humidifier_rC", "humidity_rC"));
		actionsList.add(new HumidifierOnAction("rD", "humidifier_rD", "humidity_rD"));
		
		// rule humidifierOff
		actionsList.add(new HumidifierOffAction("hall", "humidifier_hall", "humidity_hall"));
		actionsList.add(new HumidifierOffAction("c1", "humidifier_c1", "humidity_c1"));
		actionsList.add(new HumidifierOffAction("rA", "humidifier_rA", "humidity_rA"));
		actionsList.add(new HumidifierOffAction("rB", "humidifier_rB", "humidity_rB"));
		actionsList.add(new HumidifierOffAction("rC", "humidifier_rC", "humidity_rC"));
		actionsList.add(new HumidifierOffAction("rD", "humidifier_rD", "humidity_rD"));
		
		// Set for elders and careWorkers
		String[] elderSet = {"elder_A", "elder_B", "elder_C", "elder_D"};
		String[] careWorkerSet = {"cW1", "cW2"};
		
		// Set for diabetes and heart attack
		String[] diabetesPatients = {"elder_A", "elder_B"};
		String[] heartAttackPatients = {"elder_C", "elder_D"};
		
		// rule elderEnter
		for(String elder : elderSet) {
			actionsList.add(new ElderEnterAction("hall", "door_hall_pass1", "pass1", elder));
			actionsList.add(new ElderEnterAction("pass1", "door_hall_pass1", "hall", elder));
			actionsList.add(new ElderEnterAction("c1", "door_c1_pass1", "pass1", elder));
			actionsList.add(new ElderEnterAction("pass1", "door_c1_pass1", "c1", elder));
			actionsList.add(new ElderEnterAction("p1", "door_p1_pass1", "pass1", elder));
			actionsList.add(new ElderEnterAction("pass1", "door_p1_pass1", "p1", elder));
			actionsList.add(new ElderEnterAction("pass1", "door_pass1_l1", "l1", elder));
			actionsList.add(new ElderEnterAction("l1", "door_pass1_l1", "pass1", elder));
			actionsList.add(new ElderEnterAction("pass1", "door_pass1_l2", "l2", elder));
			actionsList.add(new ElderEnterAction("l2", "door_pass1_l2", "pass1", elder));
			actionsList.add(new ElderEnterAction("rA", "door_rA_pass2", "pass2", elder));
			actionsList.add(new ElderEnterAction("pass2", "door_rA_pass2", "rA", elder));
			actionsList.add(new ElderEnterAction("rB", "door_rB_pass2", "pass2", elder));
			actionsList.add(new ElderEnterAction("pass2", "door_rB_pass2", "rB", elder));
			actionsList.add(new ElderEnterAction("rC", "door_rC_pass2", "pass2", elder));
			actionsList.add(new ElderEnterAction("pass2", "door_rC_pass2", "rC", elder));
			actionsList.add(new ElderEnterAction("rD", "door_rD_pass2", "pass2", elder));
			actionsList.add(new ElderEnterAction("pass2", "door_rD_pass2", "rD", elder));
			actionsList.add(new ElderEnterAction("b1", "door_b1_pass2", "pass2", elder));
			actionsList.add(new ElderEnterAction("pass2", "door_b1_pass2", "b1", elder));
			actionsList.add(new ElderEnterAction("pass2", "door_pass2_l1", "l1", elder));
			actionsList.add(new ElderEnterAction("l1", "door_pass2_l1", "pass2", elder));
			actionsList.add(new ElderEnterAction("pass2", "door_pass2_l2", "l2", elder));
			actionsList.add(new ElderEnterAction("l2", "door_pass2_l2", "pass2", elder));
		}
		
		// rule careWorkerEnter
		for(String careWorker : careWorkerSet) {
			actionsList.add(new CareWorkerEnterAction("hall", "door_hall_pass1", "pass1", careWorker));
			actionsList.add(new CareWorkerEnterAction("pass1", "door_hall_pass1", "hall", careWorker));
			actionsList.add(new CareWorkerEnterAction("c1", "door_c1_pass1", "pass1", careWorker));
			actionsList.add(new CareWorkerEnterAction("pass1", "door_c1_pass1", "c1", careWorker));
			actionsList.add(new CareWorkerEnterAction("p1", "door_p1_pass1", "pass1", careWorker));
			actionsList.add(new CareWorkerEnterAction("pass1", "door_p1_pass1", "p1", careWorker));
			actionsList.add(new CareWorkerEnterAction("pass1", "door_pass1_l1", "l1", careWorker));
			actionsList.add(new CareWorkerEnterAction("l1", "door_pass1_l1", "pass1", careWorker));
			actionsList.add(new CareWorkerEnterAction("pass1", "door_pass1_l2", "l2", careWorker));
			actionsList.add(new CareWorkerEnterAction("l2", "door_pass1_l2", "pass1", careWorker));
			actionsList.add(new CareWorkerEnterAction("rA", "door_rA_pass2", "pass2", careWorker));
			actionsList.add(new CareWorkerEnterAction("pass2", "door_rA_pass2", "rA", careWorker));
			actionsList.add(new CareWorkerEnterAction("rB", "door_rB_pass2", "pass2", careWorker));
			actionsList.add(new CareWorkerEnterAction("pass2", "door_rB_pass2", "rB", careWorker));
			actionsList.add(new CareWorkerEnterAction("rC", "door_rC_pass2", "pass2", careWorker));
			actionsList.add(new CareWorkerEnterAction("pass2", "door_rC_pass2", "rC", careWorker));
			actionsList.add(new CareWorkerEnterAction("rD", "door_rD_pass2", "pass2", careWorker));
			actionsList.add(new CareWorkerEnterAction("pass2", "door_rD_pass2", "rD", careWorker));
			actionsList.add(new CareWorkerEnterAction("b1", "door_b1_pass2", "pass2", careWorker));
			actionsList.add(new CareWorkerEnterAction("pass2", "door_b1_pass2", "b1", careWorker));
			actionsList.add(new CareWorkerEnterAction("pass2", "door_pass2_l1", "l1", careWorker));
			actionsList.add(new CareWorkerEnterAction("l1", "door_pass2_l1", "pass2", careWorker));
			actionsList.add(new CareWorkerEnterAction("pass2", "door_pass2_l2", "l2", careWorker));
			actionsList.add(new CareWorkerEnterAction("l2", "door_pass2_l2", "pass2", careWorker));
		}
		
		// rule helpEnter
		for(String careWorker : careWorkerSet) {
			for(String elder : elderSet) {
				actionsList.add(new HelpEnterAction("hall", "door_hall_pass1", "pass1", elder, careWorker));
				actionsList.add(new HelpEnterAction("pass1", "door_hall_pass1", "hall", elder, careWorker));
				actionsList.add(new HelpEnterAction("c1", "door_c1_pass1", "pass1", elder, careWorker));
				actionsList.add(new HelpEnterAction("pass1", "door_c1_pass1", "c1", elder, careWorker));
				actionsList.add(new HelpEnterAction("p1", "door_p1_pass1", "pass1", elder, careWorker));
				actionsList.add(new HelpEnterAction("pass1", "door_p1_pass1", "p1", elder, careWorker));
				actionsList.add(new HelpEnterAction("pass1", "door_pass1_l1", "l1", elder, careWorker));
				actionsList.add(new HelpEnterAction("l1", "door_pass1_l1", "pass1", elder, careWorker));
				actionsList.add(new HelpEnterAction("pass1", "door_pass1_l2", "l2", elder, careWorker));
				actionsList.add(new HelpEnterAction("l2", "door_pass1_l2", "pass1", elder, careWorker));
				actionsList.add(new HelpEnterAction("rA", "door_rA_pass2", "pass2", elder, careWorker));
				actionsList.add(new HelpEnterAction("pass2", "door_rA_pass2", "rA", elder, careWorker));
				actionsList.add(new HelpEnterAction("rB", "door_rB_pass2", "pass2", elder, careWorker));
				actionsList.add(new HelpEnterAction("pass2", "door_rB_pass2", "rB", elder, careWorker));
				actionsList.add(new HelpEnterAction("rC", "door_rC_pass2", "pass2", elder, careWorker));
				actionsList.add(new HelpEnterAction("pass2", "door_rC_pass2", "rC", elder, careWorker));
				actionsList.add(new HelpEnterAction("rD", "door_rD_pass2", "pass2", elder, careWorker));
				actionsList.add(new HelpEnterAction("pass2", "door_rD_pass2", "rD", elder, careWorker));
				actionsList.add(new HelpEnterAction("b1", "door_b1_pass2", "pass2", elder, careWorker));
				actionsList.add(new HelpEnterAction("pass2", "door_b1_pass2", "b1", elder, careWorker));
				actionsList.add(new HelpEnterAction("pass2", "door_pass2_l1", "l1", elder, careWorker));
				actionsList.add(new HelpEnterAction("l1", "door_pass2_l1", "pass2", elder, careWorker));
				actionsList.add(new HelpEnterAction("pass2", "door_pass2_l2", "l2", elder, careWorker));
				actionsList.add(new HelpEnterAction("l2", "door_pass2_l2", "pass2", elder, careWorker));
			}
		}
		
		// rule TakeShower, TemperatureCheck, BloodOxygenCheck
		for(String elder : elderSet) {
			actionsList.add(new TakeShowerAction(elder, "b1"));
			actionsList.add(new TemperatureCheckAction(elder, "c1"));
			actionsList.add(new BloodOxygenCheckAction(elder, "c1"));
		}
		
		
		
		// rule GlucoseMeasure, InjectInsulin
		for(String patient : diabetesPatients) {
			actionsList.add(new GlucoseMeasureAction(patient, "c1"));
			actionsList.add(new InjectInsulinAction(patient, "p1"));
		}
		
		// rule HeartRateCheck, TakeAspirin
		for(String patient : heartAttackPatients) {
			actionsList.add(new HeartRateCheckAction(patient, "c1"));
			actionsList.add(new TakeAspirinAction(patient, "p1"));
		}
		
		// rule about Help
		for(String careWorker : careWorkerSet) {
			// rule HelpTakeShower, HelpTemperatureCheck, HelpBloodOxygenCheck
			for(String elder : elderSet) {
				actionsList.add(new HelpTakeShowerAction(elder, "b1", careWorker));
				actionsList.add(new HelpTemperatureCheckAction(elder, "c1", careWorker));
				actionsList.add(new HelpBloodOxygenCheckAction(elder, "c1", careWorker));
			}
			
			// Set for rooms
			String[] roomSet = {"hall", "c1", "p1", "pass1", "rA", "rB", "rC", "rD", "b1", "pass2", "l1", "l2"};
			
			// rule HelpGlucoseMeasure, HelpInjectInsulin
			for(String patient : diabetesPatients) {
				actionsList.add(new HelpGlucoseMeasureAction(patient, "c1", careWorker));
				
				for(String room : roomSet)
					actionsList.add(new HelpInjectInsulinAction(patient, room, careWorker));
			}
			
			// rule HelpHeartRateCheck, HelpTakeAspirin
			for(String patient : heartAttackPatients) {
				actionsList.add(new HelpHeartRateCheckAction(patient, "c1", careWorker));
				
				for(String room : roomSet)
					actionsList.add(new HelpTakeAspirinAction(patient, room, careWorker));
			}
			
			// rule HelpGetInsulin
			actionsList.add(new HelpGetInsulinAction(careWorker, "p1"));
			
			// rule HelpGetAspirin
			actionsList.add(new HelpGetAspirinAction(careWorker, "p1"));
		}
		
		// Set for roomba, cleannessState
		String[] roombaSet = {"roomba_1", "roomba_2", "roomba_3", "roomba_4"};
		String[] cleannessSet = {"clean", "dirty"};
		
		// rule RoombaEnter
		for(String roomba : roombaSet) {
			for(String cleanness : cleannessSet) {
				actionsList.add(new RoombaEnterAction("hall", "door_hall_pass1", "pass1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pass1", "door_hall_pass1", "hall", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("c1", "door_c1_pass1", "pass1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pass1", "door_c1_pass1", "c1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("p1", "door_p1_pass1", "pass1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pass1", "door_p1_pass1", "p1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pass1", "door_pass1_l1", "l1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("l1", "door_pass1_l1", "pass1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pass1", "door_pass1_l2", "l2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("l2", "door_pass1_l2", "pass1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("rA", "door_rA_pass2", "pass2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pass2", "door_rA_pass2", "rA", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("rB", "door_rB_pass2", "pass2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pass2", "door_rB_pass2", "rB", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("rC", "door_rC_pass2", "pass2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pass2", "door_rC_pass2", "rC", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("rD", "door_rD_pass2", "pass2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pass2", "door_rD_pass2", "rD", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("b1", "door_b1_pass2", "pass2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pass2", "door_b1_pass2", "b1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pass2", "door_pass2_l1", "l1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("l1", "door_pass2_l1", "pass2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pass2", "door_pass2_l2", "l2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("l2", "door_pass2_l2", "pass2", roomba, cleanness));
			}
		}
		
		return actionsList;
	}
	
	public HashSet<Pair<Fact, Fact>> computeMutexFacts(ArrayList<Fact> systemState, ArrayList<Action> actions) {
		
		ArrayList<Fact> tmpFactsList = new ArrayList<Fact>(systemState);
		ArrayList<Fact> factsList = new ArrayList<Fact>();
		
		HashSet<Pair<Fact, Fact>> mutexFactsList = new HashSet<Pair<Fact, Fact>>();
		HashSet<Pair<Fact, Fact>> tmpMutexFactsList = new HashSet<Pair<Fact, Fact>>();
		ArrayList<Action> usedActionsList = new ArrayList<Action>();
		
		while((!(factsList.containsAll(tmpFactsList)))&&(!(mutexFactsList.containsAll(tmpMutexFactsList)))) {
			
			for(Fact element : tmpFactsList) {
				if(!factsList.contains(element))
					factsList.add(element);
			}
			for(Pair<Fact, Fact> element : tmpMutexFactsList) {
				if(!mutexFactsList.contains(element))
					mutexFactsList.add(element);
			}
			
			for(Action actionInstance : actions) {
				if(!tmpFactsList.containsAll(actionInstance.getPreFactsList())) {
					continue;
				}
				
				boolean conflictFlag = false;
				for(Fact p : actionInstance.getPreFactsList()) {
					for(Fact q : actionInstance.getPreFactsList()) {
						if(tmpFactsList.contains(new Pair<Fact, Fact>(p, q))) {
							conflictFlag = true;
							break;
						}
					}
					if(conflictFlag)
						break;
				}
				if(conflictFlag)
					continue;
				
				ArrayList<Fact> newFactsList = new ArrayList<Fact>(actionInstance.getAddFactsList());
				newFactsList.removeAll(tmpFactsList);
				
				ArrayList<Pair<Fact, Fact>> addedTmpMutexFactsList = new ArrayList<Pair<Fact, Fact>>();
				for(Fact f : newFactsList) {
					for(Fact h : actionInstance.getDelFactsList()) {
						addedTmpMutexFactsList.add(new Pair<Fact, Fact>(f, h));
						addedTmpMutexFactsList.add(new Pair<Fact, Fact>(h, f));
					}
					for(Pair<Fact, Fact> pairItem : tmpMutexFactsList) {
						Fact p = pairItem.getLeft();
						Fact q = pairItem.getRight();
						
						if(actionInstance.getPreFactsList().contains(p)&&(!actionInstance.getDelFactsList().contains(q))) {
							addedTmpMutexFactsList.add(new Pair<Fact, Fact>(f, q));
							addedTmpMutexFactsList.add(new Pair<Fact, Fact>(q, f));
						}
					}
				}
				tmpMutexFactsList.addAll(addedTmpMutexFactsList);
				
				if(!usedActionsList.contains(actionInstance)) {
					for(Fact p : actionInstance.getAddFactsList()) {
						for(Fact q : actionInstance.getAddFactsList()) {
							tmpMutexFactsList.remove(new Pair<Fact, Fact>(p, q));
							tmpMutexFactsList.remove(new Pair<Fact, Fact>(q, p));
						}
					}
				}
				
				ArrayList<Fact> leftFactsList = new ArrayList<Fact>(actionInstance.getAddFactsList());
				leftFactsList.removeAll(newFactsList);
				
				ArrayList<Pair<Fact, Fact>> removedMutexFactsList = new ArrayList<Pair<Fact, Fact>>();
				for(Pair<Fact, Fact> pairItem : tmpMutexFactsList) {
					Fact i = pairItem.getLeft();
					Fact q = pairItem.getRight();
					if(actionInstance.getDelFactsList().contains(q))
						continue;
					
					conflictFlag = false;
					for(Fact p : actionInstance.getPreFactsList()) {
						if(tmpMutexFactsList.contains(new Pair<Fact, Fact>(p, q))) {
							conflictFlag = true;
							break;
						}
					}
					if(conflictFlag)
						continue;
					
					removedMutexFactsList.add(new Pair<Fact, Fact>(i, q));
					removedMutexFactsList.add(new Pair<Fact, Fact>(q, i));
				}
				tmpMutexFactsList.removeAll(removedMutexFactsList);
				
				tmpFactsList.addAll(newFactsList);
				usedActionsList.add(actionInstance);
			}
		}
		
		return mutexFactsList;
	}
	
	public HashSet<Pair<Action, Action>> computeMutexActions(HashSet<Pair<Fact, Fact>> mutexFactsList, ArrayList<Action> actions) {
		
		HashSet<Pair<Action, Action>> mutexActionsList = new HashSet<Pair<Action, Action>>();
		
		for(Pair<Fact, Fact> pairItem : mutexFactsList) {
			Fact p = pairItem.getLeft();
			Fact q = pairItem.getRight();
			
			for(Action a : actions) {
				if(!a.getPreFactsList().contains(p))
					continue;
				
				for(Action b : actions) {
					if(!b.getPreFactsList().contains(q))
						continue;
					
					mutexActionsList.add(new Pair<Action, Action>(a, b));
					mutexActionsList.add(new Pair<Action, Action>(b, a));
				}
			}
		}
		
		for(Action a : actions) {
			for(Fact p : a.getPreFactsList()) {
				for(Action b : actions) {
					if(b.getDelFactsList().contains(p)) {
						mutexActionsList.add(new Pair<Action, Action>(a, b));
						mutexActionsList.add(new Pair<Action, Action>(b, a));
					}
				}
			}
			for(Fact p : a.getAddFactsList()) {
				for(Action b : actions) {
					if(b.getDelFactsList().contains(p)) {
						mutexActionsList.add(new Pair<Action, Action>(a, b));
						mutexActionsList.add(new Pair<Action, Action>(b, a));
					}
				}
			}
		}
		
		return mutexActionsList;
	}
	
	public int computeDuration(ArrayList<Fact> intialState, TransformationSolution solution, HashSet<Pair<Action, Action>> mutexActionsList) {
		HashMap<Fact, Integer> systemState = new HashMap<Fact, Integer>();
		ArrayList<Pair<Action, Integer>> executionList = new ArrayList<Pair<Action, Integer>>();
		
		for(Fact factItem : intialState) {
			systemState.put(factItem, 0);
		}
		
		for(ITransformationVariable variable : solution.getVariables()) {
			if(variable.getUnit()!=null) {
				String ruleName = variable.getUnit().getName();
				Action currentAction = null;
				
				switch(ruleName) {
				case "lightOn":
					Object obj1 = variable.getParameterValue("roomName");
					if(obj1 instanceof String) {
						String roomName = (String)obj1;
						String lightName = "light_"+roomName;
						String brightnessName = "brightness_"+roomName;
						currentAction = new LightOnAction(roomName, lightName, brightnessName);
					}
					break;
				case "lightOff":
					obj1 = variable.getParameterValue("roomName");
					if(obj1 instanceof String) {
						String roomName = (String)obj1;
						String lightName = "light_"+roomName;
						String brightnessName = "brightness_"+roomName;
						currentAction = new LightOffAction(roomName, lightName, brightnessName);
					}
					break;
				case "windowOn":
					obj1 = variable.getParameterValue("roomName");
					if(obj1 instanceof String) {
						String roomName = (String)obj1;
						String windowName = "window_"+roomName;
						String brightnessName = "brightness_"+roomName;
						String humidityName = "humidity_"+roomName;
						String temperatureName = "temperature_"+roomName;
						currentAction = new WindowOnAction(roomName, windowName, brightnessName, humidityName, temperatureName);
					}
					break;
				case "windowOff":
					obj1 = variable.getParameterValue("roomName");
					if(obj1 instanceof String) {
						String roomName = (String) obj1;
						String windowName = "window_"+roomName;
						String brightnessName = "brightness_"+roomName;
						String humidityName = "humidity_"+roomName;
						String temperatureName = "temperature_"+roomName;
						currentAction = new WindowOffAction(roomName, windowName, brightnessName, humidityName, temperatureName);
					}
					break;
				case "heaterOn":
					obj1 = variable.getParameterValue("roomName");
					if(obj1 instanceof String) {
						String roomName = (String) obj1;
						String heaterName = "heater_"+roomName;
						String temperatureName = "temperature_"+roomName;
						currentAction = new HeaterOnAction(roomName, heaterName, temperatureName);
					}
					break;
				case "heaterOff":
					obj1 = variable.getParameterValue("roomName");
					if(obj1 instanceof String) {
						String roomName = (String) obj1;
						String heaterName = "heater_"+roomName;
						String temperatureName = "temperature_"+roomName;
						currentAction = new HeaterOffAction(roomName, heaterName, temperatureName);
					}
					break;
				case "humidifierOn":
					obj1 = variable.getParameterValue("roomName");
					if(obj1 instanceof String) {
						String roomName = (String) obj1;
						String humidifierName = "humidifier_"+roomName;
						String humidityName = "humidity_"+roomName;
						currentAction = new HumidifierOnAction(roomName, humidifierName, humidityName);
					}
					break;
				case "humidifierOff":
					obj1 = variable.getParameterValue("roomName");
					if(obj1 instanceof String) {
						String roomName = (String) obj1;
						String humidifierName = "humidifier_"+roomName;
						String humidityName = "humidity_"+roomName;
						currentAction = new HumidifierOffAction(roomName, humidifierName, humidityName);
					}
					break;
				case "elderEnter":
					obj1 = variable.getParameterValue("fromRoomName");
					Object obj2 = variable.getParameterValue("doorName");
					Object obj3 = variable.getParameterValue("toRoomName");
					Object obj4 = variable.getParameterValue("elderName");
					if(obj1 instanceof String && obj2 instanceof String &&
							obj3 instanceof String && obj4 instanceof String) {
						String fromRoomName = (String) obj1;
						String doorName = (String) obj2;
						String toRoomName = (String) obj3;
						String elderName = (String) obj4;
						currentAction = new ElderEnterAction(fromRoomName, doorName, toRoomName, elderName);
					}
					break;
				case "careWorkerEnter":
					obj1 = variable.getParameterValue("fromRoomName");
					obj2 = variable.getParameterValue("doorName");
					obj3 = variable.getParameterValue("toRoomName");
					obj4 = variable.getParameterValue("careWorkerName");
					if(obj1 instanceof String && obj2 instanceof String &&
							obj3 instanceof String && obj4 instanceof String) {
						String fromRoomName = (String) obj1;
						String doorName = (String) obj2;
						String toRoomName = (String) obj3;
						String careWorkerName = (String) obj4;
						currentAction = new CareWorkerEnterAction(fromRoomName, doorName, toRoomName, careWorkerName);
					}
					break;
				case "helpEnter":
					obj1 = variable.getParameterValue("fromRoomName");
					obj2 = variable.getParameterValue("doorName");
					obj3 = variable.getParameterValue("toRoomName");
					obj4 = variable.getParameterValue("elderName");
					Object obj5 = variable.getParameterValue("careWorkerName");
					if(obj1 instanceof String && obj2 instanceof String &&
							obj3 instanceof String && obj4 instanceof String &&
							obj5 instanceof String) {
						String fromRoomName = (String) obj1;
						String doorName = (String) obj2;
						String toRoomName = (String) obj3;
						String elderName = (String) obj4;
						String careWorkerName = (String) obj5;
						currentAction = new HelpEnterAction(fromRoomName, doorName, toRoomName, elderName, careWorkerName);
					}
					break;
				case "takeShower":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("bathingRoomName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String bathingRoomName = (String) obj2;
						currentAction = new TakeShowerAction(elderName, bathingRoomName);
					}
					break;
				case "temperatureCheck":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("checkingRoomName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String checkingRoomName = (String) obj2;
						currentAction = new TemperatureCheckAction(elderName, checkingRoomName);
					}
					break;
				case "bloodOxygenCheck":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("checkingRoomName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String checkingRoomName = (String) obj2;
						currentAction = new BloodOxygenCheckAction(elderName, checkingRoomName);
					}
					break;
				case "glucoseMeasure":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("checkingRoomName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String checkingRoomName = (String) obj2;
						currentAction = new GlucoseMeasureAction(elderName, checkingRoomName);
					}
					break;
				case "heartRateCheck":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("checkingRoomName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String checkingRoomName = (String) obj2;
						currentAction = new HeartRateCheckAction(elderName, checkingRoomName);
					}
					break;
				case "injectInsulin":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("pharmacyName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String pharmacyName = (String) obj2;
						currentAction = new InjectInsulinAction(elderName, pharmacyName);
					}
					break;
				case "takeAspirin":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("pharmacyName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String pharmacyName = (String) obj2;
						currentAction = new TakeAspirinAction(elderName, pharmacyName);
					}
					break;
				case "helpTakeShower":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("bathingRoomName");
					obj3 = variable.getParameterValue("careWorkerName");
					if(obj1 instanceof String && obj2 instanceof String &&
							obj3 instanceof String) {
						String elderName = (String) obj1;
						String bathingRoomName = (String) obj2;
						String careWorkerName = (String) obj3;
						currentAction = new HelpTakeShowerAction(elderName, bathingRoomName, careWorkerName);
					}
					break;
				case "helpTemperatureCheck":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("checkingRoomName");
					obj3 = variable.getParameterValue("careWorkerName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String checkingRoomName = (String) obj2;
						String careWorkerName = (String) obj3;
						currentAction = new HelpTemperatureCheckAction(elderName, checkingRoomName, careWorkerName);
					}
					break;
				case "helpBloodOxygenCheck":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("checkingRoomName");
					obj3 = variable.getParameterValue("careWorkerName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String checkingRoomName = (String) obj2;
						String careWorkerName = (String) obj3;
						currentAction = new HelpBloodOxygenCheckAction(elderName, checkingRoomName, careWorkerName);
					}
					break;
				case "helpGlucoseMeasure":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("checkingRoomName");
					obj3 = variable.getParameterValue("careWorkerName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String checkingRoomName = (String) obj2;
						String careWorkerName = (String) obj3;
						currentAction = new HelpGlucoseMeasureAction(elderName, checkingRoomName, careWorkerName);
					}
					break;
				case "helpHeartRateCheck":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("checkingRoomName");
					obj3 = variable.getParameterValue("careWorkerName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String checkingRoomName = (String) obj2;
						String careWorkerName = (String) obj3;
						currentAction = new HelpHeartRateCheckAction(elderName, checkingRoomName, careWorkerName);
					}
					break;
				case "helpGetInsulin":
					obj1 = variable.getParameterValue("careWorkerName");
					obj2 = variable.getParameterValue("pharmacyName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String careWorkerName = (String) obj1;
						String pharmacyName = (String) obj2;
						currentAction = new HelpGetInsulinAction(careWorkerName, pharmacyName);
					}
					break;
				case "helpGetAspirin":
					obj1 = variable.getParameterValue("careWorkerName");
					obj2 = variable.getParameterValue("pharmacyName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String careWorkerName = (String) obj1;
						String pharmacyName = (String) obj2;
						currentAction = new HelpGetAspirinAction(careWorkerName, pharmacyName);
					}
					break;
				case "helpInjectInsulin":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("roomName");
					obj3 = variable.getParameterValue("careWorkerName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String roomName = (String) obj2;
						String careWorkerName = (String) obj3;
						currentAction = new HelpInjectInsulinAction(elderName, roomName, careWorkerName);
					}
					break;
				case "helpTakeAspirin":
					obj1 = variable.getParameterValue("elderName");
					obj2 = variable.getParameterValue("roomName");
					obj3 = variable.getParameterValue("careWorkerName");
					if(obj1 instanceof String && obj2 instanceof String) {
						String elderName = (String) obj1;
						String roomName = (String) obj2;
						String careWorkerName = (String) obj3;
						currentAction = new HelpTakeAspirinAction(elderName, roomName, careWorkerName);
					}
					break;
				case "roombaEnter":
					obj1 = variable.getParameterValue("fromRoomName");
					obj2 = variable.getParameterValue("doorName");
					obj3 = variable.getParameterValue("toRoomName");
					obj4 = variable.getParameterValue("roombaName");
					obj5 = variable.getParameterValue("cleanness");
					if(obj1 instanceof String && obj2 instanceof String &&
							obj3 instanceof String && obj4 instanceof String &&
							obj5 instanceof String) {
						String fromRoomName = (String) obj1;
						String doorName = (String) obj2;
						String toRoomName = (String) obj3;
						String roombaName = (String) obj4;
						String cleanness = (String) obj5;
						currentAction = new RoombaEnterAction(fromRoomName, doorName, toRoomName, roombaName, cleanness);
					}
					break;
				default:
					System.out.println("Error: the rule name "+ruleName+" do not exist.");
				}
				
				// compute start point
				int startPoint = 0;
				for(Fact factItem : currentAction.getPreFactsList()) {
					if(startPoint < systemState.get(factItem))
						startPoint = systemState.get(factItem);
				}
				for(Fact factItem : currentAction.getDelFactsList()) {
					if(startPoint < systemState.get(factItem))
						startPoint = systemState.get(factItem);
				}
				for(Pair<Action, Integer> pairItem : executionList) {
					if(mutexActionsList.contains(new Pair<Action, Action>(currentAction, pairItem.getLeft())) && startPoint<pairItem.getRight())
						startPoint = pairItem.getRight();
				}
				startPoint ++;
				
				// execution
				executionList.add(new Pair<Action, Integer>(currentAction, startPoint));
				for(Fact factItem : currentAction.getDelFactsList()) {
					systemState.remove(factItem);
				}
				for(Fact factItem : currentAction.getAddFactsList()) {
					systemState.put(factItem, startPoint);
				}
			}
		}
		
		// get duration
		int duration = 0;
		for(Pair<Action, Integer> pairItem : executionList) {
			if(duration < pairItem.getRight())
				duration = pairItem.getRight();
		}
		return duration;
	}
	
	public static boolean durationValidate(Solution solution) {
		if(solution instanceof TransformationSolution) {
			return pl.computeDuration(pl.initialState, (TransformationSolution) solution, pl.mutexFactsList) <= pl.executionTime;
		}
		
		return false;
	}
}
