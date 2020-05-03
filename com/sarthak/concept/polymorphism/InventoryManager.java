package com.sarthak.concept.polymorphism;

public class InventoryManager {

	//this is the non-polymorphism example
	
	
	/*
	public void addAutomobile(Car c) {
		System.out.println("Adding Car #" + c.getVIN());
	}

	public void addAutomobile(Scooter s) {
		System.out.println("Adding Scooter #" + s.getVIN());
	}

	public void addAutomobile(Truck t) {
		System.out.println("Adding Truck #" + t.getVIN());
	}
	*/
	
	//what if we wrap all the above thre function in just one? will it work? yes it would
	
	private Automobile featuredAuto; // = new Car()
	public void addAutomobile(Automobile a) {
		System.out.println("Adding Automobile #" + a.getVIN());
	}

	//FRAME
	//Automobile auto = new Car();
	public void addFeaturedAuto(Automobile auto) {
	
		featuredAuto = auto;
		
	}
}
