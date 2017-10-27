package com.paigeruppel.interviewpractice.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueCharacter {

	/*
	 * Note: Write a solution that only iterates over the string once and uses O(1)
	 * additional memory, since this is what you would be asked to do during a real
	 * interview.
	 * 
	 * Given a string s, find and return the first instance of a non-repeating
	 * character in it. If there is no such character, return '_'.
	 */

	public char firstNotRepeatingCharacter(String s) {
		Set<Character> repeating = new HashSet<>();
		List<Character> notRepeating = new ArrayList<>();
		char firstUnique = '_';
		char[] sArray = s.toCharArray();
		
		for(int i = 0; i < sArray.length; i++) {
			char letter = sArray[i];
			if (repeating.contains(letter)) {
				continue;
			}
			if (notRepeating.contains(letter)) {
				notRepeating.remove((Character) letter);
				repeating.add(letter);
			} else {
				notRepeating.add(letter);
			}
		}
		
		if (notRepeating.size() != 0) {
			firstUnique = notRepeating.get(0);
		}
		
		return firstUnique;
	}

}
