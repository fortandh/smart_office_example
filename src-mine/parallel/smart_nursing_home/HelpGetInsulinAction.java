package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;

public class HelpGetInsulinAction extends Action {

	private String careWorkerName;
	private String pharmacyName;
	
	public HelpGetInsulinAction(String careWorkerName, String pharmacyName) {
		super();
		this.careWorkerName = careWorkerName;
		this.pharmacyName = pharmacyName;
		
		// pre
		this.putPreFact(new HaveFact(careWorkerName, pharmacyName));
		this.putPreFact(new HaveFact(pharmacyName, careWorkerName));
		
		// del
		
		// add
		this.putAddFact(new HaveFact(careWorkerName, "insulin"));
	}
	
	public String getCareWorkerName() {
		return this.careWorkerName;
	}
	
	public String getPharmacyName() {
		return this.pharmacyName;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HelpGetInsulinAction)) return false;
		HelpGetInsulinAction objAction = (HelpGetInsulinAction) obj;
		return this.careWorkerName.equals(objAction.getCareWorkerName()) && this.pharmacyName.equals(objAction.getPharmacyName());
	}

}
