package com.mayur.incubyte.assessment.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mayur.incubyte.assessment.bll.LeapYearAssessment;

class LeapYearTest {

	@Test
	void allDividedByFourHundred() {
		
		int year = 2000;
		LeapYearAssessment leapYearAssessment = new LeapYearAssessment();
		
		boolean isLeapYear = leapYearAssessment.isLeapYear(year);
		if(!isLeapYear) {
			fail("Test Case 'allDividedByFourHundred' has failed");
		}
		
	}

}
