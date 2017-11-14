package com.paigeruppel.interviewpractice.hashtables;

public class IndexComparison {

	public boolean containsCloseNums(int[] nums, int k) {
		for (int i = 0; i < nums.length - 1; i++) {
			int first = nums[i];
			for (int j = i+1; j < nums.length; j++) {
				int next = nums[j];
				if (first == next) {
					return Math.abs(j - i) <= k;
				}
			}
		}
		
		return false;
	}

}
