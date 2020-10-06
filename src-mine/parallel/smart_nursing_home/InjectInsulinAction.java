package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class InjectInsulinAction extends Action {

	private String elderName;
	private String bySelfName;
	private String diabetesName;
	private String insulinInjectedName;
	private String pharmacyName;
	
	public InjectInsulinAction(String elderName, String pharmacyName) {
		super("InjectInsulin");
		this.elderName = elderName;
		this.bySelfName = "bySelf_"+elderName.charAt(elderName.length()-1);
		this.diabetesName = "diabetes_"+elderName.charAt(elderName.length()-1);
		this.insulinInjectedName = "insulinInjected_"+elderName.charAt(elderName.length()-1);
		this.pharmacyName = pharmacyName;
		
		// pre
		this.putPreFact(new HaveFact(elderName, bySelfName));
		this.putPreFact(new IsFact(bySelfName, "true"));
		this.putPreFact(new HaveFact(elderName, diabetesName));
		this.putPreFact(new HaveFact(diabetesName, insulinInjectedName));
		this.putPreFact(new HaveFact(elderName, pharmacyName));
		this.putPreFact(new HaveFact(pharmacyName, elderName));
		
		// del
		this.putDelFact(new IsFact(insulinInjectedName, "false"));
		
		// add
		this.putAddFact(new IsFact(insulinInjectedName, "true"));
	}
	
	public String getElderName() {
		return this.elderName;
	}
	
	public String getPharmacyName() {
		return this.pharmacyName;
	}
	
	public String toString() {		
		StringBuilder stringGen = new StringBuilder();
		stringGen.append("ActionName: ");
		stringGen.append(this.getActionName());
		stringGen.append("\n");
		
		stringGen.append("elderName: ");
		stringGen.append(this.elderName);
		stringGen.append("\n");
		
		stringGen.append("pharmacyName: ");
		stringGen.append(this.pharmacyName);
		stringGen.append("\n");
		
		return stringGen.toString();
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof InjectInsulinAction)) return false;
		InjectInsulinAction objAction = (InjectInsulinAction) obj;
		return this.elderName.equals(objAction.getElderName()) && this.pharmacyName.equals(objAction.getPharmacyName());
	}
}
