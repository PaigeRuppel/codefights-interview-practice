package com.paigeruppel.interviewpractice.arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SudokuSolveTest {

	private SudokuSolve underTest;

	@Before
	public void setup() {
		underTest = new SudokuSolve();
	}

	@Test
	public void validSolutionShouldReturnTrueTestCase1() {
		String[][] grid = { { ".", ".", ".", "1", "4", ".", ".", "2", "." },
				{ ".", ".", "6", ".", ".", ".", ".", ".", "." }, { ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", "1", ".", ".", ".", ".", ".", "." }, { ".", "6", "7", ".", ".", ".", ".", ".", "9" },
				{ ".", ".", ".", ".", ".", ".", "8", "1", "." }, { ".", "3", ".", ".", ".", ".", ".", ".", "6" },
				{ ".", ".", ".", ".", ".", "7", ".", ".", "." }, { ".", ".", ".", "5", ".", ".", ".", "7", "." } };
		assertTrue(underTest.sudoku2(grid));
	}

	@Test
	public void horizontalConflictShouldReturnFalseTestCase2() {
		String[][] grid = { { ".", ".", ".", ".", "2", ".", ".", "9", "." },
				{ ".", ".", ".", ".", "6", ".", ".", ".", "." }, { "7", "1", ".", ".", "7", "5", ".", ".", "." },
				{ ".", "7", ".", ".", ".", ".", ".", ".", "." }, { ".", ".", ".", ".", "8", "3", ".", ".", "." },
				{ ".", ".", "8", ".", ".", "7", ".", "6", "." }, { ".", ".", ".", ".", ".", "2", ".", ".", "." },
				{ ".", "1", ".", "2", ".", ".", ".", ".", "." }, { ".", "2", ".", ".", "3", ".", ".", ".", "." } };
		assertFalse(underTest.sudoku2(grid));
	}

	@Test
	public void verticalConflictShouldReturnFalseTestCase3() {
		String[][] grid = { { ".", ".", "4", ".", ".", ".", "6", "3", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", "." }, { "5", ".", ".", ".", ".", ".", ".", "9", "." },
				{ ".", ".", ".", "5", "6", ".", ".", ".", "." }, { "4", ".", "3", ".", ".", ".", ".", ".", "1" },
				{ ".", ".", ".", "7", ".", ".", ".", ".", "." }, { ".", ".", ".", "5", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", "." }, { ".", ".", ".", ".", ".", ".", ".", ".", "." } };
		assertFalse(underTest.sudoku2(grid));
	}
}
