package com.paigeruppel.interviewpractice.hashtables;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CoinOrganizerTest {

    private CoinOrganizer underTest;

    @Before
    public void setup() {
        underTest = new CoinOrganizer();
    }

    @Test
    public void shouldReturn9TestCase1() {
        int[] coins = {10, 50, 100};
        int[] quantities = {1, 2, 1};
        assertThat(underTest.possibleSums(coins, quantities), is(9));
    }

    @Test
    public void testCase2() {
        int[] coins = {10, 50, 100, 500};
        int[] quantities = {5, 3, 2, 2};
        assertThat(underTest.possibleSums(coins, quantities), is(122));
    }

    @Test
    public void testCase3() {
        int[] coins = {1};
        int[] quantities = {5};
        assertThat(underTest.possibleSums(coins, quantities), is(5));
    }

    @Test
    public void testCase4() {
        int coins[] = {1, 1};
        int quantities[] = {2, 3};
        assertThat(underTest.possibleSums(coins, quantities), is(5));
    }

}
