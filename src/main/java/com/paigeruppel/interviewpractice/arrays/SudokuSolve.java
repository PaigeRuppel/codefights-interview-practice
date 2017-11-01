package com.paigeruppel.interviewpractice.arrays;

import java.util.HashSet;
import java.util.Set;

public class SudokuSolve {

	public boolean sudoku2(String[][] grid) {
		return isValidHorizontal(grid);
	}
	
	private boolean isValidHorizontal(String[][] grid) {
		Set<String> present = new HashSet<>();
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid.length; col++) {
				String horClue = grid[row][col];
				if (present.contains(horClue)) {
					return false;
				}
				if (!horClue.equals(".") && !present.contains(horClue)) {
					present.add(horClue);
				}
			}
			present.clear();
		}
		return true;
	}

}
