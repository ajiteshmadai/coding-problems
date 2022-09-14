package com.ajiteshmadai;

import java.util.Arrays;

public class MergeTwoArrays {

    /*
    *   Takes in 2 arrays a & b which are merged into 1 sorted array.
    */
    public static int[] mergeArrays(int[] a, int[] b) {
         int[] c = new int[a.length + b.length];
         int i = 0;
         while(i < a.length) {
             c[i] = a[i];
             i++;
         }
         int j = 0;
         while(j < b.length) {
             c[i] = b[j];
             j++;
             i++;
         }
         Arrays.sort(c);
        return c;

    }
}
