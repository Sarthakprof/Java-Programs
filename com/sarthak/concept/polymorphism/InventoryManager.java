package com.sarthak.concept.polymorphism;

public class InventoryManager {

	public void addAutomobile(Car c) {
		System.out.println("Adding Car #" + c.getVIN());
	}

	public void addAutomobile(Scooter s) {
		System.out.println("Adding Scooter #" + s.getVIN());
	}

	public void addAutomobile(Truck t) {
		System.out.println("Adding Truck #" + t.getVIN());
	}
}
