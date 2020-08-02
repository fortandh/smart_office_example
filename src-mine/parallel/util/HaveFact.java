package parallel.util;

public class HaveFact extends Fact {

	public HaveFact(String name, String status) {
		super(name, status);
		setContext(getName()+" have "+getStatus());
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof HaveFact)) return false;
		HaveFact objFact = (HaveFact) obj;
		return this.getContext().equals(objFact.getContext());
	}
	
	public int hashCode() {
		return this.getContext().hashCode();
	}
}
