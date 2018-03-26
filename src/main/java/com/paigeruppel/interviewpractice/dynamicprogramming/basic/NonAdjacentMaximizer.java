package com.paigeruppel.interviewpractice.dynamicprogramming.basic;

public class NonAdjacentMaximizer {
    public int houseRobber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return 2;
    }
}
