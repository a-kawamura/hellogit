package hoge;

import java.lang.reflect.AccessibleObject;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		Sub sub = new Sub();
		Super su = (Super)sub;
		
		System.out.println("Superのa " + su.a);
		System.out.println("SuperのgetA() " + su.getA());
		System.out.println("SuperのtoString() " + su.toString());
		System.out.println("SubのgetA() " + sub.getA());
		System.out.println("Subのa " + sub.a);
		System.out.println("Subのb " + sub.b);
//		System.out.println("Superのb" + su.b);
		System.out.println("SubのgetB " + sub.getB());
		System.out.println("SuperのgetB " + su.getB());
		
		

	}

}
