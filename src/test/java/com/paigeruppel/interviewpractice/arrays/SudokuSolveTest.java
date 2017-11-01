package com.paigeruppel.interviewpractice.arrays;

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
		String[][] grid = {{".",".",".","1","4",".",".","2","."}, 
				{".",".","6",".",".",".",".",".","."}, 
				{".",".",".",".",".",".",".",".","."}, 
				{".",".","1",".",".",".",".",".","."}, 
				{".","6","7",".",".",".",".",".","9"}, 
				{".",".",".",".",".",".","8","1","."}, 
				{".","3",".",".",".",".",".",".","6"}, 
				{".",".",".",".",".","7",".",".","."}, 
				{".",".",".","5",".",".",".","7","."}};
		assertTrue(underTest.sudoku2(grid));
	}
}
