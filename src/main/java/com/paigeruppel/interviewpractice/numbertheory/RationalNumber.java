package com.paigeruppel.interviewpractice.numbertheory;

public class RationalNumber {

	private int numerator;
	private int denominator;
	private int[] ratio = {numerator, denominator};
	
	public RationalNumber(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int[] simplifyRational() {
		reduce();
		flipNegative();
		checkForZero();
		return ratio;
	}

	private void reduce() {
		int factor = 2;
		while (factor <= Math.abs(numerator)) {
			if (numerator % factor == 0 && denominator % factor == 0) {
				numerator /= factor;
				denominator /= factor;
			} else {
				factor++;
			}
		}
		ratio[0] = numerator;
		ratio[1] = denominator;
	}

	private void flipNegative() {
		if (ratio[1] < 0) {
			ratio[0] = -ratio[0];
			ratio[1] = -ratio[1];
		}
	}

	private void checkForZero() {
		if (ratio[0] == 0) {
			ratio[1] = 1;
		}
	}
}
