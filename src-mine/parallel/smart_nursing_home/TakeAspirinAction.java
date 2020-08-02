package parallel.smart_nursing_home;

import parallel.util.Action;
import parallel.util.HaveFact;
import parallel.util.IsFact;

public class TakeAspirinAction extends Action {

	private String elderName;
	private String bySelfName;
	private String heartAttackName;
	private String aspirinTakenName;
	private String pharmacyName;
	
	public TakeAspirinAction(String elderName, String pharmacyName) {
		super();
		this.elderName = elderName;
		this.bySelfName = "bySelf_"+elderName.charAt(elderName.length()-1);
		this.heartAttackName = "heart_attack_"+elderName.charAt(elderName.length()-1);
		this.aspirinTakenName = "aspirinTaken_"+elderName.charAt(elderName.length()-1);
		this.pharmacyName = pharmacyName;
		
		// pre
		this.putPreFact(new HaveFact(elderName, bySelfName));
		this.putPreFact(new IsFact(bySelfName, "true"));
		this.putPreFact(new HaveFact(elderName, heartAttackName));
		this.putPreFact(new HaveFact(heartAttackName, aspirinTakenName));
		this.putPreFact(new HaveFact(elderName, pharmacyName));
		this.putPreFact(new HaveFact(pharmacyName, elderName));
		
		// del
		this.putDelFact(new IsFact(aspirinTakenName, "false"));
		
		// add
		this.putAddFact(new IsFact(aspirinTakenName, "true"));
	}
	
	public String getElderName() {
		return this.elderName;
	}
	
	public String getPharmacyName() {
		return this.pharmacyName;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof TakeAspirinAction)) return false;
		TakeAspirinAction objAction = (TakeAspirinAction) obj;
		return this.elderName.equals(objAction.getElderName()) && this.pharmacyName.equals(objAction.getPharmacyName());
	}
}
