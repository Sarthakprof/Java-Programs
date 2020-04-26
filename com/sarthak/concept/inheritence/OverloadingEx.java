package com.sarthak.concept.inheritence;

public class OverloadingEx {

	// this method overlaoding 
	// method name should be same
	// params should be different
	// params order should be different
	// params type should be different
	// method return tyoe does not matter
	public static void main(String args[]) {
		sayHello("Sarthak");
		
		sayHello("Sarthak", 26);
		
		sayHello(26, "Sarthak");
	}

	private static void sayHello(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	private static void sayHello(String string, int i) {
		// TODO Auto-generated method stub
		
	}

	private static void sayHello(String string) {
		// TODO Auto-generated method stub
		
	}

}
