package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class HumidifierOffAction extends Action {

	private String roomName;
	private String humidifierName;
	private String humidityName;

	public HumidifierOffAction(String roomName, String humidifierName, String humidityName) {
		super("HumidifierOff");
		this.roomName = roomName;
		this.humidifierName = humidifierName;
		this.humidityName = humidityName;
		
		// pre
		this.putPreFact(new HaveFact(roomName, humidifierName));
		this.putPreFact(new HaveFact(roomName, humidityName));

		// del
		this.putDelFact(new IsFact(humidifierName, "on"));
		this.putDelFact(new IsFact(humidityName, "high"));
		
		// add
		this.putAddFact(new IsFact(humidifierName, "off"));
		this.putAddFact(new IsFact(humidityName, "low"));
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
	
	public String toString() {		
		StringBuilder stringGen = new StringBuilder();
		stringGen.append("ActionName: ");
		stringGen.append(this.getActionName());
		stringGen.append("\n");
		
		stringGen.append("roomName: ");
		stringGen.append(this.roomName);
		stringGen.append("\n");
		
		stringGen.append("humidifierName: ");
		stringGen.append(this.humidifierName);
		stringGen.append("\n");
		
		stringGen.append("humidityName: ");
		stringGen.append(this.humidityName);
		stringGen.append("\n");
		
		return stringGen.toString();
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HumidifierOffAction)) return false;
		HumidifierOffAction objAction = (HumidifierOffAction) obj;
		return this.roomName.equals(objAction.getRoomName()) && this.humidifierName.equals(objAction.getHumidifierName()) &&
				this.humidityName.equals(objAction.getHumidityName());
	}
}
