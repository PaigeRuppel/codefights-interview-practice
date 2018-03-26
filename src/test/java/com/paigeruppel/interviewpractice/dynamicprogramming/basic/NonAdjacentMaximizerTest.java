package com.paigeruppel.interviewpractice.dynamicprogramming.basic;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NonAdjacentMaximizerTest {

    private NonAdjacentMaximizer underTest;

    @Before
    public void setup() {
        underTest = new NonAdjacentMaximizer();
    }

    @Test
    public void arrayOfLength3WithAllOnesShouldReturn2() {
        int[] nums = {1,1,1};
        assertThat(underTest.houseRobber(nums), is(2));
    }

    @Test
    public void arrayOfLength0ShouldReturn0() {
        int[] nums = {};
        assertThat(underTest.houseRobber(nums), is(0));
    }

    @Test
    public void arrayWithOnlyAZeroShouldReturn0() {
        int[] nums = {0};
        assertThat(underTest.houseRobber(nums), is(0));
    }

    @Test
    public void arrayWithOnlyAOneShouldReturn1() {
        int[] nums = {1};
        assertThat(underTest.houseRobber(nums), is(1));
    }

    @Test
    public void arrayWithTwoZeroesShouldReturn0() {
        int[] nums = {0,0};
        assertThat(underTest.houseRobber(nums), is(0));
    }

}
