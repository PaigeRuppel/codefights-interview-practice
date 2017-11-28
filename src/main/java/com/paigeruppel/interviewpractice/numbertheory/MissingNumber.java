package com.paigeruppel.interviewpractice.numbertheory;

public class MissingNumber {

	public int findMissingNumber(int[] arr) {
		int n = arr.length;
		int sum = n * (n+1) / 2;
		for (int num:arr) {
			sum -= num;
		}
		return sum;
	}

}
