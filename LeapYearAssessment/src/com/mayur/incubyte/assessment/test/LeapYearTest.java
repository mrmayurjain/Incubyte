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
	
	@Test
	void allDividedByHundredAndNotByFourHundred1() {		
		
		LeapYearAssessment leapYearAssessment = new LeapYearAssessment();
		
		int year = 1700;
		boolean isLeapYear = leapYearAssessment.isLeapYear(year);
		if(isLeapYear) {
			fail("Test Case 'allDividedByHundredAndNotByFourHundred1' has failed");
		}	
		
	}
	@Test
	void allDividedByHundredAndNotByFourHundred2() {		
		
		LeapYearAssessment leapYearAssessment = new LeapYearAssessment();
		
		int year = 1800;
		boolean isLeapYear = leapYearAssessment.isLeapYear(year);
		if(isLeapYear) {
			fail("Test Case 'allDividedByHundredAndNotByFourHundred2' has failed");
		}	
		
	}
	@Test
	void allDividedByHundredAndNotByFourHundred3() {		
		
		LeapYearAssessment leapYearAssessment = new LeapYearAssessment();
		
		int year = 1900;
		boolean isLeapYear = leapYearAssessment.isLeapYear(year);
		if(isLeapYear) {
			fail("Test Case 'allDividedByHundredAndNotByFourHundred3' has failed");
		}	
		
	}
	@Test
	void allDividedByHundredAndNotByFourHundred4() {		
		
		LeapYearAssessment leapYearAssessment = new LeapYearAssessment();
		
		int year = 2100;
		boolean isLeapYear = leapYearAssessment.isLeapYear(year);
		if(isLeapYear) {
			fail("Test Case 'allDividedByHundredAndNotByFourHundred4' has failed");
		}	
		
	}
	@Test
	void allDividedByHundredAndNotByFourHundred5() {		
		
		LeapYearAssessment leapYearAssessment = new LeapYearAssessment();
		
		int year = 2000;
		boolean isLeapYear = leapYearAssessment.isLeapYear(year);
		if(!isLeapYear) {
			fail("Test Case 'allDividedByHundredAndNotByFourHundred5' has failed");
		}	
		
	}
	
	@Test
	void allDividedByFourAndNotByHundred1() {		
		
		LeapYearAssessment leapYearAssessment = new LeapYearAssessment();
		
		int year = 2008;
		boolean isLeapYear = leapYearAssessment.isLeapYear(year);
		if(!isLeapYear) {
			fail("Test Case 'allDividedByFourAndNotByHundred1' has failed");
		}	
		
	}
	
	@Test
	void allDividedByFourAndNotByHundred2() {		
		
		LeapYearAssessment leapYearAssessment = new LeapYearAssessment();
		
		int year = 2012;
		boolean isLeapYear = leapYearAssessment.isLeapYear(year);
		if(!isLeapYear) {
			fail("Test Case 'allDividedByFourAndNotByHundred2' has failed");
		}	
		
	}
	
	@Test
	void allDividedByFourAndNotByHundred3() {		
		
		LeapYearAssessment leapYearAssessment = new LeapYearAssessment();
		
		int year = 2010;
		boolean isLeapYear = leapYearAssessment.isLeapYear(year);
		if(isLeapYear) {
			fail("Test Case 'allDividedByFourAndNotByHundred3' has failed");
		}	
		
	}
	@Test
	void allDividedByFourAndNotByHundred4() {		
		
		LeapYearAssessment leapYearAssessment = new LeapYearAssessment();
		
		int year = 2016;
		boolean isLeapYear = leapYearAssessment.isLeapYear(year);
		if(!isLeapYear) {
			fail("Test Case 'allDividedByFourAndNotByHundred4' has failed");
		}	
		
	}

}
