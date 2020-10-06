package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class ElderEnterAction extends Action {
	
	private String fromRoomName;
	private String doorName;
	private String toRoomName;
	private String elderName;
	
	public ElderEnterAction(String fromRoomName, String doorName, String toRoomName, String elderName) {
		super("ElderEnter");
		this.fromRoomName = fromRoomName;
		this.doorName = doorName;
		this.toRoomName = toRoomName;
		this.elderName = elderName;
		
		// pre
		this.putPreFact(new HaveFact(doorName, fromRoomName));
		this.putPreFact(new HaveFact(doorName, toRoomName));
		
		// del
		this.putDelFact(new HaveFact(elderName, fromRoomName));
		this.putDelFact(new HaveFact(fromRoomName, elderName));
		
		// add
		this.putAddFact(new HaveFact(elderName, toRoomName));
		this.putAddFact(new HaveFact(toRoomName, elderName));
	}
	
	public String getFromRoomName() {
		return this.fromRoomName;
	}
	
	public String getDoorName() {
		return this.doorName;
	}
	
	public String getToRoomName() {
		return this.toRoomName;
	}
	
	public String getElderName() {
		return this.elderName;
	}
	
	public String toString() {		
		StringBuilder stringGen = new StringBuilder();
		stringGen.append("ActionName: ");
		stringGen.append(this.getActionName());
		stringGen.append("\n");
		
		stringGen.append("fromRoomName: ");
		stringGen.append(this.fromRoomName);
		stringGen.append("\n");
		
		stringGen.append("doorName: ");
		stringGen.append(this.doorName);
		stringGen.append("\n");
		
		stringGen.append("toRoomName: ");
		stringGen.append(this.toRoomName);
		stringGen.append("\n");
		
		stringGen.append("elderName: ");
		stringGen.append(this.elderName);
		stringGen.append("\n");
		
		return stringGen.toString();
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof ElderEnterAction)) return false;
		ElderEnterAction objAction = (ElderEnterAction) obj;
		return this.fromRoomName.equals(objAction.getFromRoomName()) && this.doorName.equals(objAction.getDoorName()) &&
				this.toRoomName.equals(objAction.getToRoomName()) && this.elderName.equals(objAction.getElderName());
	}
}
