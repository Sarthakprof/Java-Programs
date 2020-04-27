package com.sarthak.concept.inheritence;


public class Tester {

	public static void main(String[] args) {
		Father f = new Son();
		f.sayHello(); // *STATIC: Hello from the Father*
		f.sayHi(); // *INSTANCE: Hi from the Son*
	}

}
