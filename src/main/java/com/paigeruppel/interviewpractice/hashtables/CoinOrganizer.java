package com.paigeruppel.interviewpractice.hashtables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CoinOrganizer {

	public int possibleSums(int[] coins, int[] quantities) {
		Set<Integer> sums = new HashSet<>();
		List<Integer> rawSums = new ArrayList<>();

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
		
		for (int i = 0; i < availableCoins.size() - 1; i++) {
			for (int j = i + 1; j < availableCoins.size(); j++) {
				sums.add(availableCoins.get(i) + availableCoins.get(j));
			}
		}

		//
		// for (int i = 0; i < coins.length; i++) {
		// for (int j = i + 1; j < coins.length + 1; j++) {
		// int first = rawSums.get(i);
		// int next = rawSums.get(j);
		// sums.add(first + next);
		// rawSums.add(first + next);
		// }
		// }
		//
		// for (int i = 0; i < rawSums.size() - 1; i ++) {
		// for (int j = i + 1; j < rawSums.size(); j++) {
		// int first = rawSums.get(i);
		// int next = rawSums.get(j);
		// sums.add(first + next);
		// }
		// }

		return sums.size();
	}

}
