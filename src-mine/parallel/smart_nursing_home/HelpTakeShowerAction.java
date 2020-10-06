package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class HelpTakeShowerAction extends Action {

	private String elderName;
	private String bySelfName;
	private String tidyName;
	private String careWorkerName;
	private String bathingRoomName;
	private String brightnessName;
	
	public HelpTakeShowerAction(String elderName, String bathingRoomName, String careWorkerName) {
		super("HelpTakeShower");
		this.elderName = elderName;
		this.bySelfName = "bySelf_"+elderName.charAt(elderName.length()-1);
		this.tidyName = "tidy_"+elderName.charAt(elderName.length()-1);
		this.careWorkerName = careWorkerName;
		this.bathingRoomName = bathingRoomName;
		this.brightnessName = "brightness_"+bathingRoomName;
		
		// pre
		this.putPreFact(new HaveFact(elderName, bySelfName));
		this.putPreFact(new IsFact(bySelfName, "false"));
		this.putPreFact(new HaveFact(elderName, tidyName));
		this.putPreFact(new HaveFact(elderName, bathingRoomName));
		this.putPreFact(new HaveFact(bathingRoomName, elderName));
		this.putPreFact(new HaveFact(careWorkerName, bathingRoomName));
		this.putPreFact(new HaveFact(bathingRoomName, careWorkerName));
		this.putPreFact(new HaveFact(bathingRoomName, brightnessName));
		this.putPreFact(new IsFact(brightnessName, "high"));
		
		// del
		this.putDelFact(new IsFact(tidyName, "false"));
		
		// add
		this.putAddFact(new IsFact(tidyName, "true"));
	}
	
	public String getElderName() {
		return this.elderName;
	}
	
	public String getBathingRoomName() {
		return this.bathingRoomName;
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
		
		stringGen.append("bathingRoomName: ");
		stringGen.append(this.bathingRoomName);
		stringGen.append("\n");
		
		stringGen.append("careWorkerName: ");
		stringGen.append(this.careWorkerName);
		stringGen.append("\n");
		
		return stringGen.toString();
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HelpTakeShowerAction)) return false;
		HelpTakeShowerAction objAction = (HelpTakeShowerAction) obj;
		return this.elderName.equals(objAction.getElderName()) && this.bathingRoomName.equals(objAction.getBathingRoomName()) &&
				this.careWorkerName.equals(objAction.getCareWorkerName());
	}
}
