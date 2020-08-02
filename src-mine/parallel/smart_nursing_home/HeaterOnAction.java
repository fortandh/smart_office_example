package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class HeaterOnAction extends Action {

	private String roomName;
	private String heaterName;
	private String temperatureName;

	public HeaterOnAction(String roomName, String heaterName, String temperatureName) {
		super();
		this.roomName = roomName;
		this.heaterName = heaterName;
		this.temperatureName = temperatureName;
		
		// pre
		this.putPreFact(new HaveFact(roomName, heaterName));
		this.putPreFact(new HaveFact(roomName, temperatureName));

		// del
		this.putDelFact(new IsFact(heaterName, "off"));
		this.putDelFact(new IsFact(temperatureName, "low"));
		
		// add
		this.putAddFact(new IsFact(heaterName, "on"));
		this.putAddFact(new IsFact(temperatureName, "high"));
	}
	
	public String getRoomName() {
		return this.roomName;
	}
	
	public String getHeaterName() {
		return this.heaterName;
	}
	
	public String getTemperatureName() {
		return this.temperatureName;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HeaterOnAction)) return false;
		HeaterOnAction objAction = (HeaterOnAction) obj;
		return this.roomName.equals(objAction.getRoomName()) && this.heaterName.equals(objAction.getHeaterName()) &&
				this.temperatureName.equals(objAction.getTemperatureName());
	}
}
