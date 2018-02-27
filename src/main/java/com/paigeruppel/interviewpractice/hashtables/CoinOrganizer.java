package com.paigeruppel.interviewpractice.hashtables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CoinOrganizer {

	private Set<Integer> sums = new HashSet<>();

	public int possibleSums(int[] coins, int[] quantities) {
		List<Integer> possibleCoins = buildPossibleCoinsList(coins, quantities);
		getSums(possibleCoins, 0, 0);
		return sums.size();
	}

	private void getSums(List<Integer> possibleCoins, int start, int sum) {
		if (possibleCoins.size() == start) return;
		int combinedSum = sum + possibleCoins.get(start);
		sums.add(combinedSum);
		getSums(possibleCoins, start + 1, sum);
		getSums(possibleCoins, start + 1, combinedSum);
	}

	private List<Integer> buildPossibleCoinsList(int[] coins, int[] quantities) {
		List<Integer> possibleCoins = new ArrayList<>();
		for (int i = 0; i < coins.length; i++) {
			int quantity = 1;
			while (quantity <= quantities[i]) {
				possibleCoins.add(coins[i]);
				quantity++;
			}
		}
		return possibleCoins;
	}

}
