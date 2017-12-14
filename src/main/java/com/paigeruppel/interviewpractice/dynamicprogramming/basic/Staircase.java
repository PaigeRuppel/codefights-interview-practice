package com.paigeruppel.interviewpractice.dynamicprogramming.basic;

public class Staircase {

	// you can take the staircase 1 or 2 steps at a time
	// return the total possible ways to climb a staircase with n steps
	public int climbingStairs(int n) {
		return fibonacci(n) + fibonacci(n-1);
	}

	private int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
