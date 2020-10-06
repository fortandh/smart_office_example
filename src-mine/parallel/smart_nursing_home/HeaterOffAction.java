package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class HeaterOffAction extends Action {

	private String roomName;
	private String heaterName;
	private String temperatureName;

	public HeaterOffAction(String roomName, String heaterName, String temperatureName) {
		super("HeaterOff");
		this.roomName = roomName;
		this.heaterName = heaterName;
		this.temperatureName = temperatureName;
		
		// pre
		this.putPreFact(new HaveFact(roomName, heaterName));
		this.putPreFact(new HaveFact(roomName, temperatureName));

		// del
		this.putDelFact(new IsFact(heaterName, "on"));
		this.putDelFact(new IsFact(temperatureName, "high"));
		
		// add
		this.putAddFact(new IsFact(heaterName, "off"));
		this.putAddFact(new IsFact(temperatureName, "low"));
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
	
	public String toString() {		
		StringBuilder stringGen = new StringBuilder();
		stringGen.append("ActionName: ");
		stringGen.append(this.getActionName());
		stringGen.append("\n");
		
		stringGen.append("roomName: ");
		stringGen.append(this.roomName);
		stringGen.append("\n");
		
		stringGen.append("heaterName: ");
		stringGen.append(this.heaterName);
		stringGen.append("\n");
		
		stringGen.append("temperatureName: ");
		stringGen.append(this.temperatureName);
		stringGen.append("\n");
		
		return stringGen.toString();
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HeaterOffAction)) return false;
		HeaterOffAction objAction = (HeaterOffAction) obj;
		return this.roomName.equals(objAction.getRoomName()) && this.heaterName.equals(objAction.getHeaterName()) &&
				this.temperatureName.equals(objAction.getTemperatureName());
	}
}
