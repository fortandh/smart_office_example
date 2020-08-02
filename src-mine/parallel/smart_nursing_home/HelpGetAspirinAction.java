package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;

public class HelpGetAspirinAction extends Action {

	private String careWorkerName;
	private String pharmacyName;
	
	public HelpGetAspirinAction(String careWorkerName, String pharmacyName) {
		super();
		this.careWorkerName = careWorkerName;
		this.pharmacyName = pharmacyName;
		
		// pre
		this.putPreFact(new HaveFact(careWorkerName, pharmacyName));
		this.putPreFact(new HaveFact(pharmacyName, careWorkerName));
		
		// del
		
		// add
		this.putAddFact(new HaveFact(careWorkerName, "aspirin"));
	}
	
	public String getCareWorkerName() {
		return this.careWorkerName;
	}
	
	public String getPharmacyName() {
		return this.pharmacyName;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HelpGetAspirinAction)) return false;
		HelpGetAspirinAction objAction = (HelpGetAspirinAction) obj;
		return this.careWorkerName.equals(objAction.getCareWorkerName()) && this.pharmacyName.equals(objAction.getPharmacyName());
	}
}
