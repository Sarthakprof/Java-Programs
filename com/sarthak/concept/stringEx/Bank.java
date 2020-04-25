package com.sarthak.concept.stringEx;

public class Bank {

	public static void main(String[] args) {

		Account myAcct = new Account();

		

		discountLoan(myAcct);
		System.out.println(myAcct.proposedLoan);

		debitFree(myAcct);
		System.out.println(myAcct.balance);

		evaluation(myAcct);
		System.out.println(myAcct.customerName);

	}

	private static  String evaluation(Account acct) {
		// Dear Sarthak Srivastava
		return  "Dear " + acct.customerName;
	}

	private static double debitFree(Account acct) {
		acct.balance = acct.balance - 2.50; // 97.50
		return acct.balance;
	}

	private static double discountLoan(Account acct) {
		//x = x * 0.95; // 237.58
		return acct.proposedLoan * 0.95;
	}

}
