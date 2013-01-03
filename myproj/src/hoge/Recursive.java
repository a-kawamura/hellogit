package hoge;

public class Recursive {
	
	public int recursive(int i) {
		
		return new Recursive().recursive(i++);
		
		
	}

}
