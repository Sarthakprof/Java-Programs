package com.sarthak.concept.inheritence;

public class Son extends Father {

	public static void sayhello() {
		System.out.println("STATIC: Hello from the Son");
	}
	
	public void sayHi() {
		System.out.println("INSTANCE: Hi from Son");
	}
}
