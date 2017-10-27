package com.paigeruppel.interviewpractice.arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class DuplicateDetectTest {

	private DuplicateDetect underTest;

	@Before
	public void setup() {
		underTest = new DuplicateDetect();
	}

	@Test
	public void shouldReturn3TestCase1() {
		int[] a = { 2, 3, 3, 1, 5, 2 };
		assertThat(underTest.firstDuplicate(a), is(3));
	}
	
	@Test
	public void shouldReturnNegative1TestCase2() {
		int[] a = { 2, 4, 3, 5, 1 };
		assertThat(underTest.firstDuplicate(a), is(-1));
	}
}
