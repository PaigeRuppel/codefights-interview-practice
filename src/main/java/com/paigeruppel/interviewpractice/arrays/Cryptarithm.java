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
		Map<Character, String> solutionPairs = convertSolutionToMap(solution);
		List<Double> arithmetic = new ArrayList<>();

		List<String> firstDigits = new ArrayList<>();
		for (int s = 0; s < crypt.length; s++) {
			String current = crypt[s];
			String entry = "";
			for (int i = 0; i < current.length(); i++) {
				char c = current.charAt(i);
				String value = solutionPairs.get(c);
				if (i == 0 && current.length() > 1) {
					firstDigits.add(value);
				}
				entry += "" + value;
			}
			Double dValue = Double.parseDouble(entry);
			arithmetic.add(dValue);
		}
		return !hasLeadingZeroes(firstDigits, solutionPairs) && isValidExpression(arithmetic);
	}

	private Map<Character, String> convertSolutionToMap(char[][] solution) {
		Map<Character, String> pairs = new HashMap<>();
		for (int i = 0; i < solution.length; i++) {
			Character c = solution[i][0];
			String s = "" + solution[i][1];
			pairs.put(c, s);
		}
		return pairs;
	}
	
	private boolean hasLeadingZeroes(List<String> firstDigits, Map<Character, String> pairs) {
		return firstDigits.contains("0") && !pairs.containsValue(".");
	}

	private boolean isValidExpression(List<Double> arithmetic) {
		double first = arithmetic.get(0);
		double second = arithmetic.get(1);
		double sum = arithmetic.get(2);
		return first + second == sum;
	}

	// check for presence of decimals
	// check for length of numbers beginning with zero
	// check for numbers beginning with zero

}
