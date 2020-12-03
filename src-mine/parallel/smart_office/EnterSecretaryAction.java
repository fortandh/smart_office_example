package parallel.smart_office;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class EnterSecretaryAction extends Action {
	private String fromRoomName;
	private String doorName;
	private String toRoomName;
	private String secretaryName;
	
	public EnterSecretaryAction(String fromRoomName, String doorName, String toRoomName) {
		super("EnterSecretary");
		this.fromRoomName = fromRoomName;
		this.doorName = doorName;
		this.toRoomName = toRoomName;
		this.secretaryName = "carmen";
		
		// pre
		this.putPreFact(new HaveFact(doorName, fromRoomName));
		this.putPreFact(new HaveFact(doorName, toRoomName));
		
		// del
		this.putDelFact(new HaveFact(secretaryName, fromRoomName));
		this.putDelFact(new HaveFact(fromRoomName, secretaryName));
		
		// add
		this.putAddFact(new HaveFact(secretaryName, toRoomName));
		this.putAddFact(new HaveFact(toRoomName, secretaryName));
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
	
	public String getSecretaryName() {
		return this.secretaryName;
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
		
		stringGen.append("secretaryName: ");
		stringGen.append(this.secretaryName);
		stringGen.append("\n");
		
		return stringGen.toString();
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof EnterSecretaryAction)) return false;
		EnterSecretaryAction objAction = (EnterSecretaryAction) obj;
		return this.fromRoomName.equals(objAction.getFromRoomName()) && this.doorName.equals(objAction.getDoorName()) &&
				this.toRoomName.equals(objAction.getToRoomName());
	}
}
