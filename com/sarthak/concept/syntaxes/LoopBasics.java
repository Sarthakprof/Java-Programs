package com.sarthak.concept.syntaxes;

/**
 * @author SARTHAK
 *
 */
public class LoopBasics {

	public static void main(String[] args) {

		// "while" loop
		System.out.println("Even Numbers using while loop");
		int x = 0;
		while (x <= 20) {
			if (x % 2 == 0) {
				System.out.println(x);
			}
			x++;
		}

		// "do while" loop
		System.out.println("Odd Numbers using do-while loop");
		;
		int y = 0;
		do {
			if (y % 2 != 0) {
				System.out.println(y);
			}
			y++;
		} while (y <= 20);

		// "for" loop
		System.out.println("Multiples of 5 using for loop");
		for (int z = 0; z <= 20; z++) {
			if (z % 5 == 0) {
				System.out.println(z);
			}
		}
		
		// "break" stmt
		// break stmt tells whatever loop i am in, i want break that loop
		// example
		System.out.println("Break - Example");
		int a = 0;
		while(true) {
			System.out.println(a++);
			if(a == 10) {
				break;
			}
		}
		
		// "continue example"
		System.out.println("Continue - Example");
		for(int k=0; k<=22; k++) {
			if(k%7==0) {
				continue;
			}
			System.out.println(k+" is not divisible by 7");
		}
		
		// "Label" Example
		System.out.println("Label - Example");
		//below code will cause infinite loop of outer loop even if inner while loop is set break;
		/*
		 * while(true) { int r=0; while(true) { if(r>=10) { break; }else {
		 * System.out.println(r++); } } }
		 */
		// the above code can be fixed using "label"
		outer_label:
		while (true) {
			int r = 0;
			while (true) {
				if (r >= 10) {
					break outer_label;
				} else {
					System.out.println(r++);
				}
			}
		}

	}
}
