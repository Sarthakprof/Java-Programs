package com.sarthak.concept.scopeexample;

public class Car {
	//Begin Car Scope
	String color; //instance variable in Car scope
	String type; //instance variable in Car scope
	int serialNumber; //instance variable in Car scope
	static int carCount; //static variable in Car class scope

	Car(String c, String t){
		//begin constructor scope
		color = c; //local variable
		type = t; //local variable
		carCount++;
		serialNumber = carCount;
	}
	
	public String getDescription() {
		//begin getDescription Scope
		String desc; //local var
		desc = "This is " + color + " " + type;
		return desc;		
	}
} //End of Car Scope
