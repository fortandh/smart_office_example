package parallel.util;

public class IsFact extends Fact {

	public IsFact(String name, String status) {
		super(name, status);
		setContext(getName()+" is "+getStatus());
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof IsFact)) return false;
		IsFact objFact = (IsFact) obj;
		return this.getContext().equals(objFact.getContext());
	}
	
	public int hashCode() {
		return this.getContext().hashCode();
	}
}
