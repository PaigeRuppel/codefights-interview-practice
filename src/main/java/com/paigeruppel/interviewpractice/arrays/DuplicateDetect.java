package com.paigeruppel.interviewpractice.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateDetect {

	public int firstDuplicate(int[] a) {
		Set<Integer> found = new HashSet<>();
		
		int duplicate = -1;
		
		for (int i = 0; i < a.length && duplicate == -1; i++) {
			if (found.contains(a[i])) {
				duplicate = a[i];
			}
			found.add(a[i]);
		}
		
		return duplicate;
	}

}
