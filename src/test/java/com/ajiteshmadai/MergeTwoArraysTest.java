package com.ajiteshmadai;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoArraysTest {

    @Test
    public void testMergeArrays() {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int[] c = MergeTwoArrays.mergeArrays(a, b);
        for (int i : c) {
            System.out.println(i);
        }

    }
}