package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;

public class CareWorkerEnterAction extends Action {

	private String fromRoomName;
	private String doorName;
	private String toRoomName;
	private String careWorkerName;
	
	public CareWorkerEnterAction(String fromRoomName, String doorName, String toRoomName, String careWorkerName) {
		super();
		this.fromRoomName = fromRoomName;
		this.doorName = doorName;
		this.toRoomName = toRoomName;
		this.careWorkerName = careWorkerName;
		
		// pre
		this.putPreFact(new HaveFact(doorName, fromRoomName));
		this.putPreFact(new HaveFact(doorName, toRoomName));
		
		// del
		this.putDelFact(new HaveFact(careWorkerName, fromRoomName));
		this.putDelFact(new HaveFact(fromRoomName, careWorkerName));
		
		// add
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
	
	public String getCareWorkerName() {
		return this.careWorkerName;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof CareWorkerEnterAction)) return false;
		CareWorkerEnterAction objAction = (CareWorkerEnterAction) obj;
		return this.fromRoomName.equals(objAction.getFromRoomName()) && this.doorName.equals(objAction.getDoorName()) &&
				this.toRoomName.equals(objAction.getToRoomName()) && this.careWorkerName.equals(objAction.getCareWorkerName());
	}
}
