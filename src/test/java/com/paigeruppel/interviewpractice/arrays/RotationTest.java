package com.paigeruppel.interviewpractice.arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RotationTest {

	private Rotation underTest;

	@Before
	public void setup() {
		underTest = new Rotation();
	}

	@Test
	public void shouldReturnRotated3By3ArrayTestCase1() {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] rotated = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
		assertThat(underTest.rotateImage(a), is(rotated));
	}

}
