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

		buildPossibleSums(1, availableCoins, sums);
		return sums.size();
	}

	private Set<Integer> buildPossibleSums(int index, List<Integer> availableCoins, Set<Integer> sums) {
		int increment = index;
		int max = availableCoins.size();
		for (int i = 0; i < max; i++) {
			int coin1 = availableCoins.get(i);
			int temp = coin1;
			for (int j = i + increment; j < max; j++) {
				int coin2 = availableCoins.get(j);
				temp += coin2;
				sums.add(temp);
			}
		}
		if (index < max) {
			index += 1;
			buildPossibleSums(index, availableCoins, sums);
		}
		
		return sums;
	}
}
