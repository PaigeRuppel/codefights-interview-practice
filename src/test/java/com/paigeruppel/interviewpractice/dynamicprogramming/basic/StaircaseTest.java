package com.paigeruppel.interviewpractice.dynamicprogramming.basic;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class StaircaseTest {

	private Staircase underTest;
	
	@Before
	public void setup() {
		underTest = new Staircase();
	}

	@Test
	public void climbingStairsWith1StepShouldReturn1Combination() {
		assertThat(underTest.climbingStairs(1), is(1));
	}
	
	@Test
	public void climbingStairsWith2StepsShouldReturn2Combinations() {
		assertThat(underTest.climbingStairs(2), is(2));
	}
}
