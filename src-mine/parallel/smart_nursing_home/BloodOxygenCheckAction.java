package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class BloodOxygenCheckAction extends Action {

	private String elderName;
	private String bySelfName;
	private String bloodOxygenCheckName;
	private String checkingRoomName;
	
	public BloodOxygenCheckAction(String elderName, String checkingRoomName) {
		super("BloodOxygenCheck");
		this.elderName = elderName;
		this.bySelfName = "bySelf_"+elderName.charAt(elderName.length()-1);
		this.bloodOxygenCheckName = "bloodOxygenCheck_"+elderName.charAt(elderName.length()-1);
		this.checkingRoomName = checkingRoomName;
		
		// pre
		this.putPreFact(new HaveFact(elderName, bySelfName));
		this.putPreFact(new IsFact(bySelfName, "true"));
		this.putPreFact(new HaveFact(elderName, bloodOxygenCheckName));
		this.putPreFact(new HaveFact(elderName, checkingRoomName));
		this.putPreFact(new HaveFact(checkingRoomName, elderName));
		
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
		if(!(obj instanceof BloodOxygenCheckAction)) return false;
		BloodOxygenCheckAction objAction = (BloodOxygenCheckAction) obj;
		return this.elderName.equals(objAction.getElderName()) && this.checkingRoomName.equals(objAction.getCheckingRoomName());
	}
}
