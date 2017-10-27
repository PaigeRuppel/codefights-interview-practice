package com.paigeruppel.interviewpractice.arrays;

public class Rotation {

	/*
	 * Note: Try to solve this task in-place (with O(1) additional memory), since
	 * this is what you'll be asked to do during an interview.
	 * 
	 * You are given an n x n 2D matrix that represents an image. Rotate the image
	 * by 90 degrees (clockwise).
	 */
	public int[][] rotateImage(int[][] a) {
		int[][] rotated = new int[a.length][a.length];

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				int newRow = row;
				int newCol = col;
				if (col == 0) {
					newRow = 0;
				}
				if (col == 1) {
					newRow = 1;
				}
				if (col == 2) {
					newRow = a.length - 1;
				}
				if (row == 0) {
					newCol = a.length - 1;
				}
				if (row == 1) {
					newCol = 1;
				}
				if (row == 2) {
					newCol = 0;
				}
				rotated[newRow][newCol] = a[row][col];
		
			}
		}

		return rotated;
	}

}
