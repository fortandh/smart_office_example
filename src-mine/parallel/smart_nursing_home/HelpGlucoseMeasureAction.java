package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class HelpGlucoseMeasureAction extends Action{

	private String elderName;
	private String careWorkerName;
	private String diabetesName;
	private String glucoseMeasuredName;
	private String checkingRoomName;
	
	public HelpGlucoseMeasureAction(String elderName, String checkingRoomName, String careWorkerName) {
		super();
		this.elderName = elderName;
		this.careWorkerName = careWorkerName;
		this.diabetesName = "diabetes_"+elderName.charAt(elderName.length()-1);
		this.glucoseMeasuredName = "glucoseMeasured_"+elderName.charAt(elderName.length()-1);
		this.checkingRoomName = checkingRoomName;
		
		// pre
		this.putPreFact(new HaveFact(elderName, diabetesName));
		this.putPreFact(new HaveFact(diabetesName, glucoseMeasuredName));
		this.putPreFact(new HaveFact(elderName, checkingRoomName));
		this.putPreFact(new HaveFact(checkingRoomName, elderName));
		this.putPreFact(new HaveFact(careWorkerName, checkingRoomName));
		this.putPreFact(new HaveFact(checkingRoomName, careWorkerName));
		
		// del
		this.putDelFact(new IsFact(glucoseMeasuredName, "false"));
		
		// add
		this.putAddFact(new IsFact(glucoseMeasuredName, "true"));
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
		if(!(obj instanceof HelpGlucoseMeasureAction)) return false;
		HelpGlucoseMeasureAction objAction = (HelpGlucoseMeasureAction) obj;
		return this.elderName.equals(objAction.getElderName()) && this.checkingRoomName.equals(objAction.getCheckingRoomName()) &&
				this.careWorkerName.equals(objAction.getCareWorkerName());
	}
}
