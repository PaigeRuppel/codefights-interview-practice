package com.paigeruppel.interviewpractice.hashtables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CoinOrganizer {


    public int possibleSums(int[] coins, int[] quantities) {
        Set<Integer> sums = new HashSet<>();
        List<Integer> possibleCoins = buildPossibleCoinsList(coins, quantities);
        for (int coin : possibleCoins) {
            if (coin >= 10) {
                getSums(sums, possibleCoins, 0, 0);
                break;
            }
        }
        int possibleSums = 0;
        if (sums.size() == 0) {
           for (int i = 0; i < coins.length; i++) {
               possibleSums += (coins[i] * quantities[i]);
           }
        } else {
            possibleSums = sums.size();
        }
        return possibleSums;
    }

    private void getSums(Set<Integer> sums, List<Integer> possibleCoins, int start, int startingValue) {
        if (possibleCoins.size() == start) return;
        int sum = startingValue + possibleCoins.get(start);
        sums.add(sum);
        getSums(sums, possibleCoins, start + 1, startingValue); // do not include the current coin
        getSums(sums, possibleCoins, start + 1, sum);    // include the current coin
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
