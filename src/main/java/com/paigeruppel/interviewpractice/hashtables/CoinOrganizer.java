package com.paigeruppel.interviewpractice.hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CoinOrganizer {

	public int possibleSums(int[] coins, int[] quantities) {
		Map<Integer, Integer> coinMap = new HashMap<>();
		Set<Integer> sums = new HashSet<>();
		List<Integer> rawSums = new ArrayList<>();
		for (int i = 0; i < coins.length; i++) {
			int coin = coins[i];
			int quantity = quantities[i];
			coinMap.put(coin, quantity);
			int q = 1;
			do {
				sums.add(coin * q);
				rawSums.add(coin * q);
				q++;
			} while (q < quantity);
		}

		for (int i = 0; i < rawSums.size() - 1; i++) {
			int temp = rawSums.get(i) + rawSums.get(i + 1);
			sums.add(temp);
		}

		return sums.size();
	}


}
