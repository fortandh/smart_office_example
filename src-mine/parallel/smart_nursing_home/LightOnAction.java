package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class LightOnAction extends Action {
	
	private String roomName;
	private String lightName;
	private String brightnessName;

	public LightOnAction(String roomName, String lightName, String brightnessName) {
		super();
		this.roomName = roomName;
		this.lightName = lightName;
		this.brightnessName = brightnessName;
		
		// pre
		this.putPreFact(new HaveFact(roomName, lightName));
		this.putPreFact(new HaveFact(roomName, brightnessName));

		// del
		this.putDelFact(new IsFact(lightName, "off"));
		this.putDelFact(new IsFact(brightnessName, "low"));
		
		// add
		this.putAddFact(new IsFact(lightName, "on"));
		this.putAddFact(new IsFact(brightnessName, "high"));
	}
	
	public String getRoomName() {
		return this.roomName;
	}
	
	public String getLightName() {
		return this.lightName;
	}
	
	public String getBrightnessName() {
		return this.brightnessName;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof LightOnAction)) return false;
		LightOnAction objAction = (LightOnAction) obj;
		return this.roomName.equals(objAction.getRoomName()) && this.lightName.equals(objAction.getLightName()) &&
				this.brightnessName.equals(objAction.getBrightnessName());
	}
}
