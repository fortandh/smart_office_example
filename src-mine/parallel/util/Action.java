package parallel.util;

import java.util.ArrayList;

public class Action {
	
	private ArrayList<Fact> preFactsList;
	private ArrayList<Fact> delFactsList;
	private ArrayList<Fact> addFactsList;
	
	public Action() {
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
	
	public ArrayList<Fact> getPreFactsList() {
		return this.preFactsList;
	}
	
	public ArrayList<Fact> getDelFactsList() {
		return this.delFactsList;
	}
	
	public ArrayList<Fact> getAddFactsList() {
		return this.addFactsList;
	}
	
	public int hashCode() {
		int result;
		result = preFactsList.hashCode();
		result = result*28 + delFactsList.hashCode();
		result = result*28 + addFactsList.hashCode();
		return result;
	}
}
