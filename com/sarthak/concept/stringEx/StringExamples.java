package com.sarthak.concept.stringEx;

/**
 * @author SARTHAK
 *
 * All about Strings
 */
public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String are immutable
		
		String s = "Sarthak Srivastava ";
		
		// substring
		System.out.println(s.substring(1, 4)); // art
		// trim - removes extra spaces
		System.out.println(s.trim()); // Sarthak Srivastava
		// charAt - point the char at position
		System.out.println(s.charAt(5)); // a
		// toUpperCase
		System.out.println(s.toUpperCase()); // SARTHAK SRIVASTAVA 
		
		// '+' operator concatanates strings
		System.out.println(s + "is a software developer"); // Sarthak Srivastava is a software developer
		
	}

}
