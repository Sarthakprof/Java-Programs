package com.sarthak.concept.syntaxes;

/**
 * @author SARTHAK
 *
 */
public class Basics {
	
	public static void main(String args[]) {
		
		//if else if example
		boolean a = false;
		boolean b = false;
		
		if(a) {
			System.out.println("This is a ...");
		} else if(b) {
			System.out.println("This is b ...");
		}else {
			System.out.println("This is nothing ...");
		}
		
		// Switch Case example		
		int j =3;
		String str = null;		
		switch(j) {		
		case 1:
			str = "One";
			break;
		case 2:
			str = "Two";
			break;
		case 3:
			str = "Three";
			break;
		default: 
			str = "unknown";
		}
		System.out.println(str);
	}

}
