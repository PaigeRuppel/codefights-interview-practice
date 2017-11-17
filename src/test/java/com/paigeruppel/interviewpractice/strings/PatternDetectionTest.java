package com.paigeruppel.interviewpractice.strings;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PatternDetectionTest {

	
	private PatternDetection underTest;
	
	@Before
	public void setup() {
		underTest = new PatternDetection();
	}
	
	@Test
	public void testCase1() {
		String s = "CodefightsIsAwesome";
		String x = "IA";
		assertThat(underTest.findFirstSubstringOccurence(s, x), is(-1));
	}
}
