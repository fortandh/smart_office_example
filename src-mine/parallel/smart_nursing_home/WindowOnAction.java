package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class WindowOnAction extends Action {

	private String roomName;
	private String windowName;
	private String brightnessName;
	private String humidityName;
	private String temperatureName;
	
	public WindowOnAction (String roomName, String windowName, String brightnessName, String humidityName, String temperatureName) {
		super();
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
		this.putDelFact(new IsFact(windowName, "off"));
		this.putDelFact(new IsFact(brightnessName, "low"));
		this.putDelFact(new IsFact(humidityName, "high"));
		this.putDelFact(new IsFact(temperatureName, "high"));
		
		// add
		this.putAddFact(new IsFact(windowName, "on"));
		this.putAddFact(new IsFact(brightnessName, "high"));
		this.putAddFact(new IsFact(humidityName, "low"));
		this.putAddFact(new IsFact(temperatureName, "low"));
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
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof WindowOnAction)) return false;
		WindowOnAction objAction = (WindowOnAction) obj;
		return this.roomName.equals(objAction.getRoomName()) && this.windowName.equals(objAction.getWindowName()) &&
				this.brightnessName.equals(objAction.getBrightnessName()) && this.humidityName.equals(objAction.getHumidityName()) &&
				this.temperatureName.equals(objAction.getTemperatureName());
	}
}
