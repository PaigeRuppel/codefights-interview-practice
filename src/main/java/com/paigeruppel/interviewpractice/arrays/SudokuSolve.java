package com.paigeruppel.interviewpractice.arrays;

import java.util.HashSet;
import java.util.Set;

public class SudokuSolve {

	public boolean sudoku2(String[][] grid) {
		return isValidHorizontalAndVertical(grid) && isValidSmallerGrids(grid);
	}

	private boolean isValidHorizontalAndVertical(String[][] grid) {
		Set<String> horPresent = new HashSet<>();
		Set<String> verPresent = new HashSet<>();
		for (int coord1 = 0; coord1 < grid.length; coord1++) {
			for (int coord2 = 0; coord2 < grid.length; coord2++) {
				String horClue = grid[coord1][coord2];
				String verClue = grid[coord2][coord1];
				if (horPresent.contains(horClue) || verPresent.contains(verClue)) {
					return false;
				}
				if (!horClue.equals(".") && !horPresent.contains(horClue)) {
					horPresent.add(horClue);
				}
				if (!verClue.equals(".") && !verPresent.contains(verClue)) {
					verPresent.add(verClue);
				}
			}
			horPresent.clear();
			verPresent.clear();
		}
		return true;
	}

	private boolean isValidSmallerGrids(String[][] grid) {
		Set<String> present = new HashSet<>();
		int colStart = 0;
		while (colStart < 7) {
			for (int row = 0; row < grid.length; row++) {
				if (row == 3 || row == 6) {
					present.clear();
				}
				for (int col = colStart; col < colStart + 3; col++) {
					String clue = grid[row][col];
					if (present.contains(clue)) {
						return false;
					}
					if (!clue.equals(".") && !present.contains(clue)) {
						present.add(clue);
					}
				}
			}
			present.clear();
			colStart += 3;
		}
		return true;
	}

}
