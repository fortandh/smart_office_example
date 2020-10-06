package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class HelpBloodOxygenCheckAction extends Action {

	private String elderName;
	private String bySelfName;
	private String careWorkerName;
	private String bloodOxygenCheckName;
	private String checkingRoomName;
	
	public HelpBloodOxygenCheckAction(String elderName, String checkingRoomName, String careWorkerName) {
		super("HelpBloodOxygenCheck");
		this.elderName = elderName;
		this.bySelfName = "bySelf_"+elderName.charAt(elderName.length()-1);
		this.careWorkerName = careWorkerName;
		this.bloodOxygenCheckName = "bloodOxygenCheck_"+elderName.charAt(elderName.length()-1);
		this.checkingRoomName = checkingRoomName;
		
		// pre
		this.putPreFact(new HaveFact(elderName, bySelfName));
		this.putPreFact(new IsFact(bySelfName, "false"));
		this.putPreFact(new HaveFact(elderName, bloodOxygenCheckName));
		this.putPreFact(new HaveFact(elderName, checkingRoomName));
		this.putPreFact(new HaveFact(checkingRoomName, elderName));
		this.putPreFact(new HaveFact(careWorkerName, checkingRoomName));
		this.putPreFact(new HaveFact(checkingRoomName, careWorkerName));
		
		// del
		this.putDelFact(new IsFact(bloodOxygenCheckName, "false"));
		
		// add
		this.putAddFact(new IsFact(bloodOxygenCheckName, "true"));
	}
	
	public String getElderName() {
		return this.elderName;
	}
	
	public String getBySelfName() {
		return this.bySelfName;
	}
	
	public String getCheckingRoomName() {
		return this.checkingRoomName;
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
		
		stringGen.append("checkingRoomName: ");
		stringGen.append(this.checkingRoomName);
		stringGen.append("\n");
		
		stringGen.append("careWorkerName: ");
		stringGen.append(this.careWorkerName);
		stringGen.append("\n");
		
		return stringGen.toString();
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HelpBloodOxygenCheckAction)) return false;
		HelpBloodOxygenCheckAction objAction = (HelpBloodOxygenCheckAction) obj;
		return this.elderName.equals(objAction.getElderName()) && 
				this.checkingRoomName.equals(objAction.getCheckingRoomName()) &&
				this.careWorkerName.equals(objAction.getCareWorkerName());
	}
}
