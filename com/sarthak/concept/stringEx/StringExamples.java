package com.sarthak.concept.stringEx;

/**
 * @author SARTHAK
 *
 *         All about Strings
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

		// normal concatenation
		String str = "Hello";
		str += " World";
		str += ", today is Thursday!";

		System.out.println(str);

		// With String Builder, using immutable strings
		StringBuilder strs = new StringBuilder();
		strs.append("Hello ");
		strs.append("World,");
		strs.append(" today is thursday");

		System.out.println(strs);

		// immutability example
		String myStr = "I am Iron Man";
		myStr.toUpperCase();
		System.out.println(myStr);
		// this will print "I am Iron Man and not I AM IRON MAN, why?
		// because it was treated as a String literal and not the value of a variable."

		// important Question for OCA
		int x = 3;
		int y = 5;
		System.out.println(x + y + " : " + x + y);
		// The answer is 8 : 35 and not 8 : 8 because
		// + operator is treated as an addition operator until it is applied to a String
	}

}
