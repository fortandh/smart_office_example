package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class HelpTakeAspirinAction extends Action {

	private String elderName;
	private String heartAttackName;
	private String aspirinTakenName;
	private String roomName;
	private String careWorkerName;
	
	public HelpTakeAspirinAction(String elderName, String roomName, String careWorkerName) {
		super();
		this.elderName = elderName;
		this.heartAttackName = "heart_attack_"+elderName.charAt(elderName.length()-1);
		this.aspirinTakenName = "aspirinTaken_"+elderName.charAt(elderName.length()-1);
		this.roomName = roomName;
		this.careWorkerName = careWorkerName;
		
		// pre
		this.putPreFact(new HaveFact(elderName, heartAttackName));
		this.putPreFact(new HaveFact(heartAttackName, aspirinTakenName));
		this.putPreFact(new HaveFact(elderName, roomName));
		this.putPreFact(new HaveFact(roomName, elderName));
		this.putPreFact(new HaveFact(careWorkerName, roomName));
		this.putPreFact(new HaveFact(roomName, careWorkerName));
		
		// del
		this.putDelFact(new HaveFact(careWorkerName, "aspirin"));
		this.putDelFact(new IsFact(aspirinTakenName, "false"));
		
		// add
		this.putAddFact(new IsFact(aspirinTakenName, "true"));
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
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HelpTakeAspirinAction)) return false;
		HelpTakeAspirinAction objAction = (HelpTakeAspirinAction) obj;
		return this.elderName.equals(objAction.getElderName()) && this.roomName.equals(objAction.getRoomName()) &&
				this.careWorkerName.equals(objAction.getCareWorkerName());
	}
}
