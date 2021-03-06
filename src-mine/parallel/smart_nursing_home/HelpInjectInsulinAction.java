package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class HelpInjectInsulinAction extends Action {

	private String elderName;
	private String bySelfName;
	private String diabetesName;
	private String insulinInjectedName;
	private String roomName;
	private String careWorkerName;
	
	public HelpInjectInsulinAction(String elderName, String roomName, String careWorkerName) {
		super("HelpInjectInsulin");
		this.elderName = elderName;
		this.bySelfName = "bySelf_"+elderName.charAt(elderName.length()-1);
		this.diabetesName = "diabetes_"+elderName.charAt(elderName.length()-1);
		this.insulinInjectedName = "insulinInjected_"+elderName.charAt(elderName.length()-1);
		this.roomName = roomName;
		this.careWorkerName = careWorkerName;
		
		// pre
		this.putPreFact(new HaveFact(elderName, bySelfName));
		this.putPreFact(new IsFact(bySelfName, "false"));
		this.putPreFact(new HaveFact(elderName, diabetesName));
		this.putPreFact(new HaveFact(diabetesName, insulinInjectedName));
		this.putPreFact(new HaveFact(elderName, roomName));
		this.putPreFact(new HaveFact(roomName, elderName));
		this.putPreFact(new HaveFact(careWorkerName, roomName));
		this.putPreFact(new HaveFact(roomName, careWorkerName));
		
		// del
		this.putDelFact(new HaveFact(careWorkerName, "insulin"));
		this.putDelFact(new IsFact(insulinInjectedName, "false"));
		
		// add
		this.putAddFact(new IsFact(insulinInjectedName, "true"));
	}
	
	public String getElderName() {
		return this.elderName;
	}
	
	public String getRoomName() {
		return this.roomName;
	}
	
	public String getCareWorkerName() {
		return this.careWorkerName;
	}
	
	public String toString() {		
		StringBuilder stringGen = new StringBuilder();
		stringGen.append("ActionName: ");
		stringGen.append(this.getActionName());
		stringGen.append("\n");
		
		stringGen.append("elderName: ");
		stringGen.append(this.elderName);
		stringGen.append("\n");
		
		stringGen.append("roomName: ");
		stringGen.append(this.roomName);
		stringGen.append("\n");
		
		stringGen.append("careWorkerName: ");
		stringGen.append(this.careWorkerName);
		stringGen.append("\n");
		
		return stringGen.toString();
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HelpInjectInsulinAction)) return false;
		HelpInjectInsulinAction objAction = (HelpInjectInsulinAction) obj;
		return this.elderName.equals(objAction.getElderName()) && this.roomName.equals(objAction.getRoomName()) &&
				this.careWorkerName.equals(objAction.getCareWorkerName());
	}
}
