package com.paigeruppel.interviewpractice.numbertheory;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MissingNumberTest {

	private MissingNumber underTest;
	
	@Before
	public void setup() {
		underTest = new MissingNumber();
	}
	
	@Test
	public void shouldReturn2From0ToNEquals3() {
		int[] arr = {3,1,0};
		assertThat(underTest.findMissingNumber(arr), is(2));
	}
}
