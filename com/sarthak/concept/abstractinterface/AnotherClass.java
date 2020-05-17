package com.sarthak.concept.abstractinterface;

public class AnotherClass {

	//Abstract usage example
	public static double areaDiff(Shape s1, Shape s2) {
		return s1.area() - s2.area();
	}
	
	public static void main(String args[]) {
		Circle c = new Circle();
		c.r = 2;
		
		Rectangle rec = new Rectangle();
		rec.h = 1;
		rec.w = 3;
		
		double diff = areaDiff(c, rec);		
		System.out.println(diff);
	}

	
}
