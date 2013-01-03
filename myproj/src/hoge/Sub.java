package hoge;
public class Sub extends Super {
	
	public String a = "sub a";
	
	public String b = "b";
	
	public Sub() {
		System.out.println("Suber constructor called");
	}
	
	public String getA() {
		return a;
	}
	
	public  String getB() {
	 return b;
	}
	
	
}
