package com.mayur.incubyte.assessment.bll;

public class LeapYearAssessment {
	
	private static final int FOUR_HUNDRED = 400; 

	public boolean isLeapYear(int year) {
		if(year % FOUR_HUNDRED == 0) {
			return true;
		}
		return false;
	}

}
