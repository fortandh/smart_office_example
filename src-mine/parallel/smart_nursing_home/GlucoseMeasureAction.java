package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class GlucoseMeasureAction extends Action {

	private String elderName;
	private String bySelfName;
	private String diabetesName;
	private String glucoseMeasuredName;
	private String checkingRoomName;
	
	public GlucoseMeasureAction(String elderName, String checkingRoomName) {
		super();
		this.elderName = elderName;
		this.bySelfName = "bySelf_"+elderName.charAt(elderName.length()-1);
		this.diabetesName = "diabetes_"+elderName.charAt(elderName.length()-1);
		this.glucoseMeasuredName = "glucoseMeasured_"+elderName.charAt(elderName.length()-1);
		this.checkingRoomName = checkingRoomName;
		
		// pre
		this.putPreFact(new HaveFact(elderName, bySelfName));
		this.putPreFact(new IsFact(bySelfName, "true"));
		this.putPreFact(new HaveFact(elderName, diabetesName));
		this.putPreFact(new HaveFact(diabetesName, glucoseMeasuredName));
		this.putPreFact(new HaveFact(elderName, checkingRoomName));
		this.putPreFact(new HaveFact(checkingRoomName, elderName));
		
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
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof GlucoseMeasureAction)) return false;
		GlucoseMeasureAction objAction = (GlucoseMeasureAction) obj;
		return this.elderName.equals(objAction.getElderName()) && this.checkingRoomName.equals(objAction.getCheckingRoomName());
	}
}
