package parallel.util;

public abstract class Fact {
	
	private String name;
	private String status;
	private String context;
	
	public Fact(String name, String status) {
		this.name = name;
		this.status = status;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setContext(String text) {
		this.context = text;
	}
	
	public String getContext() {
		return this.context;
	}
	
	public String toString() {
		return this.context;
	}
	
	public abstract int hashCode();
}
