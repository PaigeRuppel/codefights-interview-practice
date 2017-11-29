package com.paigeruppel.interviewpractice.numbertheory;

public class RationalNumber {

	private int numerator;
	private int denominator;
	private int gcd;
	private int[] ratio = new int[2];
	
	public RationalNumber(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		gcd = findGreatestCommonDenominator(numerator, denominator);
	}
	
	public int[] simplifyRational() {
		ratio[0] = numerator / gcd;
		ratio[1] = denominator / gcd;
		flipNegative();
		return ratio;
	}

	private int findGreatestCommonDenominator(int a, int b) {
		return b == 0 ? a : findGreatestCommonDenominator(b, a % b);
	}

	private void flipNegative() {
		if (ratio[1] < 0) {
			ratio[0] = -ratio[0];
			ratio[1] = -ratio[1];
		}
	}

}
