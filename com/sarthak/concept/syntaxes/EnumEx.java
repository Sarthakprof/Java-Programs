package com.sarthak.concept.syntaxes;

public class EnumEx {

	public static void main(String[] args) {
		DaysEnum today = DaysEnum.FRIDAY;	
		//String tue = DaysEnum.TUESDAY.name(); --gives string value
		//DaysEnum theUsersDay = DaysEnum.valueOf("WEDNESDAY");
		String res = "";		
		switch(today) {
		case MONDAY:
			res = "Work day!!";
			break;
		case FRIDAY:
			res = "its friday and its time to watch movies and enjoy weekend!";
			break;
		default:
			res = "xxxxxx";
		}
		System.out.println(res);
	}
	
	//try to do a complex enum example

}
