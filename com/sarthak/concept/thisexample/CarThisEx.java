package com.sarthak.concept.thisexample;

public class CarThisEx {

	String color;
	String type;
	
	{
		color = "red";
		type = "celica";
	}
	
	String getDescription() {
		
		String desc = "This is a " + color + " " + type;
		return desc;
	}
	
	//imagine a custom frame: newcolor = blue, type = celica2
	//one way to implement 
	void customize(String newcolor, String type) {
		color = newcolor; 
		type = type + " " + type;
		System.out.println(getDescription());		
	}
	
	//imagine a custom frame: color = blue, type = celica2
	//second way to implement 
	//this means bypass the local variable and go right to the object
	//The various usages of 'THIS' keyword in Java are as follows:

	/*
	 * It can be used to refer instance variable of current class 
	 * It can be used to invoke or initiate current class constructor 
	 * It can be passed as an argument in the method call 
	 * It can be passed as argument in the constructor call
	 * It can be used to return the current class instance
	 */
	void customize2(String color, String type) {
		this.color = color; 
		this.type = type + " " + this.type;
		System.out.println(getDescription());		
	}
	
	public static void main(String args[]) {
		
		CarThisEx car = new CarThisEx();
		car.customize2("blue", "celica2");
	}
}
