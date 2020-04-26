package com.sarthak.concept.inheritence;

public class Employee extends Person {

	private String hireDate;
	private String salary;
	
	//cons
	public Employee(String fName, String lName, int age, String address, String hDate, String sal) {
		//so "super" is the best way to access private object of parent class 
		super (fName, lName, age, address); // calling Persons's construtor
		hireDate = hDate;
		salary = sal;
	}
}
