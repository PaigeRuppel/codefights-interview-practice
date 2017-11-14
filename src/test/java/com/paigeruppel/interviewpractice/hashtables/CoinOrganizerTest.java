package com.paigeruppel.interviewpractice.hashtables;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CoinOrganizerTest {

	private CoinOrganizer underTest;

	@Before
	public void setup() {
		underTest = new CoinOrganizer();
	}

	@Test
	public void shouldReturn9TestCase1() {
		int[] coins = { 10, 50, 100 };
		int[] quantities = { 1, 2, 1 };
		assertThat(underTest.possibleSums(coins, quantities), is(9));
	}
}
