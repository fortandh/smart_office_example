package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class HelpBloodOxygenCheckAction extends Action {

	private String elderName;
	private String careWorkerName;
	private String bloodOxygenCheckName;
	private String checkingRoomName;
	
	public HelpBloodOxygenCheckAction(String elderName, String checkingRoomName, String careWorkerName) {
		super();
		this.elderName = elderName;
		this.careWorkerName = careWorkerName;
		this.bloodOxygenCheckName = "bloodOxygenCheck_"+elderName.charAt(elderName.length()-1);
		this.checkingRoomName = checkingRoomName;
		
		// pre
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
	
	public String getCheckingRoomName() {
		return this.checkingRoomName;
	}
	
	public String getCareWorkerName() {
		return this.careWorkerName;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HelpBloodOxygenCheckAction)) return false;
		HelpBloodOxygenCheckAction objAction = (HelpBloodOxygenCheckAction) obj;
		return this.elderName.equals(objAction.getElderName()) && this.checkingRoomName.equals(objAction.getCheckingRoomName()) &&
				this.careWorkerName.equals(objAction.getCareWorkerName());
	}
}
