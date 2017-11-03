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
		Map<Character, Integer> solutionPairs = new HashMap<>();
		List<String> arithmetic = new ArrayList<>();
		for (int i = 0; i < solution.length; i++) {
			Character c = solution[i][0];
			String s = ""+solution[i][1];
			Integer v = Integer.parseInt(s);
			solutionPairs.put(c, v);
		}
		
		for (int s = 0; s < crypt.length; s++) {
			String current = crypt[s];
			String entry = "";
			for (int i = 0; i < current.length(); i++) {
				int value = solutionPairs.get(current.charAt(i));
				entry += ""+value;
			}
			arithmetic.add(s, entry);
		}
		Integer first = Integer.parseInt(arithmetic.get(0));
		Integer second = Integer.parseInt(arithmetic.get(1));
		Integer sum = Integer.parseInt(arithmetic.get(2));
		
		return first + second == sum;
	}

}
