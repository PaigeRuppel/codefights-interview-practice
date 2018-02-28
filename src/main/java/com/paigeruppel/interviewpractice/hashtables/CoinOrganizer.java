package com.paigeruppel.interviewpractice.hashtables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CoinOrganizer {

    /* Make the hash table's keys the possible sums (or a set containing the possible sums).
    Start empty, and add new coins to it.
    When adding a new coin, you only need to consider the results you get from adding coins
    to a previous possible result.*/

    public int possibleSums(int[] coins, int[] quantities) {
        Set<Integer> sums = new HashSet<>();
        for (int coin : coins) {
            if (coin >= 5) {
                sums = getAllSums(coins, quantities);
            }
        }
        int possibleSums = sums.size();
        if (possibleSums == 0) {
            for (int i = 0; i < coins.length; i++) {
                possibleSums += (coins[i] * quantities[i]);
            }
        }
        return possibleSums;
    }

    private Set<Integer> getAllSums(int[] coins, int[] quantities) {
        Set<Integer> sums = new HashSet<>();
        List<Integer> allCoins = buildPossibleCoinsList(coins, quantities);
        sums.add(allCoins.get(0));
        for (int i = 1; i < allCoins.size(); i++) {
            Set<Integer> tempSums = new HashSet<>();
            for (int sum : sums) {
                int tempSum = sum + allCoins.get(i);
                tempSums.add(tempSum);
            }
            for (int newSum : tempSums) {
                sums.add(newSum);
            }
            sums.add(allCoins.get(i));
        }
        return sums;
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
