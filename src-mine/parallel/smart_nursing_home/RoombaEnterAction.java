package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class RoombaEnterAction extends Action {

	private String fromRoomName;
	private String doorName;
	private String toRoomName;
	private String roombaName;
	private String cleannessName;
	private String cleannessStatus;
	
	public RoombaEnterAction(String fromRoomName, String doorName, String toRoomName, String roombaName, String cleannessStatus) {
		super();
		this.fromRoomName = fromRoomName;
		this.doorName = doorName;
		this.toRoomName = toRoomName;
		this.roombaName = roombaName;
		this.cleannessName = "cleanness_"+toRoomName;
		this.cleannessStatus = cleannessStatus;
		
		// pre
		this.putPreFact(new HaveFact(doorName, fromRoomName));
		this.putPreFact(new HaveFact(doorName, toRoomName));
		this.putPreFact(new HaveFact(toRoomName, cleannessName));
		
		// del
		this.putDelFact(new HaveFact(roombaName, fromRoomName));
		this.putDelFact(new HaveFact(fromRoomName, roombaName));
		this.putDelFact(new IsFact(cleannessName, cleannessStatus));
		
		// add
		this.putAddFact(new HaveFact(roombaName, toRoomName));
		this.putAddFact(new HaveFact(toRoomName, roombaName));
		this.putAddFact(new IsFact(cleannessName, "clean"));
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
	
	public String getRoombaName() {
		return this.roombaName;
	}
	
	public String getCleannessStatus() {
		return this.cleannessStatus;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof RoombaEnterAction)) return false;
		RoombaEnterAction objAction = (RoombaEnterAction) obj;
		return this.fromRoomName.equals(objAction.getFromRoomName()) && this.doorName.equals(objAction.getDoorName()) &&
				this.toRoomName.equals(objAction.getToRoomName()) && this.roombaName.equals(objAction.getRoombaName()) &&
				this.cleannessStatus.equals(objAction.getCleannessStatus());
	}
}
