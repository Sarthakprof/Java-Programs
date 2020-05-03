package com.sarthak.concept.polymorphism;

public class CarDealership {
	
	private static InventoryManager manager = new InventoryManager();
	public static void main(String args[]) {
		Car c = new Car();
		manager.addAutomobile(c);
		
		Scooter s = new Scooter();
		manager.addAutomobile(s);
		
		Truck t = new Truck();
		manager.addAutomobile(t);
		
		
		//parent class
		Automobile a = new Automobile();
		manager.addAutomobile(a);
	}

}
