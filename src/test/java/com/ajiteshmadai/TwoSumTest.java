package com.ajiteshmadai;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum twosum = new TwoSum();
        int[] arr = {3, 2, 4};

        int[] indices = twosum.twoSum(arr, 6);
        int[] expected = {1, 2};
        assertArrayEquals(expected, indices);
    }
}