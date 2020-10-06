package parallel.util;

import java.util.ArrayList;

public class Action {
	
	private String actionName;
	private ArrayList<Fact> preFactsList;
	private ArrayList<Fact> delFactsList;
	private ArrayList<Fact> addFactsList;
	
	public Action(String actionName) {
		this.actionName = actionName;
		preFactsList = new ArrayList<Fact>();
		delFactsList = new ArrayList<Fact>();
		addFactsList = new ArrayList<Fact>();
	}
	
	public void putPreFact(Fact fact) {
		preFactsList.add(fact);
	}
	
	public void putDelFact(Fact fact) {
		delFactsList.add(fact);
	}
	
	public void putAddFact(Fact fact) {
		addFactsList.add(fact);
	}
	
	public String getActionName() {
		return this.actionName;
	}
	
	public ArrayList<Fact> getPreFactsList() {
		return this.preFactsList;
	}
	
	public ArrayList<Fact> getDelFactsList() {
		return this.delFactsList;
	}
	
	public ArrayList<Fact> getAddFactsList() {
		return this.addFactsList;
	}
	
	public String toString() {
		return this.actionName;
	}
	
	public int hashCode() {
		int result;
		result = preFactsList.hashCode();
		result = result*28 + delFactsList.hashCode();
		result = result*28 + addFactsList.hashCode();
		return result;
	}
}
