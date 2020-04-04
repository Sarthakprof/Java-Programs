package com.sarthak.concept.thisexample;

/**
 * @author SARTHAK
 *
 */
public class Sum {

	public int num1 = 5;
	public int num2 = 7;
	
	int sumoftwo () {
		
		int sum = 0;
		sum = num1 + num2;
		System.out.println(sum);
		return sum;
	}
	
	/**
	 * @param num1
	 * @param num2
	 * @return
	 */
	int anothersumoftwo(int num1, int num2) {
		
		int sum = 0;
		this.num1 = num1;
		this.num2 = num2 + this.num2;
		
		sum = this.num1 + this.num2;
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String args[]) {
		Sum s = new Sum();
		s.sumoftwo();
		s.anothersumoftwo(1, 2);
	
	}
	
}
