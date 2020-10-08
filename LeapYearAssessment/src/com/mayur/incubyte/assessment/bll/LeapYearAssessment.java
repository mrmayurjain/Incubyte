package com.mayur.incubyte.assessment.bll;

public class LeapYearAssessment {

	private static final int FOUR_HUNDRED = 400;
	private static final int HUNDRED = 100;
	private static final int FOUR = 4;

	public boolean isLeapYear(int year) {
		if (!isDivisibleByFour(year)) {
			return false;
		}
		if (isDivisibleByFour(year) && !isDivisibleByHundred(year)) {
			return true;
		}
		if (isDivisibleByFourHundred(year) && isDivisibleByHundred(year)) {
			return true;
		}
		return false;
	}

	private static boolean isDivisibleByFour(int divident) {
		return isDivisible(divident, FOUR);
	}

	private static boolean isDivisibleByHundred(int divident) {
		return isDivisible(divident, HUNDRED);
	}

	private static boolean isDivisibleByFourHundred(int divident) {
		return isDivisible(divident, FOUR_HUNDRED);
	}

	private static boolean isDivisible(int divident, int divisor) {
		if (divident % divisor == 0)
			return true;
		return false;
	}
}
