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
		
		for (int i = 0; i < availableCoins.size() - 1; i++) {
			int coin1 = availableCoins.get(i);
			int temp = coin1;
			for (int j = i + 1; j < availableCoins.size(); j++) {
				int coin2 = availableCoins.get(j);
				temp += coin2; 
				sums.add(coin1 + coin2);
				sums.add(temp);
			}
			sums.add(temp);
		}

		for (int i = 0; i < availableCoins.size() - 1; i++) {
			int coin1 = availableCoins.get(i);
			int temp = coin1;
			for (int j = i + 2; j < availableCoins.size(); j++) {
				int coin2 = availableCoins.get(j);
				temp += coin2; 
				sums.add(coin1 + coin2);
				sums.add(temp);
			}
			sums.add(temp);
		}

		for (int i = 0; i < availableCoins.size() - 1; i++) {
			int coin1 = availableCoins.get(i);
			int temp = coin1;
			for (int j = i + 3; j < availableCoins.size(); j++) {
				int coin2 = availableCoins.get(j);
				temp += coin2; 
				sums.add(coin1 + coin2);
				sums.add(temp);
			}
			sums.add(temp);
		}
		
		return sums.size();
	}

}
