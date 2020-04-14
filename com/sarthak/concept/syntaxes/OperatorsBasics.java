package com.sarthak.concept.syntaxes;

/**
 * @author SARTHAK
 *
 * CODITIONS - IF-ELSE-IF, SWITCH CASE
 * OPERATORS - TERNARY, INCREMENT, PRECEDENCE
 */
public class OperatorsBasics {
	
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
		
		//increment operators
		int x = 0;
		System.out.println(x++); // 0
		System.out.println(x); // 1
		System.out.println(++x); // 2
		System.out.println(x); // 2
		 
		int y = 0;
		y++;
		System.out.println(y); // 1 - returns new value
		
		int z = 0;
		z = z++;
		System.out.println(z); // 0 - returns old value
		
		//ternary operator
		int x1 = 2;
		int y1 = 3;
		
		String s = x1>y1 ? "x is greater" : "y is greater";
		System.out.println(s);
		
		// precedence example
		
		int r = 2 + 3 * 5;
		int d = (2+3) * 5;
		
		System.out.println(r); // 17
		System.out.println(d); // 25
	}

	

}
