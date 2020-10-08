package com.mayur.incubyte.assessment.bll;

public class LeapYearAssessment {
	
	private static final int FOUR_HUNDRED = 400; 
	private static final int HUNDRED = 100; 
	private static final int FOUR = 4; 

	public boolean isLeapYear(int year) {
		if(year % FOUR != 0) {
			return false;
		}
		if(year % FOUR == 0 && year % HUNDRED !=0) {
			return true;
		}
		if(year % FOUR_HUNDRED == 0 && year % HUNDRED ==0) {
			return true;
		}
		
		return false;
	}

}
