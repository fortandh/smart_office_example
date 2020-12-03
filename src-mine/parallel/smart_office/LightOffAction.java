package parallel.smart_office;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class LightOffAction extends Action {

	private String roomName;
	private String lightName;
	private String brightnessName;

	public LightOffAction(String roomName, String lightName, String brightnessName) {
		super("LightOff");
		this.roomName = roomName;
		this.lightName = lightName;
		this.brightnessName = brightnessName;
		
		// pre
		this.putPreFact(new HaveFact(roomName, lightName));
		this.putPreFact(new HaveFact(roomName, brightnessName));

		// del
		this.putDelFact(new IsFact(lightName, "on"));
		this.putDelFact(new IsFact(brightnessName, "high"));
		
		// add
		this.putAddFact(new IsFact(lightName, "off"));
		this.putAddFact(new IsFact(brightnessName, "low"));
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
	
	public String toString() {		
		StringBuilder stringGen = new StringBuilder();
		stringGen.append("ActionName: ");
		stringGen.append(this.getActionName());
		stringGen.append("\n");
		
		stringGen.append("roomName: ");
		stringGen.append(this.roomName);
		stringGen.append("\n");
		
		stringGen.append("lightName: ");
		stringGen.append(this.lightName);
		stringGen.append("\n");
		
		stringGen.append("brightnessName: ");
		stringGen.append(this.brightnessName);
		stringGen.append("\n");
		
		return stringGen.toString();
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof LightOffAction)) return false;
		LightOffAction objAction = (LightOffAction) obj;
		return this.roomName.equals(objAction.getRoomName()) && this.lightName.equals(objAction.getLightName()) &&
				this.brightnessName.equals(objAction.getBrightnessName());
	}
}
