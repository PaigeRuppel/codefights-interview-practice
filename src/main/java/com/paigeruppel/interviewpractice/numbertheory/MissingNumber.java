package com.paigeruppel.interviewpractice.numbertheory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {

	public int findMissingNumber(int[] arr) {
		int n = arr.length;
		List<Integer> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int count = 0;
		while (count <= n) {
			if (!numbers.contains(count)) {
				return count;
			}
			count++;
		}
		return 0;
	}

}
