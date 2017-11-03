package com.paigeruppel.interviewpractice.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cryptarithm {

	/*
	 * should take a crypt and a solution - the solution contains all of the
	 * characters that make up the crypt, "paired" with unique values - return true
	 * if the corresponding values form a valid arithmetic solution
	 */

	public boolean isCryptSolution(String[] crypt, char[][] solution) {
		Map<Character, Integer> solutionPairs = convertSolutionToMap(solution);
		List<Integer> arithmetic = new ArrayList<>();
		List<Character> firstDigits = new ArrayList<>();

		for (int s = 0; s < crypt.length; s++) {
			String current = crypt[s];
			String entry = "";
			for (int i = 0; i < current.length(); i++) {
				int value = solutionPairs.get(current.charAt(i));
				entry += "" + value;
			}
			Integer value = Integer.parseInt(entry);
			arithmetic.add(s, value);
			if (entry.length() > 1) {
				firstDigits.add(entry.charAt(0));
			}
		}
		
		return !hasLeadingZeroes(firstDigits) && isValidExpression(arithmetic);
	}

	private Map<Character, Integer> convertSolutionToMap(char[][] solution) {
		Map<Character, Integer> pairs = new HashMap<>();
		for (int i = 0; i < solution.length; i++) {
			Character c = solution[i][0];
			String s = "" + solution[i][1];
			Integer v = Integer.parseInt(s);
			pairs.put(c, v);
		}
		return pairs;
	}

	private boolean isValidExpression(List<Integer> arithmetic) {
		return arithmetic.get(0) + arithmetic.get(1) == arithmetic.get(2);
	}

	private boolean hasLeadingZeroes(List<Character> firstDigits) {
		return firstDigits.contains('0');
	}

}
