package hoge;

public class Super implements Cloneable{

	
	public String a = "super a";
	
	private final String pf = "private final String";
	
	
	public Super() {
		System.out.println("Super constructor called");
		
	}
	
	public String getPF(Super s) {
		return this.pf + s.pf;
		
	}
	
	public String getA() {
		return a;
	}
	
	public String getB() {
		return "bはありません";
	}
	
	public Super clone() throws CloneNotSupportedException {
		return (Super)super.clone();
	}
}
