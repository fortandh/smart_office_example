package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class TakeShowerAction extends Action {

	private String elderName;
	private String bySelfName;
	private String tidyName;
	private String bathingRoomName;
	private String brightnessName;
	
	public TakeShowerAction(String elderName, String bathingRoomName) {
		super();
		this.elderName = elderName;
		this.bySelfName = "bySelf_"+elderName.charAt(elderName.length()-1);
		this.tidyName = "tidy_"+elderName.charAt(elderName.length()-1);
		this.bathingRoomName = bathingRoomName;
		this.brightnessName = "brightness_"+bathingRoomName;
		
		// pre
		this.putPreFact(new HaveFact(elderName, bySelfName));
		this.putPreFact(new IsFact(bySelfName, "true"));
		this.putPreFact(new HaveFact(elderName, tidyName));
		this.putPreFact(new HaveFact(elderName, bathingRoomName));
		this.putPreFact(new HaveFact(bathingRoomName, elderName));
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
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof TakeShowerAction)) return false;
		TakeShowerAction objAction = (TakeShowerAction) obj;
		return this.elderName.equals(objAction.getElderName()) && this.bathingRoomName.equals(objAction.getBathingRoomName());
	}
}
