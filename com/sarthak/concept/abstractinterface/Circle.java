package com.sarthak.concept.abstractinterface;

public class Circle extends Shape{

	public double r;
	
	public double area() {
		
		double area = Math.PI*r*r;
		return area;
		
	}
}
