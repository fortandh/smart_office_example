package parallel.smart_office;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class CollectAssetAction extends Action {
	private String roomName;
	private String secretaryName;
	private String printerName;
	
	public CollectAssetAction(String roomName, String printerName) {
		super("CollectAsset");
		this.secretaryName = "carmen";
		this.roomName = roomName;
		this.printerName = printerName;
		
		// pre
		this.putPreFact(new HaveFact(secretaryName, roomName));
		this.putPreFact(new HaveFact(roomName, secretaryName));
		this.putPreFact(new HaveFact(roomName, printerName));
		
		// del
		this.putDelFact(new HaveFact(printerName, "Asset"));
		
		// add
		
	}
	
	public String getSecretaryName() {
		return this.secretaryName;
	}
	
	public String getRoomName() {
		return this.roomName;
	}
	
	public String getPrinterName() {
		return this.printerName;
	}
	
	public String toString() {
		StringBuilder stringGen = new StringBuilder();
		stringGen.append("ActionName: ");
		stringGen.append(this.getActionName());
		stringGen.append("\n");
		
		stringGen.append("secretaryName: ");
		stringGen.append(this.getSecretaryName());
		stringGen.append("\n");
		
		stringGen.append("roomName: ");
		stringGen.append(this.getRoomName());
		stringGen.append("\n");
		
		stringGen.append("printerName: ");
		stringGen.append(this.getPrinterName());
		stringGen.append("\n");
		
		return stringGen.toString();
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof CollectAssetAction)) return false;
		CollectAssetAction objAction = (CollectAssetAction) obj;
		return this.roomName.equals(objAction.getRoomName()) && this.printerName.equals(objAction.getPrinterName());
	}
}
