package com.paigeruppel.interviewpractice.strings;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class SentenceBuilderTest {
	
	private SentenceBuilder underTest;
	
	@Before
	public void setup() {
		underTest = new SentenceBuilder();
	}
	
	@Test
	public void shouldReturnFormattedStringTestCase1() {
		String s = "CodefightsIsAwesome";
		assertThat(underTest.amendTheSentence(s), is("codefights is awesome"));
	}

}
