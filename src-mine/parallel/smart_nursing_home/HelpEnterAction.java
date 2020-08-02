package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;

public class HelpEnterAction extends Action {

	private String fromRoomName;
	private String doorName;
	private String toRoomName;
	private String elderName;
	private String careWorkerName;
	
	public HelpEnterAction(String fromRoomName, String doorName, String toRoomName, String elderName, String careWorkerName) {
		super();
		this.fromRoomName = fromRoomName;
		this.doorName = doorName;
		this.toRoomName = toRoomName;
		this.elderName = elderName;
		this.careWorkerName = careWorkerName;
		
		// pre
		this.putPreFact(new HaveFact(doorName, fromRoomName));
		this.putPreFact(new HaveFact(doorName, toRoomName));
		
		// del
		this.putDelFact(new HaveFact(elderName, fromRoomName));
		this.putDelFact(new HaveFact(fromRoomName, elderName));
		this.putDelFact(new HaveFact(careWorkerName, fromRoomName));
		this.putDelFact(new HaveFact(fromRoomName, careWorkerName));
		
		// add
		this.putAddFact(new HaveFact(elderName, toRoomName));
		this.putAddFact(new HaveFact(toRoomName, elderName));
		this.putAddFact(new HaveFact(careWorkerName, toRoomName));
		this.putAddFact(new HaveFact(toRoomName, careWorkerName));
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
	
	public String getCareWorkerName() {
		return this.careWorkerName;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HelpEnterAction)) return false;
		HelpEnterAction objAction = (HelpEnterAction) obj;
		return this.fromRoomName.equals(objAction.getFromRoomName()) && this.doorName.equals(objAction.getDoorName()) &&
				this.toRoomName.equals(objAction.getToRoomName()) && this.elderName.equals(objAction.getElderName()) &&
				this.careWorkerName.equals(objAction.getCareWorkerName());
	}
}
