package com.ajiteshmadai;

import java.util.List;
//https://www.hackerrank.com/challenges/mini-max-sum/problem
public class MinMaxSum {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long sum, minimum = Long.MAX_VALUE, maximum = 0 ;
        for(int i = 0; i < arr.size(); i++) {
            sum = 0;

            for(int j = 0; j < arr.size(); j++) {
                if(j == i) {
                    continue;
                }
                sum += arr.get(j);
            }
            if(sum > maximum) {
                maximum = sum;
            }
            if(minimum > sum) {
                minimum = sum;
            }

        }

        System.out.print(minimum + " " + maximum);

    }
}
