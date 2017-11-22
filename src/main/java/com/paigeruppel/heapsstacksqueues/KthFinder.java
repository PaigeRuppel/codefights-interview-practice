package com.paigeruppel.heapsstacksqueues;

public class KthFinder {

	public int kthLargestElement(int[] nums, int k) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            int tmp = 0;
	            if (nums[i] < nums[j]) {
	                tmp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = tmp;
	            }
	        }
	    }
		
		return nums[k - 1];
	}

}
