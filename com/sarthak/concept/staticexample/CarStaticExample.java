package com.sarthak.concept.staticexample;


public class CarStaticExample {

	 public String color;
	 public String type;
	 //class variables
	 public static int carCount =1;
	 public static int serialNumber;
	 
	 
	 CarStaticExample(){		 
		 carCount++;
		 serialNumber = carCount;
	 }
	    CarStaticExample(String c, String t){
	        color = c;
	        type = t;
	        carCount++;
			serialNumber = carCount;
	    }

	    public void start(){
	        System.out.println("Get Started");
	    }

	    public String printDesc(){
	       String desc = "The color of my Car is " + color + " and the type of my Car is " + type;
	        return desc;
	    }

	    public static void main(String arg[]) {
	    	CarStaticExample car = new CarStaticExample("Blue", "Lamberghine Gallerado");
	        car.start();
	        String carDesc = car.printDesc();
	        System.out.println(carDesc);   
	        System.out.println("Serial Number of you Car is: " + serialNumber);
	        
	        //reset count value by call static method
	        CarStaticExample.resetCount();
	     }
	    
	    public static void resetCount() {
	    	carCount=0;
	    }
	    
	    
}
