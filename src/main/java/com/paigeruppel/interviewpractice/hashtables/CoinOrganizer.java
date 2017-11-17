package com.paigeruppel.interviewpractice.hashtables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CoinOrganizer {

	public int possibleSums(int[] coins, int[] quantities) {
		Set<Integer> sums = new HashSet<>();
		List<Integer> availableCoins = new ArrayList<>();
		for (int i = 0; i < coins.length; i++) {
			int coin = coins[i];
			int quantity = quantities[i];
			int q = 1;
			do {
				availableCoins.add(coin);
				sums.add(coin);
				q++;
			} while (q <= quantity);
		}

		int index = availableCoins.size();
		buildPossibleSums(index, availableCoins, sums);
		return sums.size();
	}

	private Set<Integer> buildPossibleSums(int index, List<Integer> availableCoins, Set<Integer> sums) {
		int increment = index;
		for (int i = 0; i < availableCoins.size(); i++) {
			int coin1 = availableCoins.get(i);
			int temp = coin1;
			for (int j = i + increment; j < availableCoins.size() && j > 0; j--) {
				int coin2 = availableCoins.get(j);
				temp += coin2;
				sums.add(coin1 + coin2);
				sums.add(temp);
			}
		}

		if (index != 0) {
			index -= 1;
			buildPossibleSums(index, availableCoins, sums);
		}
		return sums;
	}
}
