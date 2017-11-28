package com.paigeruppel.interviewpractice.numbertheory;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RationalNumberTest {

	private RationalNumber underTest;

	@Before
	public void setup() {
		underTest = new RationalNumber();
	}

	@Test
	public void simplifyShouldReturnReduced12FromNumerator3AndDenominator6() {
		int[] simplified = { 1, 2 };
		assertThat(underTest.simplifyRational(3, 6), is(simplified));
	}

}
