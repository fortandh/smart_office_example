package parallel.smart_office;

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
	private int executionTime = 25;
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
		// phda
		systemState.add(new HaveFact("phda", "light_phda"));
		systemState.add(new IsFact("light_phda", "off"));
		systemState.add(new HaveFact("phda", "brightness_phda"));
		systemState.add(new IsFact("brightness_phda", "low"));
		systemState.add(new HaveFact("phda", "heater_phda"));
		systemState.add(new IsFact("heater_phda", "on"));
		systemState.add(new HaveFact("phda", "temperature_phda"));
		systemState.add(new IsFact("temperature_phda", "high"));
		systemState.add(new HaveFact("phda", "window_phda"));
		systemState.add(new IsFact("window_phda", "off"));
		systemState.add(new HaveFact("phda", "cleanness_phda"));
		systemState.add(new IsFact("cleanness_phda", "dirty"));
		
		// secretary
		systemState.add(new HaveFact("carmen", "phda"));
		systemState.add(new HaveFact("phda", "carmen"));
		
		// d1
		systemState.add(new HaveFact("phda", "d1"));
		systemState.add(new HaveFact("d1", "phda"));
		systemState.add(new HaveFact("cor4", "d1"));
		systemState.add(new HaveFact("d1", "cor4"));
		
		// pr1
		systemState.add(new HaveFact("pr1", "light_pr1"));
		systemState.add(new IsFact("light_pr1", "on"));
		systemState.add(new HaveFact("pr1", "brightness_pr1"));
		systemState.add(new IsFact("brightness_pr1", "high"));
		systemState.add(new HaveFact("pr1", "heater_pr1"));
		systemState.add(new IsFact("heater_pr1", "off"));
		systemState.add(new HaveFact("pr1", "temperature_pr1"));
		systemState.add(new IsFact("temperature_pr1", "low"));
		systemState.add(new HaveFact("pr1", "window_pr1"));
		systemState.add(new IsFact("window_pr1", "on"));
		systemState.add(new HaveFact("pr1", "cleanness_pr1"));
		systemState.add(new IsFact("cleanness_pr1", "dirty"));
		
		// d2
		systemState.add(new HaveFact("pr1", "d2"));
		systemState.add(new HaveFact("d2", "pr1"));
		systemState.add(new HaveFact("cor4", "d2"));
		systemState.add(new HaveFact("d2", "cor4"));
		
		// pr2
		systemState.add(new HaveFact("pr2", "light_pr2"));
		systemState.add(new IsFact("light_pr2", "off"));
		systemState.add(new HaveFact("pr2", "brightness_pr2"));
		systemState.add(new IsFact("brightness_pr2", "low"));
		systemState.add(new HaveFact("pr2", "heater_pr2"));
		systemState.add(new IsFact("heater_pr2", "on"));
		systemState.add(new HaveFact("pr2", "temperature_pr2"));
		systemState.add(new IsFact("temperature_pr2", "high"));
		systemState.add(new HaveFact("pr2", "window_pr2"));
		systemState.add(new IsFact("window_pr2", "off"));
		systemState.add(new HaveFact("pr2", "cleanness_pr2"));
		systemState.add(new IsFact("cleanness_pr2", "dirty"));
		
		// d3
		systemState.add(new HaveFact("pr2", "d3"));
		systemState.add(new HaveFact("d3", "pr2"));
		systemState.add(new HaveFact("cor4", "d3"));
		systemState.add(new HaveFact("d3", "cor4"));
		
		// pr3
		systemState.add(new HaveFact("pr3", "light_pr3"));
		systemState.add(new IsFact("light_pr3", "on"));
		systemState.add(new HaveFact("pr3", "brightness_pr3"));
		systemState.add(new IsFact("brightness_pr3", "high"));
		systemState.add(new HaveFact("pr3", "heater_pr3"));
		systemState.add(new IsFact("heater_pr3", "off"));
		systemState.add(new HaveFact("pr3", "temperature_pr3"));
		systemState.add(new IsFact("temperature_pr3", "low"));
		systemState.add(new HaveFact("pr3", "window_pr3"));
		systemState.add(new IsFact("window_pr3", "on"));
		systemState.add(new HaveFact("pr3", "cleanness_pr3"));
		systemState.add(new IsFact("cleanness_pr3", "dirty"));
		
		// d4
		systemState.add(new HaveFact("pr3", "d4"));
		systemState.add(new HaveFact("d4", "pr3"));
		systemState.add(new HaveFact("cor4", "d4"));
		systemState.add(new HaveFact("d4", "cor4"));
		
		// roomba
		systemState.add(new HaveFact("roomba_0", "pr3"));
		systemState.add(new HaveFact("pr3", "roomba_0"));
		
		// st
		systemState.add(new HaveFact("st", "light_st"));
		systemState.add(new IsFact("light_st", "off"));
		systemState.add(new HaveFact("st", "brightness_st"));
		systemState.add(new IsFact("brightness_st", "low"));
		systemState.add(new HaveFact("st", "heater_st"));
		systemState.add(new IsFact("heater_st", "on"));
		systemState.add(new HaveFact("st", "temperature_st"));
		systemState.add(new IsFact("temperature_st", "high"));
		systemState.add(new HaveFact("st", "window_st"));
		systemState.add(new IsFact("window_st", "off"));
		systemState.add(new HaveFact("st", "cleanness_st"));
		systemState.add(new IsFact("cleanness_st", "dirty"));
		
		// dm
		systemState.add(new HaveFact("st", "dm"));
		systemState.add(new HaveFact("dm", "st"));
		systemState.add(new HaveFact("rec", "dm"));
		systemState.add(new HaveFact("dm", "rec"));
		
		// bd
		systemState.add(new HaveFact("bd", "light_bd"));
		systemState.add(new IsFact("light_bd", "on"));
		systemState.add(new HaveFact("bd", "brightness_bd"));
		systemState.add(new IsFact("brightness_bd", "high"));
		systemState.add(new HaveFact("bd", "heater_bd"));
		systemState.add(new IsFact("heater_bd", "off"));
		systemState.add(new HaveFact("bd", "temperature_bd"));
		systemState.add(new IsFact("temperature_bd", "low"));
		systemState.add(new HaveFact("bd", "window_bd"));
		systemState.add(new IsFact("window_bd", "on"));
		systemState.add(new HaveFact("bd", "cleanness_bd"));
		systemState.add(new IsFact("cleanness_bd", "dirty"));
		
		// d5
		systemState.add(new HaveFact("bd", "d5"));
		systemState.add(new HaveFact("d5", "bd"));
		systemState.add(new HaveFact("cor3", "d5"));
		systemState.add(new HaveFact("d5", "cor3"));
		
		// pr4
		systemState.add(new HaveFact("pr4", "light_pr4"));
		systemState.add(new IsFact("light_pr4", "off"));
		systemState.add(new HaveFact("pr4", "brightness_pr4"));
		systemState.add(new IsFact("brightness_pr4", "low"));
		systemState.add(new HaveFact("pr4", "heater_pr4"));
		systemState.add(new IsFact("heater_pr4", "on"));
		systemState.add(new HaveFact("pr4", "temperature_pr4"));
		systemState.add(new IsFact("temperature_pr4", "high"));
		systemState.add(new HaveFact("pr4", "window_pr4"));
		systemState.add(new IsFact("window_pr4", "off"));
		systemState.add(new HaveFact("pr4", "cleanness_pr4"));
		systemState.add(new IsFact("cleanness_pr4", "dirty"));
		
		// d6
		systemState.add(new HaveFact("pr4", "d6"));
		systemState.add(new HaveFact("d6", "pr4"));
		systemState.add(new HaveFact("cor3", "d6"));
		systemState.add(new HaveFact("d6", "cor3"));
		
		// pr5
		systemState.add(new HaveFact("pr5", "light_pr5"));
		systemState.add(new IsFact("light_pr5", "on"));
		systemState.add(new HaveFact("pr5", "brightness_pr5"));
		systemState.add(new IsFact("brightness_pr5", "high"));
		systemState.add(new HaveFact("pr5", "heater_pr5"));
		systemState.add(new IsFact("heater_pr5", "off"));
		systemState.add(new HaveFact("pr5", "temperature_pr5"));
		systemState.add(new IsFact("temperature_pr5", "low"));
		systemState.add(new HaveFact("pr5", "window_pr5"));
		systemState.add(new IsFact("window_pr5", "on"));
		systemState.add(new HaveFact("pr5", "cleanness_pr5"));
		systemState.add(new IsFact("cleanness_pr5", "dirty"));
		
		// d7
		systemState.add(new HaveFact("pr5", "d7"));
		systemState.add(new HaveFact("d7", "pr5"));
		systemState.add(new HaveFact("cor3", "d7"));
		systemState.add(new HaveFact("d7", "cor3"));
		
		// roomba
		systemState.add(new HaveFact("roomba_1", "pr5"));
		systemState.add(new HaveFact("pr5", "roomba_1"));
		
		// pr6
		systemState.add(new HaveFact("pr6", "light_pr6"));
		systemState.add(new IsFact("light_pr6", "off"));
		systemState.add(new HaveFact("pr6", "brightness_pr6"));
		systemState.add(new IsFact("brightness_pr6", "low"));
		systemState.add(new HaveFact("pr6", "heater_pr6"));
		systemState.add(new IsFact("heater_pr6", "on"));
		systemState.add(new HaveFact("pr6", "temperature_pr6"));
		systemState.add(new IsFact("temperature_pr6", "high"));
		systemState.add(new HaveFact("pr6", "window_pr6"));
		systemState.add(new IsFact("window_pr6", "off"));
		systemState.add(new HaveFact("pr6", "cleanness_pr6"));
		systemState.add(new IsFact("cleanness_pr6", "dirty"));
		
		// d8
		systemState.add(new HaveFact("pr6", "d8"));
		systemState.add(new HaveFact("d8", "pr6"));
		systemState.add(new HaveFact("cor3", "d8"));
		systemState.add(new HaveFact("d8", "cor3"));
		
		// pr7
		systemState.add(new HaveFact("pr7", "light_pr7"));
		systemState.add(new IsFact("light_pr7", "off"));
		systemState.add(new HaveFact("pr7", "brightness_pr7"));
		systemState.add(new IsFact("brightness_pr7", "low"));
		systemState.add(new HaveFact("pr7", "heater_pr7"));
		systemState.add(new IsFact("heater_pr7", "off"));
		systemState.add(new HaveFact("pr7", "temperature_pr7"));
		systemState.add(new IsFact("temperature_pr7", "low"));
		systemState.add(new HaveFact("pr7", "window_pr7"));
		systemState.add(new IsFact("window_pr7", "on"));
		systemState.add(new HaveFact("pr7", "cleanness_pr7"));
		systemState.add(new IsFact("cleanness_pr7", "dirty"));
		
		// d9
		systemState.add(new HaveFact("pr7", "d9"));
		systemState.add(new HaveFact("d9", "pr7"));
		systemState.add(new HaveFact("cor3", "d9"));
		systemState.add(new HaveFact("d9", "cor3"));
		
		// pr8
		systemState.add(new HaveFact("pr8", "light_pr8"));
		systemState.add(new IsFact("light_pr8", "off"));
		systemState.add(new HaveFact("pr8", "brightness_pr8"));
		systemState.add(new IsFact("brightness_pr8", "low"));
		systemState.add(new HaveFact("pr8", "heater_pr8"));
		systemState.add(new IsFact("heater_pr8", "on"));
		systemState.add(new HaveFact("pr8", "temperature_pr8"));
		systemState.add(new IsFact("temperature_pr8", "high"));
		systemState.add(new HaveFact("pr8", "window_pr8"));
		systemState.add(new IsFact("window_pr8", "off"));
		systemState.add(new HaveFact("pr8", "cleanness_pr8"));
		systemState.add(new IsFact("cleanness_pr8", "dirty"));
		
		// d10
		systemState.add(new HaveFact("pr8", "d10"));
		systemState.add(new HaveFact("d10", "pr8"));
		systemState.add(new HaveFact("cor3", "d10"));
		systemState.add(new HaveFact("d10", "cor3"));
		
		// pr9
		systemState.add(new HaveFact("pr9", "light_pr9"));
		systemState.add(new IsFact("light_pr9", "on"));
		systemState.add(new HaveFact("pr9", "brightness_pr9"));
		systemState.add(new IsFact("brightness_pr9", "high"));
		systemState.add(new HaveFact("pr9", "heater_pr9"));
		systemState.add(new IsFact("heater_pr9", "off"));
		systemState.add(new HaveFact("pr9", "temperature_pr9"));
		systemState.add(new IsFact("temperature_pr9", "low"));
		systemState.add(new HaveFact("pr9", "window_pr9"));
		systemState.add(new IsFact("window_pr9", "on"));
		systemState.add(new HaveFact("pr9", "cleanness_pr9"));
		systemState.add(new IsFact("cleanness_pr9", "dirty"));
		
		// d11
		systemState.add(new HaveFact("pr9", "d11"));
		systemState.add(new HaveFact("d11", "pr9"));
		systemState.add(new HaveFact("cor2", "d11"));
		systemState.add(new HaveFact("d11", "cor2"));
		
		// pr10
		systemState.add(new HaveFact("pr10", "light_pr10"));
		systemState.add(new IsFact("light_pr10", "on"));
		systemState.add(new HaveFact("pr10", "brightness_pr10"));
		systemState.add(new IsFact("brightness_pr10", "high"));
		systemState.add(new HaveFact("pr10", "heater_pr10"));
		systemState.add(new IsFact("heater_pr10", "off"));
		systemState.add(new HaveFact("pr10", "temperature_pr10"));
		systemState.add(new IsFact("temperature_pr10", "low"));
		systemState.add(new HaveFact("pr10", "window_pr10"));
		systemState.add(new IsFact("window_pr10", "on"));
		systemState.add(new HaveFact("pr10", "cleanness_pr10"));
		systemState.add(new IsFact("cleanness_pr10", "dirty"));
		
		// d12
		systemState.add(new HaveFact("pr10", "d12"));
		systemState.add(new HaveFact("d12", "pr10"));
		systemState.add(new HaveFact("cor2", "d12"));
		systemState.add(new HaveFact("d12", "cor2"));
		
		// roomba
		systemState.add(new HaveFact("roomba_2", "pr10"));
		systemState.add(new HaveFact("pr10", "roomba_2"));
		
		// agent
		systemState.add(new HaveFact("mary", "pr10"));
		systemState.add(new HaveFact("pr10", "mary"));
		
		// pr11
		systemState.add(new HaveFact("pr11", "light_pr11"));
		systemState.add(new IsFact("light_pr11", "on"));
		systemState.add(new HaveFact("pr11", "brightness_pr11"));
		systemState.add(new IsFact("brightness_pr11", "high"));
		systemState.add(new HaveFact("pr11", "heater_pr11"));
		systemState.add(new IsFact("heater_pr11", "off"));
		systemState.add(new HaveFact("pr11", "temperature_pr11"));
		systemState.add(new IsFact("temperature_pr11", "low"));
		systemState.add(new HaveFact("pr11", "window_pr11"));
		systemState.add(new IsFact("window_pr11", "on"));
		systemState.add(new HaveFact("pr11", "cleanness_pr11"));
		systemState.add(new IsFact("cleanness_pr11", "dirty"));
		
		// d13
		systemState.add(new HaveFact("pr11", "d13"));
		systemState.add(new HaveFact("d13", "pr11"));
		systemState.add(new HaveFact("cor2", "d13"));
		systemState.add(new HaveFact("d13", "cor2"));
		
		// pr12
		systemState.add(new HaveFact("pr12", "light_pr12"));
		systemState.add(new IsFact("light_pr12", "off"));
		systemState.add(new HaveFact("pr12", "brightness_pr12"));
		systemState.add(new IsFact("brightness_pr12", "low"));
		systemState.add(new HaveFact("pr12", "heater_pr12"));
		systemState.add(new IsFact("heater_pr12", "on"));
		systemState.add(new HaveFact("pr12", "temperature_pr12"));
		systemState.add(new IsFact("temperature_pr12", "high"));
		systemState.add(new HaveFact("pr12", "window_pr12"));
		systemState.add(new IsFact("window_pr12", "off"));
		systemState.add(new HaveFact("pr12", "cleanness_pr12"));
		systemState.add(new IsFact("cleanness_pr12", "dirty"));
		
		// d14
		systemState.add(new HaveFact("pr12", "d14"));
		systemState.add(new HaveFact("d14", "pr12"));
		systemState.add(new HaveFact("cor2", "d14"));
		systemState.add(new HaveFact("d14", "cor2"));
		
		// pr13
		systemState.add(new HaveFact("pr13", "light_pr13"));
		systemState.add(new IsFact("light_pr13", "on"));
		systemState.add(new HaveFact("pr13", "brightness_pr13"));
		systemState.add(new IsFact("brightness_pr13", "high"));
		systemState.add(new HaveFact("pr13", "heater_pr13"));
		systemState.add(new IsFact("heater_pr13", "off"));
		systemState.add(new HaveFact("pr13", "temperature_pr13"));
		systemState.add(new IsFact("temperature_pr13", "low"));
		systemState.add(new HaveFact("pr13", "window_pr13"));
		systemState.add(new IsFact("window_pr13", "on"));
		systemState.add(new HaveFact("pr13", "cleanness_pr13"));
		systemState.add(new IsFact("cleanness_pr13", "dirty"));
		
		// d15
		systemState.add(new HaveFact("pr13", "d15"));
		systemState.add(new HaveFact("d15", "pr13"));
		systemState.add(new HaveFact("cor2", "d15"));
		systemState.add(new HaveFact("d15", "cor2"));
		
		// srv
		systemState.add(new HaveFact("srv", "light_srv"));
		systemState.add(new IsFact("light_srv", "on"));
		systemState.add(new HaveFact("srv", "brightness_srv"));
		systemState.add(new IsFact("brightness_srv", "high"));
		systemState.add(new HaveFact("srv", "server_srv"));
		systemState.add(new HaveFact("srv", "cleanness_srv"));
		systemState.add(new IsFact("cleanness_srv", "dirty"));
		
		// d16
		systemState.add(new HaveFact("srv", "d16"));
		systemState.add(new HaveFact("d16", "srv"));
		systemState.add(new HaveFact("cor2", "d16"));
		systemState.add(new HaveFact("d16", "cor2"));
		
		// agent
		systemState.add(new HaveFact("assassin", "srv"));
		systemState.add(new HaveFact("srv", "assassin"));
		
		// bf
		systemState.add(new HaveFact("bf", "light_bf"));
		systemState.add(new IsFact("light_bf", "off"));
		systemState.add(new HaveFact("bf", "brightness_bf"));
		systemState.add(new IsFact("brightness_bf", "low"));
		systemState.add(new HaveFact("bf", "heater_bf"));
		systemState.add(new IsFact("heater_bf", "on"));
		systemState.add(new HaveFact("bf", "temperature_bf"));
		systemState.add(new IsFact("temperature_bf", "high"));
		systemState.add(new HaveFact("bf", "window_bf"));
		systemState.add(new IsFact("window_bf", "off"));
		systemState.add(new HaveFact("bf", "cleanness_bf"));
		systemState.add(new IsFact("cleanness_bf", "dirty"));
		
		// d17
		systemState.add(new HaveFact("bf", "d17"));
		systemState.add(new HaveFact("d17", "bf"));
		systemState.add(new HaveFact("cor2", "d17"));
		systemState.add(new HaveFact("d17", "cor2"));
		
		// bm
		systemState.add(new HaveFact("bm", "light_bm"));
		systemState.add(new IsFact("light_bm", "on"));
		systemState.add(new HaveFact("bm", "brightness_bm"));
		systemState.add(new IsFact("brightness_bm", "high"));
		systemState.add(new HaveFact("bm", "heater_bm"));
		systemState.add(new IsFact("heater_bm", "off"));
		systemState.add(new HaveFact("bm", "temperature_bm"));
		systemState.add(new IsFact("temperature_bm", "low"));
		systemState.add(new HaveFact("bm", "window_bm"));
		systemState.add(new IsFact("window_bm", "on"));
		systemState.add(new HaveFact("bm", "cleanness_bm"));
		systemState.add(new IsFact("cleanness_bm", "dirty"));
		
		// d18
		systemState.add(new HaveFact("bm", "d18"));
		systemState.add(new HaveFact("d18", "bm"));
		systemState.add(new HaveFact("cor1", "d18"));
		systemState.add(new HaveFact("d18", "cor1"));
		
		// phdb
		systemState.add(new HaveFact("phdb", "light_phdb"));
		systemState.add(new IsFact("light_phdb", "off"));
		systemState.add(new HaveFact("phdb", "brightness_phdb"));
		systemState.add(new IsFact("brightness_phdb", "low"));
		systemState.add(new HaveFact("phdb", "heater_phdb"));
		systemState.add(new IsFact("heater_phdb", "on"));
		systemState.add(new HaveFact("phdb", "temperature_phdb"));
		systemState.add(new IsFact("temperature_phdb", "high"));
		systemState.add(new HaveFact("phdb", "window_phdb"));
		systemState.add(new IsFact("window_phdb", "off"));
		systemState.add(new HaveFact("phdb", "cleanness_phdb"));
		systemState.add(new IsFact("cleanness_phdb", "dirty"));
		
		// d19
		systemState.add(new HaveFact("phdb", "d19"));
		systemState.add(new HaveFact("d19", "phdb"));
		systemState.add(new HaveFact("cor1", "d19"));
		systemState.add(new HaveFact("d19", "cor1"));
		
		// roomba
		systemState.add(new HaveFact("roomba_3", "phdb"));
		systemState.add(new HaveFact("phdb", "roomba_3"));
		
		// maestro
		systemState.add(new HaveFact("maestro", "light_maestro"));
		systemState.add(new IsFact("light_maestro", "on"));
		systemState.add(new HaveFact("maestro", "brightness_maestro"));
		systemState.add(new IsFact("brightness_maestro", "high"));
		systemState.add(new HaveFact("maestro", "heater_maestro"));
		systemState.add(new IsFact("heater_maestro", "off"));
		systemState.add(new HaveFact("maestro", "temperature_maestro"));
		systemState.add(new IsFact("temperature_maestro", "low"));
		systemState.add(new HaveFact("maestro", "window_maestro"));
		systemState.add(new IsFact("window_maestro", "on"));
		systemState.add(new HaveFact("maestro", "cleanness_maestro"));
		systemState.add(new IsFact("cleanness_maestro", "dirty"));
		
		// d20
		systemState.add(new HaveFact("maestro", "d20"));
		systemState.add(new HaveFact("d20", "maestro"));
		systemState.add(new HaveFact("cor1", "d20"));
		systemState.add(new HaveFact("d20", "cor1"));
		
		// pr14
		systemState.add(new HaveFact("pr14", "light_pr14"));
		systemState.add(new IsFact("light_pr14", "off"));
		systemState.add(new HaveFact("pr14", "brightness_pr14"));
		systemState.add(new IsFact("brightness_pr14", "low"));
		systemState.add(new HaveFact("pr14", "heater_pr14"));
		systemState.add(new IsFact("heater_pr14", "off"));
		systemState.add(new HaveFact("pr14", "temperature_pr14"));
		systemState.add(new IsFact("temperature_pr14", "low"));
		systemState.add(new HaveFact("pr14", "window_pr14"));
		systemState.add(new IsFact("window_pr14", "off"));
		systemState.add(new HaveFact("pr14", "cleanness_pr14"));
		systemState.add(new IsFact("cleanness_pr14", "dirty"));
		
		// d21
		systemState.add(new HaveFact("pr14", "d21"));
		systemState.add(new HaveFact("d21", "pr14"));
		systemState.add(new HaveFact("cor4", "d21"));
		systemState.add(new HaveFact("d21", "cor4"));
		
		// agent
		systemState.add(new HaveFact("boyuan", "pr14"));
		systemState.add(new HaveFact("pr14", "boyuan"));
		
		// prt1
		systemState.add(new HaveFact("prt1", "printer_prt1"));
		systemState.add(new HaveFact("printer_prt1", "Asset"));
		
		// d22
		systemState.add(new HaveFact("prt1", "d22"));
		systemState.add(new HaveFact("d22", "prt1"));
		systemState.add(new HaveFact("cor4", "d22"));
		systemState.add(new HaveFact("d22", "cor4"));
		
		// meet
		systemState.add(new HaveFact("meet", "light_meet"));
		systemState.add(new IsFact("light_meet", "on"));
		systemState.add(new HaveFact("meet", "brightness_meet"));
		systemState.add(new IsFact("brightness_meet", "high"));
		systemState.add(new HaveFact("meet", "heater_meet"));
		systemState.add(new IsFact("heater_meet", "off"));
		systemState.add(new HaveFact("meet", "temperature_meet"));
		systemState.add(new IsFact("temperature_meet", "low"));
		systemState.add(new HaveFact("meet", "window_meet"));
		systemState.add(new IsFact("window_meet", "on"));
		systemState.add(new HaveFact("meet", "cleanness_meet"));
		systemState.add(new IsFact("cleanness_meet", "dirty"));
		
		// d23
		systemState.add(new HaveFact("meet", "d23"));
		systemState.add(new HaveFact("d23", "meet"));
		systemState.add(new HaveFact("cor1", "d23"));
		systemState.add(new HaveFact("d23", "cor1"));
		
		// d34
		systemState.add(new HaveFact("meet", "d34"));
		systemState.add(new HaveFact("d34", "meet"));
		systemState.add(new HaveFact("cor4", "d34"));
		systemState.add(new HaveFact("d34", "cor4"));
		
		// cor4
		systemState.add(new HaveFact("cor4", "cleanness_cor4"));
		systemState.add(new IsFact("cleanness_cor4", "dirty"));
		
		// d35
		systemState.add(new HaveFact("cor4", "d35"));
		systemState.add(new HaveFact("d35", "cor4"));
		systemState.add(new HaveFact("cor1", "d35"));
		systemState.add(new HaveFact("d35", "cor1"));
		
		// d36
		systemState.add(new HaveFact("cor4", "d36"));
		systemState.add(new HaveFact("d36", "cor4"));
		systemState.add(new HaveFact("cor1", "d36"));
		systemState.add(new HaveFact("d36", "cor1"));
		
		// d37
		systemState.add(new HaveFact("cor4", "d37"));
		systemState.add(new HaveFact("d37", "cor4"));
		systemState.add(new HaveFact("sec", "d37"));
		systemState.add(new HaveFact("d37", "sec"));
		
		// cof
		systemState.add(new HaveFact("cof", "cleanness_cof"));
		systemState.add(new IsFact("cleanness_cof", "dirty"));
		
		// d25
		systemState.add(new HaveFact("cof", "d25"));
		systemState.add(new HaveFact("d25", "cof"));
		systemState.add(new HaveFact("cor1", "d25"));
		systemState.add(new HaveFact("d25", "cor1"));
		
		// cor1
		systemState.add(new HaveFact("cor1", "cleanness_cor1"));
		systemState.add(new IsFact("cleanness_cor1", "dirty"));
		
		// d26
		systemState.add(new HaveFact("cor1", "d26"));
		systemState.add(new HaveFact("d26", "cor1"));
		systemState.add(new HaveFact("rec", "d26"));
		systemState.add(new HaveFact("d26", "rec"));
		
		// d38
		systemState.add(new HaveFact("cor1", "d38"));
		systemState.add(new HaveFact("d38", "cor1"));
		systemState.add(new HaveFact("sec", "d38"));
		systemState.add(new HaveFact("d38", "sec"));
		
		// sec
		systemState.add(new HaveFact("sec", "light_sec"));
		systemState.add(new IsFact("light_sec", "off"));
		systemState.add(new HaveFact("sec", "brightness_sec"));
		systemState.add(new IsFact("brightness_sec", "low"));
		systemState.add(new HaveFact("sec", "heater_sec"));
		systemState.add(new IsFact("heater_sec", "on"));
		systemState.add(new HaveFact("sec", "temperature_sec"));
		systemState.add(new IsFact("temperature_sec", "high"));
		systemState.add(new HaveFact("sec", "window_sec"));
		systemState.add(new IsFact("window_sec", "off"));
		systemState.add(new HaveFact("sec", "cleanness_sec"));
		systemState.add(new IsFact("cleanness_sec", "dirty"));
		
		// rec
		systemState.add(new HaveFact("rec", "light_rec"));
		systemState.add(new IsFact("light_rec", "on"));
		systemState.add(new HaveFact("rec", "brightness_rec"));
		systemState.add(new IsFact("brightness_rec", "high"));
		systemState.add(new HaveFact("rec", "heater_rec"));
		systemState.add(new IsFact("heater_rec", "off"));
		systemState.add(new HaveFact("rec", "temperature_rec"));
		systemState.add(new IsFact("temperature_rec", "low"));
		systemState.add(new HaveFact("rec", "window_rec"));
		systemState.add(new IsFact("window_rec", "on"));
		systemState.add(new HaveFact("rec", "cleanness_rec"));
		systemState.add(new IsFact("cleanness_rec", "dirty"));
		
		// d39
		systemState.add(new HaveFact("rec", "d39"));
		systemState.add(new HaveFact("d39", "rec"));
		systemState.add(new HaveFact("cor2", "d39"));
		systemState.add(new HaveFact("d39", "cor2"));
		
		// chr
		systemState.add(new HaveFact("chr", "light_chr"));
		systemState.add(new IsFact("light_chr", "off"));
		systemState.add(new HaveFact("chr", "brightness_chr"));
		systemState.add(new IsFact("brightness_chr", "low"));
		systemState.add(new HaveFact("chr", "heater_chr"));
		systemState.add(new IsFact("heater_chr", "on"));
		systemState.add(new HaveFact("chr", "temperature_chr"));
		systemState.add(new IsFact("temperature_chr", "high"));
		systemState.add(new HaveFact("chr", "window_chr"));
		systemState.add(new IsFact("window_chr", "off"));
		systemState.add(new HaveFact("chr", "cleanness_chr"));
		systemState.add(new IsFact("cleanness_chr", "dirty"));
		
		// d29
		systemState.add(new HaveFact("chr", "d29"));
		systemState.add(new HaveFact("d29", "chr"));
		systemState.add(new HaveFact("cor2", "d29"));
		systemState.add(new HaveFact("d29", "cor2"));
		
		// roomba
		systemState.add(new HaveFact("roomba_4", "chr"));
		systemState.add(new HaveFact("chr", "roomba_4"));
		
		// prt2
		systemState.add(new HaveFact("prt2", "printer_prt2"));
		systemState.add(new HaveFact("printer_prt2", "Asset"));
		systemState.add(new HaveFact("prt2", "cleanness_prt2"));
		systemState.add(new IsFact("cleanness_prt2", "dirty"));
		
		// d30
		systemState.add(new HaveFact("prt2", "d30"));
		systemState.add(new HaveFact("d30", "prt2"));
		systemState.add(new HaveFact("cor2", "d30"));
		systemState.add(new HaveFact("d30", "cor2"));
		
		// lab
		systemState.add(new HaveFact("lab", "light_lab"));
		systemState.add(new IsFact("light_lab", "on"));
		systemState.add(new HaveFact("lab", "brightness_lab"));
		systemState.add(new IsFact("brightness_lab", "high"));
		systemState.add(new HaveFact("lab", "heater_lab"));
		systemState.add(new IsFact("heater_lab", "off"));
		systemState.add(new HaveFact("lab", "temperature_lab"));
		systemState.add(new IsFact("temperature_lab", "low"));
		systemState.add(new HaveFact("lab", "window_lab"));
		systemState.add(new IsFact("window_lab", "on"));
		systemState.add(new HaveFact("lab", "cleanness_lab"));
		systemState.add(new IsFact("cleanness_lab", "dirty"));
		
		// d40
		systemState.add(new HaveFact("lab", "d40"));
		systemState.add(new HaveFact("d40", "lab"));
		systemState.add(new HaveFact("cor3", "d40"));
		systemState.add(new HaveFact("d40", "cor3"));
		
		// d41
		systemState.add(new HaveFact("lab", "d41"));
		systemState.add(new HaveFact("d41", "lab"));
		systemState.add(new HaveFact("cor2", "d41"));
		systemState.add(new HaveFact("d41", "cor2"));
		
		// prt3
		systemState.add(new HaveFact("prt3", "printer_prt3"));
		systemState.add(new HaveFact("printer_prt3", "Asset"));
		systemState.add(new HaveFact("prt3", "cleanness_prt3"));
		systemState.add(new IsFact("cleanness_prt3", "dirty"));
		
		// d32
		systemState.add(new HaveFact("prt3", "d32"));
		systemState.add(new HaveFact("d32", "prt3"));
		systemState.add(new HaveFact("cor3", "d32"));
		systemState.add(new HaveFact("d32", "cor3"));
		
		// cor3
		systemState.add(new HaveFact("cor3", "cleanness_cor3"));
		systemState.add(new IsFact("cleanness_cor3", "dirty"));
		
		// d42
		systemState.add(new HaveFact("cor3", "d42"));
		systemState.add(new HaveFact("d42", "cor3"));
		systemState.add(new HaveFact("cor2", "d42"));
		systemState.add(new HaveFact("d42", "cor2"));
		
		// d33
		systemState.add(new HaveFact("cor3", "d33"));
		systemState.add(new HaveFact("d33", "cor3"));
		systemState.add(new HaveFact("cor2", "d33"));
		systemState.add(new HaveFact("d33", "cor2"));
		
		// cor2
		systemState.add(new HaveFact("cor2", "cleanness_cor2"));
		systemState.add(new IsFact("cleanness_cor2", "dirty"));

		return systemState;
	}
	
	public ArrayList<Action> initActions() {
		ArrayList<Action> actionsList = new ArrayList<Action>();
		
		// rule lightOn
		actionsList.add(new LightOnAction("phda", "light_phda", "brightness_phda"));
		actionsList.add(new LightOnAction("pr1", "light_pr1", "brightness_pr1"));
		actionsList.add(new LightOnAction("pr2", "light_pr2", "brightness_pr2"));
		actionsList.add(new LightOnAction("pr3", "light_pr3", "brightness_pr3"));
		actionsList.add(new LightOnAction("st", "light_st", "brightness_st"));
		actionsList.add(new LightOnAction("bd", "light_bd", "brightness_bd"));
		actionsList.add(new LightOnAction("pr4", "light_pr4", "brightness_pr4"));
		actionsList.add(new LightOnAction("pr5", "light_pr5", "brightness_pr5"));
		actionsList.add(new LightOnAction("pr6", "light_pr6", "brightness_pr6"));
		actionsList.add(new LightOnAction("pr7", "light_pr7", "brightness_pr7"));
		actionsList.add(new LightOnAction("pr8", "light_pr8", "brightness_pr8"));
		actionsList.add(new LightOnAction("pr9", "light_pr9", "brightness_pr9"));
		actionsList.add(new LightOnAction("pr10", "light_pr10", "brightness_pr10"));
		actionsList.add(new LightOnAction("pr11", "light_pr11", "brightness_pr11"));
		actionsList.add(new LightOnAction("pr12", "light_pr12", "brightness_pr12"));
		actionsList.add(new LightOnAction("pr13", "light_pr13", "brightness_pr13"));
		actionsList.add(new LightOnAction("srv", "light_srv", "brightness_srv"));
		actionsList.add(new LightOnAction("bf", "light_bf", "brightness_bf"));
		actionsList.add(new LightOnAction("bm", "light_bm", "brightness_bm"));
		actionsList.add(new LightOnAction("phdb", "light_phdb", "brightness_phdb"));
		actionsList.add(new LightOnAction("maestro", "light_maestro", "brightness_maestro"));
		actionsList.add(new LightOnAction("pr14", "light_pr14", "brightness_pr14"));
		actionsList.add(new LightOnAction("meet", "light_meet", "brightness_meet"));
		actionsList.add(new LightOnAction("sec", "light_sec", "brightness_sec"));
		actionsList.add(new LightOnAction("rec", "light_rec", "brightness_rec"));
		actionsList.add(new LightOnAction("chr", "light_chr", "brightness_chr"));
		actionsList.add(new LightOnAction("lab", "light_lab", "brightness_lab"));
		
		// rule lightOff
		actionsList.add(new LightOffAction("phda", "light_phda", "brightness_phda"));
		actionsList.add(new LightOffAction("pr1", "light_pr1", "brightness_pr1"));
		actionsList.add(new LightOffAction("pr2", "light_pr2", "brightness_pr2"));
		actionsList.add(new LightOffAction("pr3", "light_pr3", "brightness_pr3"));
		actionsList.add(new LightOffAction("st", "light_st", "brightness_st"));
		actionsList.add(new LightOffAction("bd", "light_bd", "brightness_bd"));
		actionsList.add(new LightOffAction("pr4", "light_pr4", "brightness_pr4"));
		actionsList.add(new LightOffAction("pr5", "light_pr5", "brightness_pr5"));
		actionsList.add(new LightOffAction("pr6", "light_pr6", "brightness_pr6"));
		actionsList.add(new LightOffAction("pr7", "light_pr7", "brightness_pr7"));
		actionsList.add(new LightOffAction("pr8", "light_pr8", "brightness_pr8"));
		actionsList.add(new LightOffAction("pr9", "light_pr9", "brightness_pr9"));
		actionsList.add(new LightOffAction("pr10", "light_pr10", "brightness_pr10"));
		actionsList.add(new LightOffAction("pr11", "light_pr11", "brightness_pr11"));
		actionsList.add(new LightOffAction("pr12", "light_pr12", "brightness_pr12"));
		actionsList.add(new LightOffAction("pr13", "light_pr13", "brightness_pr13"));
		actionsList.add(new LightOffAction("srv", "light_srv", "brightness_srv"));
		actionsList.add(new LightOffAction("bf", "light_bf", "brightness_bf"));
		actionsList.add(new LightOffAction("bm", "light_bm", "brightness_bm"));
		actionsList.add(new LightOffAction("phdb", "light_phdb", "brightness_phdb"));
		actionsList.add(new LightOffAction("maestro", "light_maestro", "brightness_maestro"));
		actionsList.add(new LightOffAction("pr14", "light_pr14", "brightness_pr14"));
		actionsList.add(new LightOffAction("meet", "light_meet", "brightness_meet"));
		actionsList.add(new LightOffAction("sec", "light_sec", "brightness_sec"));
		actionsList.add(new LightOffAction("rec", "light_rec", "brightness_rec"));
		actionsList.add(new LightOffAction("chr", "light_chr", "brightness_chr"));
		actionsList.add(new LightOffAction("lab", "light_lab", "brightness_lab"));
		
		// enterSecretary
		actionsList.add(new EnterSecretaryAction("phda", "d1", "cor4"));
		actionsList.add(new EnterSecretaryAction("cor4", "d1", "phda"));
		actionsList.add(new EnterSecretaryAction("pr1", "d2", "cor4"));
		actionsList.add(new EnterSecretaryAction("cor4", "d2", "pr1"));
		actionsList.add(new EnterSecretaryAction("pr2", "d3", "cor4"));
		actionsList.add(new EnterSecretaryAction("cor4", "d3", "pr2"));
		actionsList.add(new EnterSecretaryAction("pr3", "d4", "cor4"));
		actionsList.add(new EnterSecretaryAction("cor4", "d4", "pr3"));
		actionsList.add(new EnterSecretaryAction("st", "dm", "rec"));
		actionsList.add(new EnterSecretaryAction("rec", "dm", "st"));
		actionsList.add(new EnterSecretaryAction("bd", "d5", "cor3"));
		actionsList.add(new EnterSecretaryAction("cor3", "d5", "bd"));
		actionsList.add(new EnterSecretaryAction("pr4", "d6", "cor3"));
		actionsList.add(new EnterSecretaryAction("cor3", "d6", "pr4"));
		actionsList.add(new EnterSecretaryAction("pr5", "d7", "cor3"));
		actionsList.add(new EnterSecretaryAction("cor3", "d7", "pr5"));
		actionsList.add(new EnterSecretaryAction("pr6", "d8", "cor3"));
		actionsList.add(new EnterSecretaryAction("cor3", "d8", "pr6"));
		actionsList.add(new EnterSecretaryAction("pr7", "d9", "cor3"));
		actionsList.add(new EnterSecretaryAction("cor3", "d9", "pr7"));
		actionsList.add(new EnterSecretaryAction("pr8", "d10", "cor3"));
		actionsList.add(new EnterSecretaryAction("cor3", "d10", "pr8"));
		actionsList.add(new EnterSecretaryAction("pr9", "d11", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d11", "pr9"));
		actionsList.add(new EnterSecretaryAction("pr10", "d12", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d12", "pr10"));
		actionsList.add(new EnterSecretaryAction("pr11", "d13", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d13", "pr11"));
		actionsList.add(new EnterSecretaryAction("pr12", "d14", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d14", "pr12"));
		actionsList.add(new EnterSecretaryAction("pr13", "d15", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d15", "pr13"));
		actionsList.add(new EnterSecretaryAction("srv", "d16", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d16", "srv"));
		actionsList.add(new EnterSecretaryAction("bf", "d17", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d17", "bf"));
		actionsList.add(new EnterSecretaryAction("bm", "d18", "cor1"));
		actionsList.add(new EnterSecretaryAction("cor1", "d18", "bm"));
		actionsList.add(new EnterSecretaryAction("phdb", "d19", "cor1"));
		actionsList.add(new EnterSecretaryAction("cor1", "d19", "phdb"));
		actionsList.add(new EnterSecretaryAction("maestro", "d20", "cor1"));
		actionsList.add(new EnterSecretaryAction("cor1", "d20", "maestro"));
		actionsList.add(new EnterSecretaryAction("pr14", "d21", "cor4"));
		actionsList.add(new EnterSecretaryAction("cor4", "d21", "pr14"));
		actionsList.add(new EnterSecretaryAction("prt1", "d22", "cor4"));
		actionsList.add(new EnterSecretaryAction("cor4", "d22", "prt1"));
		actionsList.add(new EnterSecretaryAction("meet", "d23", "cor1"));
		actionsList.add(new EnterSecretaryAction("cor1", "d23", "meet"));
		actionsList.add(new EnterSecretaryAction("meet", "d34", "cor4"));
		actionsList.add(new EnterSecretaryAction("cor4", "d34", "meet"));
		actionsList.add(new EnterSecretaryAction("cor4", "d35", "cor1"));
		actionsList.add(new EnterSecretaryAction("cor1", "d35", "cor4"));
		actionsList.add(new EnterSecretaryAction("cor4", "d36", "cor1"));
		actionsList.add(new EnterSecretaryAction("cor1", "d36", "cor4"));
		actionsList.add(new EnterSecretaryAction("cor4", "d37", "sec"));
		actionsList.add(new EnterSecretaryAction("sec", "d37", "cor4"));
		actionsList.add(new EnterSecretaryAction("cof", "d25", "cor1"));
		actionsList.add(new EnterSecretaryAction("cor1", "d25", "cof"));
		actionsList.add(new EnterSecretaryAction("cor1", "d26", "rec"));
		actionsList.add(new EnterSecretaryAction("rec", "d26", "cor1"));
		actionsList.add(new EnterSecretaryAction("cor1", "d38", "sec"));
		actionsList.add(new EnterSecretaryAction("sec", "d38", "cor1"));
		actionsList.add(new EnterSecretaryAction("rec", "d39", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d39", "rec"));
		actionsList.add(new EnterSecretaryAction("chr", "d29", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d29", "chr"));
		actionsList.add(new EnterSecretaryAction("prt2", "d30", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d30", "prt2"));
		actionsList.add(new EnterSecretaryAction("lab", "d40", "cor3"));
		actionsList.add(new EnterSecretaryAction("cor3", "d40", "lab"));
		actionsList.add(new EnterSecretaryAction("lab", "d41", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d41", "lab"));
		actionsList.add(new EnterSecretaryAction("prt3", "d32", "cor3"));
		actionsList.add(new EnterSecretaryAction("cor3", "d32", "prt3"));
		actionsList.add(new EnterSecretaryAction("cor3", "d42", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d42", "cor3"));
		actionsList.add(new EnterSecretaryAction("cor3", "d33", "cor2"));
		actionsList.add(new EnterSecretaryAction("cor2", "d33", "cor3"));

		// rule windowOn
		actionsList.add(new WindowOnAction("phda", "window_phda", "brightness_phda", "temperature_phda"));
		actionsList.add(new WindowOnAction("pr1", "window_pr1", "brightness_pr1", "temperature_pr1"));
		actionsList.add(new WindowOnAction("pr2", "window_pr2", "brightness_pr2", "temperature_pr2"));
		actionsList.add(new WindowOnAction("pr3", "window_pr3", "brightness_pr3", "temperature_pr3"));
		actionsList.add(new WindowOnAction("st", "window_st", "brightness_st", "temperature_st"));
		actionsList.add(new WindowOnAction("bd", "window_bd", "brightness_bd", "temperature_bd"));
		actionsList.add(new WindowOnAction("pr4", "window_pr4", "brightness_pr4", "temperature_pr4"));
		actionsList.add(new WindowOnAction("pr5", "window_pr5", "brightness_pr5", "temperature_pr5"));
		actionsList.add(new WindowOnAction("pr6", "window_pr6", "brightness_pr6", "temperature_pr6"));
		actionsList.add(new WindowOnAction("pr7", "window_pr7", "brightness_pr7", "temperature_pr7"));
		actionsList.add(new WindowOnAction("pr8", "window_pr8", "brightness_pr8", "temperature_pr8"));
		actionsList.add(new WindowOnAction("pr9", "window_pr9", "brightness_pr9", "temperature_pr9"));
		actionsList.add(new WindowOnAction("pr10", "window_pr10", "brightness_pr10", "temperature_pr10"));
		actionsList.add(new WindowOnAction("pr11", "window_pr11", "brightness_pr11", "temperature_pr11"));
		actionsList.add(new WindowOnAction("pr12", "window_pr12", "brightness_pr12", "temperature_pr12"));
		actionsList.add(new WindowOnAction("pr13", "window_pr13", "brightness_pr13", "temperature_pr13"));
		actionsList.add(new WindowOnAction("bf", "window_bf", "brightness_bf", "temperature_bf"));
		actionsList.add(new WindowOnAction("bm", "window_bm", "brightness_bm", "temperature_bm"));
		actionsList.add(new WindowOnAction("phdb", "window_phdb", "brightness_phdb", "temperature_phdb"));
		actionsList.add(new WindowOnAction("maestro", "window_maestro", "brightness_maestro", "temperature_maestro"));
		actionsList.add(new WindowOnAction("pr14", "window_pr14", "brightness_pr14", "temperature_pr14"));
		actionsList.add(new WindowOnAction("meet", "window_meet", "brightness_meet", "temperature_meet"));
		actionsList.add(new WindowOnAction("sec", "window_sec", "brightness_sec", "temperature_sec"));
		actionsList.add(new WindowOnAction("rec", "window_rec", "brightness_rec", "temperature_rec"));
		actionsList.add(new WindowOnAction("chr", "window_chr", "brightness_chr", "temperature_chr"));
		actionsList.add(new WindowOnAction("lab", "window_lab", "brightness_lab", "temperature_lab"));
		
		// rule windowOff
		actionsList.add(new WindowOffAction("phda", "window_phda", "brightness_phda", "temperature_phda"));
		actionsList.add(new WindowOffAction("pr1", "window_pr1", "brightness_pr1", "temperature_pr1"));
		actionsList.add(new WindowOffAction("pr2", "window_pr2", "brightness_pr2", "temperature_pr2"));
		actionsList.add(new WindowOffAction("pr3", "window_pr3", "brightness_pr3", "temperature_pr3"));
		actionsList.add(new WindowOffAction("st", "window_st", "brightness_st", "temperature_st"));
		actionsList.add(new WindowOffAction("bd", "window_bd", "brightness_bd", "temperature_bd"));
		actionsList.add(new WindowOffAction("pr4", "window_pr4", "brightness_pr4", "temperature_pr4"));
		actionsList.add(new WindowOffAction("pr5", "window_pr5", "brightness_pr5", "temperature_pr5"));
		actionsList.add(new WindowOffAction("pr6", "window_pr6", "brightness_pr6", "temperature_pr6"));
		actionsList.add(new WindowOffAction("pr7", "window_pr7", "brightness_pr7", "temperature_pr7"));
		actionsList.add(new WindowOffAction("pr8", "window_pr8", "brightness_pr8", "temperature_pr8"));
		actionsList.add(new WindowOffAction("pr9", "window_pr9", "brightness_pr9", "temperature_pr9"));
		actionsList.add(new WindowOffAction("pr10", "window_pr10", "brightness_pr10", "temperature_pr10"));
		actionsList.add(new WindowOffAction("pr11", "window_pr11", "brightness_pr11", "temperature_pr11"));
		actionsList.add(new WindowOffAction("pr12", "window_pr12", "brightness_pr12", "temperature_pr12"));
		actionsList.add(new WindowOffAction("pr13", "window_pr13", "brightness_pr13", "temperature_pr13"));
		actionsList.add(new WindowOffAction("bf", "window_bf", "brightness_bf", "temperature_bf"));
		actionsList.add(new WindowOffAction("bm", "window_bm", "brightness_bm", "temperature_bm"));
		actionsList.add(new WindowOffAction("phdb", "window_phdb", "brightness_phdb", "temperature_phdb"));
		actionsList.add(new WindowOffAction("maestro", "window_maestro", "brightness_maestro", "temperature_maestro"));
		actionsList.add(new WindowOffAction("pr14", "window_pr14", "brightness_pr14", "temperature_pr14"));
		actionsList.add(new WindowOffAction("meet", "window_meet", "brightness_meet", "temperature_meet"));
		actionsList.add(new WindowOffAction("sec", "window_sec", "brightness_sec", "temperature_sec"));
		actionsList.add(new WindowOffAction("rec", "window_rec", "brightness_rec", "temperature_rec"));
		actionsList.add(new WindowOffAction("chr", "window_chr", "brightness_chr", "temperature_chr"));
		actionsList.add(new WindowOffAction("lab", "window_lab", "brightness_lab", "temperature_lab"));
		
		// rule collectAsset
		actionsList.add(new CollectAssetAction("prt1", "printer_prt1"));
		actionsList.add(new CollectAssetAction("prt2", "printer_prt2"));
		actionsList.add(new CollectAssetAction("prt3", "printer_prt3"));
		
		// rule heaterOn
		actionsList.add(new HeaterOnAction("phda", "heater_phda", "temperature_phda"));
		actionsList.add(new HeaterOnAction("pr1", "heater_pr1", "temperature_pr1"));
		actionsList.add(new HeaterOnAction("pr2", "heater_pr2", "temperature_pr2"));
		actionsList.add(new HeaterOnAction("pr3", "heater_pr3", "temperature_pr3"));
		actionsList.add(new HeaterOnAction("st", "heater_st", "temperature_st"));
		actionsList.add(new HeaterOnAction("bd", "heater_bd", "temperature_bd"));
		actionsList.add(new HeaterOnAction("pr4", "heater_pr4", "temperature_pr4"));
		actionsList.add(new HeaterOnAction("pr5", "heater_pr5", "temperature_pr5"));
		actionsList.add(new HeaterOnAction("pr6", "heater_pr6", "temperature_pr6"));
		actionsList.add(new HeaterOnAction("pr7", "heater_pr7", "temperature_pr7"));
		actionsList.add(new HeaterOnAction("pr8", "heater_pr8", "temperature_pr8"));
		actionsList.add(new HeaterOnAction("pr9", "heater_pr9", "temperature_pr9"));
		actionsList.add(new HeaterOnAction("pr10", "heater_pr10", "temperature_pr10"));
		actionsList.add(new HeaterOnAction("pr11", "heater_pr11", "temperature_pr11"));
		actionsList.add(new HeaterOnAction("pr12", "heater_pr12", "temperature_pr12"));
		actionsList.add(new HeaterOnAction("pr13", "heater_pr13", "temperature_pr13"));
		actionsList.add(new HeaterOnAction("bf", "heater_bf", "temperature_bf"));
		actionsList.add(new HeaterOnAction("bm", "heater_bm", "temperature_bm"));
		actionsList.add(new HeaterOnAction("phdb", "heater_phdb", "temperature_phdb"));
		actionsList.add(new HeaterOnAction("maestro", "heater_maestro", "temperature_maestro"));
		actionsList.add(new HeaterOnAction("pr14", "heater_pr14", "temperature_pr14"));
		actionsList.add(new HeaterOnAction("meet", "heater_meet", "temperature_meet"));
		actionsList.add(new HeaterOnAction("sec", "heater_sec", "temperature_sec"));
		actionsList.add(new HeaterOnAction("rec", "heater_rec", "temperature_rec"));
		actionsList.add(new HeaterOnAction("chr", "heater_chr", "temperature_chr"));
		actionsList.add(new HeaterOnAction("lab", "heater_lab", "temperature_lab"));
		
		// rule heaterOff
		actionsList.add(new HeaterOffAction("phda", "heater_phda", "temperature_phda"));
		actionsList.add(new HeaterOffAction("pr1", "heater_pr1", "temperature_pr1"));
		actionsList.add(new HeaterOffAction("pr2", "heater_pr2", "temperature_pr2"));
		actionsList.add(new HeaterOffAction("pr3", "heater_pr3", "temperature_pr3"));
		actionsList.add(new HeaterOffAction("st", "heater_st", "temperature_st"));
		actionsList.add(new HeaterOffAction("bd", "heater_bd", "temperature_bd"));
		actionsList.add(new HeaterOffAction("pr4", "heater_pr4", "temperature_pr4"));
		actionsList.add(new HeaterOffAction("pr5", "heater_pr5", "temperature_pr5"));
		actionsList.add(new HeaterOffAction("pr6", "heater_pr6", "temperature_pr6"));
		actionsList.add(new HeaterOffAction("pr7", "heater_pr7", "temperature_pr7"));
		actionsList.add(new HeaterOffAction("pr8", "heater_pr8", "temperature_pr8"));
		actionsList.add(new HeaterOffAction("pr9", "heater_pr9", "temperature_pr9"));
		actionsList.add(new HeaterOffAction("pr10", "heater_pr10", "temperature_pr10"));
		actionsList.add(new HeaterOffAction("pr11", "heater_pr11", "temperature_pr11"));
		actionsList.add(new HeaterOffAction("pr12", "heater_pr12", "temperature_pr12"));
		actionsList.add(new HeaterOffAction("pr13", "heater_pr13", "temperature_pr13"));
		actionsList.add(new HeaterOffAction("bf", "heater_bf", "temperature_bf"));
		actionsList.add(new HeaterOffAction("bm", "heater_bm", "temperature_bm"));
		actionsList.add(new HeaterOffAction("phdb", "heater_phdb", "temperature_phdb"));
		actionsList.add(new HeaterOffAction("maestro", "heater_maestro", "temperature_maestro"));
		actionsList.add(new HeaterOffAction("pr14", "heater_pr14", "temperature_pr14"));
		actionsList.add(new HeaterOffAction("meet", "heater_meet", "temperature_meet"));
		actionsList.add(new HeaterOffAction("sec", "heater_sec", "temperature_sec"));
		actionsList.add(new HeaterOffAction("rec", "heater_rec", "temperature_rec"));
		actionsList.add(new HeaterOffAction("chr", "heater_chr", "temperature_chr"));
		actionsList.add(new HeaterOffAction("lab", "heater_lab", "temperature_lab"));
		
		// Set for roomba, cleannessState
		String[] roombaSet = {"roomba_0", "roomba_1", "roomba_2", "roomba_3", "roomba_4"};
		String[] cleannessSet = {"clean", "dirty"};
		
		// rule RoombaEnter
		for(String roomba : roombaSet) {
			for(String cleanness : cleannessSet) {
				actionsList.add(new RoombaEnterAction("phda", "d1", "cor4", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor4", "d1", "phda", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr1", "d2", "cor4", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor4", "d2", "pr1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr2", "d3", "cor4", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor4", "d3", "pr2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr3", "d4", "cor4", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor4", "d4", "pr3", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("st", "dm", "rec", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("rec", "dm", "st", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("bd", "d5", "cor3", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor3", "d5", "bd", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr4", "d6", "cor3", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor3", "d6", "pr4", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr5", "d7", "cor3", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor3", "d7", "pr5", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr6", "d8", "cor3", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor3", "d8", "pr6", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr7", "d9", "cor3", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor3", "d9", "pr7", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr8", "d10", "cor3", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor3", "d10", "pr8", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr9", "d11", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d11", "pr9", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr10", "d12", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d12", "pr10", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr11", "d13", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d13", "pr11", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr12", "d14", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d14", "pr12", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr13", "d15", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d15", "pr13", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("srv", "d16", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d16", "srv", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("bf", "d17", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d17", "bf", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("bm", "d18", "cor1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor1", "d18", "bm", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("phdb", "d19", "cor1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor1", "d19", "phdb", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("maestro", "d20", "cor1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor1", "d20", "maestro", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("pr14", "d21", "cor4", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor4", "d21", "pr14", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("prt1", "d22", "cor4", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor4", "d22", "prt1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("meet", "d23", "cor1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor1", "d23", "meet", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("meet", "d34", "cor4", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor4", "d34", "meet", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor4", "d35", "cor1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor1", "d35", "cor4", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor4", "d36", "cor1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor1", "d36", "cor4", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor4", "d37", "sec", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("sec", "d37", "cor4", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cof", "d25", "cor1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor1", "d25", "cof", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor1", "d26", "rec", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("rec", "d26", "cor1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor1", "d38", "sec", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("sec", "d38", "cor1", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("rec", "d39", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d39", "rec", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("chr", "d29", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d29", "chr", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("prt2", "d30", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d30", "prt2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("lab", "d40", "cor3", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor3", "d40", "lab", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("lab", "d41", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d41", "lab", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("prt3", "d32", "cor3", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor3", "d32", "prt3", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor3", "d42", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d42", "cor3", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor3", "d33", "cor2", roomba, cleanness));
				actionsList.add(new RoombaEnterAction("cor2", "d33", "cor3", roomba, cleanness));
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
						if(tmpMutexFactsList.contains(new Pair<Fact, Fact>(p, q))) {
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
	
	private int computeDuration(ArrayList<Fact> intialState, TransformationSolution solution, HashSet<Pair<Action, Action>> mutexActionsList) {
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
				case "enterSecretary":
					obj1 = variable.getParameterValue("fromRoomName");
					Object obj2 = variable.getParameterValue("door");
					Object obj3 = variable.getParameterValue("toRoomName");
					if(obj1 instanceof String && obj2 instanceof String &&
							obj3 instanceof String) {
						String fromRoomName = (String) obj1;
						String doorName = (String) obj2;
						String toRoomName = (String) obj3;
						currentAction = new EnterSecretaryAction(fromRoomName, doorName, toRoomName);
					}
					break;
				case "windowOn":
					obj1 = variable.getParameterValue("roomName");
					if(obj1 instanceof String) {
						String roomName = (String)obj1;
						String windowName = "window_"+roomName;
						String brightnessName = "brightness_"+roomName;
						String temperatureName = "temperature_"+roomName;
						currentAction = new WindowOnAction(roomName, windowName, brightnessName, temperatureName);
					}
					break;
				case "windowOff":
					obj1 = variable.getParameterValue("roomName");
					if(obj1 instanceof String) {
						String roomName = (String) obj1;
						String windowName = "window_"+roomName;
						String brightnessName = "brightness_"+roomName;
						String temperatureName = "temperature_"+roomName;
						currentAction = new WindowOffAction(roomName, windowName, brightnessName, temperatureName);
					}
					break;
				case "collectAsset":
					obj1 = variable.getParameterValue("roomName");
					if(obj1 instanceof String) {
						String roomName = (String) obj1;
						String printerName = "printer_"+roomName;
						currentAction = new CollectAssetAction(roomName, printerName);
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
				case "roombaEnter":
					obj1 = variable.getParameterValue("fromRoomName");
					obj2 = variable.getParameterValue("door");
					obj3 = variable.getParameterValue("toRoomName");
					Object obj4 = variable.getParameterValue("roombaName");
					Object obj5 = variable.getParameterValue("cleanness");
					if(obj1 instanceof String && obj2 instanceof String &&
							obj3 instanceof String && obj4 instanceof String &&
							obj5 instanceof String) {
						String fromRoomName = (String) obj1;
						String doorName = (String) obj2;
						String toRoomName = (String) obj3;
						String roombaName = ((String) obj4).substring(10);
						String cleanness = (String) obj5;
						currentAction = new RoombaEnterAction(fromRoomName, doorName, toRoomName, roombaName, cleanness);
					}
					break;
				default:
					System.out.println("Error: the rule name "+ruleName+" do not exist.");
				}
				
				// compute start point
				int startPoint = 0;
				boolean executable = true;
				for(Fact factItem : currentAction.getPreFactsList()) {
					if(!systemState.containsKey(factItem)) {
						executable = false;
						break;
					}
					if(startPoint < systemState.get(factItem))
						startPoint = systemState.get(factItem);
				}
				if(!executable)
					continue;
				
				for(Fact factItem : currentAction.getDelFactsList()) {
					if(!systemState.containsKey(factItem)) {
						executable = false;
						break;
					}
					if(startPoint < systemState.get(factItem))
						startPoint = systemState.get(factItem);
				}
				if(!executable)
					continue;
				
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
	
	public static int durationCal(Solution solution) {
		if(solution instanceof TransformationSolution)
			return pl.computeDuration(pl.initialState, (TransformationSolution)solution, pl.mutexFactsList);
		return -1;
	}
	
	public static boolean durationValidate(Solution solution) {
		if(solution instanceof TransformationSolution) {
			return pl.computeDuration(pl.initialState, (TransformationSolution) solution, pl.mutexFactsList) <= pl.executionTime;
		}
		
		return false;
	}
}
