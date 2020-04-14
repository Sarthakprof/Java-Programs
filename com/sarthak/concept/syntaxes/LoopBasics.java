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

	}
}
