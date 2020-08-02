package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class TemperatureCheckAction extends Action {

	private String elderName;
	private String bySelfName;
	private String temperatureCheckName;
	private String checkingRoomName;
	
	public TemperatureCheckAction(String elderName, String checkingRoomName) {
		super();
		this.elderName = elderName;
		this.bySelfName = "bySelf_"+elderName.charAt(elderName.length()-1);
		this.temperatureCheckName = "temperatureCheck_"+elderName.charAt(elderName.length()-1);
		this.checkingRoomName = checkingRoomName;
		
		// pre
		this.putPreFact(new HaveFact(elderName, bySelfName));
		this.putPreFact(new IsFact(bySelfName, "true"));
		this.putPreFact(new HaveFact(elderName, temperatureCheckName));
		this.putPreFact(new HaveFact(elderName, checkingRoomName));
		this.putPreFact(new HaveFact(checkingRoomName, elderName));
		
		// del
		this.putDelFact(new IsFact(temperatureCheckName, "false"));
		
		// add
		this.putAddFact(new IsFact(temperatureCheckName, "true"));
	}
	
	public String getElderName() {
		return this.elderName;
	}
	
	public String getCheckingRoomName() {
		return this.checkingRoomName;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof TemperatureCheckAction)) return false;
		TemperatureCheckAction objAction = (TemperatureCheckAction) obj;
		return this.elderName.equals(objAction.getElderName()) && this.checkingRoomName.equals(objAction.getCheckingRoomName());
	}
}
