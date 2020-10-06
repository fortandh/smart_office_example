package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class WindowOffAction extends Action {

	private String roomName;
	private String windowName;
	private String brightnessName;
	private String humidityName;
	private String temperatureName;
	
	public WindowOffAction (String roomName, String windowName, String brightnessName, String humidityName, String temperatureName) {
		super("WindowOff");
		this.roomName = roomName;
		this.windowName = windowName;
		this.brightnessName = brightnessName;
		this.humidityName = humidityName;
		this.temperatureName = temperatureName;
		
		// pre
		this.putPreFact(new HaveFact(roomName, windowName));
		this.putPreFact(new HaveFact(roomName, brightnessName));
		this.putPreFact(new HaveFact(roomName, humidityName));
		this.putPreFact(new HaveFact(roomName, temperatureName));
		
		// del
		this.putDelFact(new IsFact(windowName, "on"));
		this.putDelFact(new IsFact(brightnessName, "high"));
		this.putDelFact(new IsFact(humidityName, "low"));
		this.putDelFact(new IsFact(temperatureName, "low"));
		
		// add
		this.putAddFact(new IsFact(windowName, "off"));
		this.putAddFact(new IsFact(brightnessName, "low"));
		this.putAddFact(new IsFact(humidityName, "high"));
		this.putAddFact(new IsFact(temperatureName, "high"));
	}
	
	public String getRoomName() {
		return this.roomName;
	}
	
	public String getWindowName() {
		return this.windowName;
	}
	
	public String getBrightnessName() {
		return this.brightnessName;
	}
	
	public String getHumidityName() {
		return this.humidityName;
	}
	
	public String getTemperatureName() {
		return this.temperatureName;
	}
	
	public String toString() {		
		StringBuilder stringGen = new StringBuilder();
		stringGen.append("ActionName: ");
		stringGen.append(this.getActionName());
		stringGen.append("\n");
		
		stringGen.append("roomName: ");
		stringGen.append(this.roomName);
		stringGen.append("\n");
		
		stringGen.append("windowName: ");
		stringGen.append(this.windowName);
		stringGen.append("\n");
		
		stringGen.append("brightnessName: ");
		stringGen.append(this.brightnessName);
		stringGen.append("\n");
		
		stringGen.append("humidityName: ");
		stringGen.append(this.humidityName);
		stringGen.append("\n");
		
		stringGen.append("temperatureName: ");
		stringGen.append(this.temperatureName);
		stringGen.append("\n");
		
		return stringGen.toString();
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof WindowOffAction)) return false;
		WindowOffAction objAction = (WindowOffAction) obj;
		return this.roomName.equals(objAction.getRoomName()) && this.windowName.equals(objAction.getWindowName()) &&
				this.brightnessName.equals(objAction.getBrightnessName()) && this.humidityName.equals(objAction.getHumidityName()) &&
				this.temperatureName.equals(objAction.getTemperatureName());
	}
}
