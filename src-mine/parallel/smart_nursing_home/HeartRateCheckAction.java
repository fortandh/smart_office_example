package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class HeartRateCheckAction extends Action {

	private String elderName;
	private String bySelfName;
	private String heartAttackName;
	private String heartRateCheckName;
	private String checkingRoomName;
	
	public HeartRateCheckAction(String elderName, String checkingRoomName) {
		super("HeartRateCheck");
		this.elderName = elderName;
		this.bySelfName = "bySelf_"+elderName.charAt(elderName.length()-1);
		this.heartAttackName = "heart_attack_"+elderName.charAt(elderName.length()-1);
		this.heartRateCheckName = "heartRateCheck_"+elderName.charAt(elderName.length()-1);
		this.checkingRoomName = checkingRoomName;
		
		// pre
		this.putPreFact(new HaveFact(elderName, bySelfName));
		this.putPreFact(new IsFact(bySelfName, "true"));
		this.putPreFact(new HaveFact(elderName, heartAttackName));
		this.putPreFact(new HaveFact(heartAttackName, heartRateCheckName));
		this.putPreFact(new HaveFact(elderName, checkingRoomName));
		this.putPreFact(new HaveFact(checkingRoomName, elderName));
		
		// del
		this.putDelFact(new IsFact(heartRateCheckName, "false"));
		
		// add
		this.putAddFact(new IsFact(heartRateCheckName, "true"));
	}
	
	public String getElderName() {
		return this.elderName;
	}
	
	public String getCheckingRoomName() {
		return this.checkingRoomName;
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
		
		return stringGen.toString();
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HeartRateCheckAction)) return false;
		HeartRateCheckAction objAction = (HeartRateCheckAction) obj;
		return this.elderName.equals(objAction.getElderName()) && this.checkingRoomName.equals(objAction.getCheckingRoomName());
	}
}
