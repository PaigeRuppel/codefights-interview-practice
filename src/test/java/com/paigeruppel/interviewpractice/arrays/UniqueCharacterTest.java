package com.paigeruppel.interviewpractice.arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class UniqueCharacterTest {

	private UniqueCharacter underTest;
	
	@Before
	public void setup() {
		underTest = new UniqueCharacter();
	}
	
	@Test
	public void shouldReturnCTestCase1() {
		String s = "abacabad";
		assertThat(underTest.firstNotRepeatingCharacter(s), is('c'));
	}
}
