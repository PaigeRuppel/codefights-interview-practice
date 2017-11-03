package com.paigeruppel.interviewpractice.arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CryptarithmTest {

	private Cryptarithm underTest;

	@Before
	public void setup() {
		underTest = new Cryptarithm();
	}

	@Test
	public void shouldReturnTrueTestCase1() {
		String[] crypt = { "SEND", "MORE", "MONEY" };
		char[][] solution = { { 'O', '0' }, { 'M', '1' }, { 'Y', '2' }, { 'E', '5' }, { 'N', '6' }, { 'D', '7' },
				{ 'R', '8' }, { 'S', '9' } };
		assertTrue(underTest.isCryptSolution(crypt, solution));
	}

	@Test
	public void shouldReturnFalseWithALeadingZeroTestCase2() {
		String[] crypt = { "TEN", "TWO", "ONE" };
		char[][] solution = { { 'O', '1' }, { 'T', '0' }, { 'W', '9' }, { 'E', '5' }, { 'N', '4' } };
		assertFalse(underTest.isCryptSolution(crypt, solution));

	}
}
