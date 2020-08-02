package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class HumidifierOnAction extends Action {

	private String roomName;
	private String humidifierName;
	private String humidityName;

	public HumidifierOnAction(String roomName, String humidifierName, String humidityName) {
		super();
		this.roomName = roomName;
		this.humidifierName = humidifierName;
		this.humidityName = humidityName;
		
		// pre
		this.putPreFact(new HaveFact(roomName, humidifierName));
		this.putPreFact(new HaveFact(roomName, humidityName));

		// del
		this.putDelFact(new IsFact(humidifierName, "off"));
		this.putDelFact(new IsFact(humidityName, "low"));
		
		// add
		this.putAddFact(new IsFact(humidifierName, "on"));
		this.putAddFact(new IsFact(humidityName, "high"));
	}
	
	public String getRoomName() {
		return this.roomName;
	}
	
	public String getHumidifierName() {
		return this.humidifierName;
	}
	
	public String getHumidityName() {
		return this.humidityName;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HumidifierOnAction)) return false;
		HumidifierOnAction objAction = (HumidifierOnAction) obj;
		return this.roomName.equals(objAction.getRoomName()) && this.humidifierName.equals(objAction.getHumidifierName()) &&
				this.humidityName.equals(objAction.getHumidityName());
	}
}
