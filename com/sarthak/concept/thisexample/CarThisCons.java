package com.sarthak.concept.thisexample;


//this example will show you how to have multiple constructors
//and how to invoke them via "this" variable
public class CarThisCons {

	private String a = "Happy";
	private String b = "Birthday";
	
	CarThisCons(){
		//here this variable will look for a constructor with similar no. of args.
		//a constructor call a constructor via this variable
		this("A ", "fabulous ");
	}
	
	CarThisCons(String a, String b){
		this.a = a;
		this.b = b + this.b;
		String conct = this.a + this.b;
		System.out.println(conct);
		
	}
	
	public static void main(String args[]) {
		CarThisCons obj = new CarThisCons();
		
	}
}
