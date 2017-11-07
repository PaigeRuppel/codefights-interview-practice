package com.paigeruppel.interviewpractice.arrays;

public class Cryptarithm {

	/*
	 * should take a crypt and a solution - the solution contains all of the
	 * characters that make up the crypt, "paired" with unique values - return true
	 * if the corresponding values form a valid arithmetic solution
	 */

	public boolean isCryptSolution(String[] crypt, char[][] solution) {
		// Map<Character, String> solutionPairs = convertSolutionToMap(solution);
		for (char[] arr : solution) {
			for (int i = 0; i < crypt.length; i++) {
				crypt[i] = crypt[i].replace(arr[0], arr[1]);
			}
		}
		for (int i = 0; i < crypt.length; i++) {
			if (!crypt[i].equals("0") && crypt[i].startsWith("0"))
				return false;
		}
		return isValidExpression(crypt);
	}

	private boolean isValidExpression(String[] crypt) {
		return Double.parseDouble(crypt[0]) + Double.parseDouble(crypt[1]) == Double.parseDouble(crypt[2]);
	}

}
