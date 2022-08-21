package com.ajiteshmadai;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/***
 <a href="https://www.hackerrank.com/challenges/plus-minus/problem">PlusMinus</a>
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with
 *
 * places after the decimal.
 *
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to
 *
 * are acceptable.
 *
 * Example
 * There are elements, two positive, two negative and one zero. Their ratios are , and
 *
 * . Results are printed as:
 *
 * 0.400000
 * 0.400000
 * 0.200000
 *
 * Function Description
 *
 * Complete the plusMinus function in the editor below.
 *
 * plusMinus has the following parameter(s):
 *
 *     int arr[n]: an array of integers
 *
 * Print
 * Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with
 *
 * digits after the decimal. The function should not return a value.
 *
 * Input Format
 *
 * The first line contains an integer,
 * , the size of the array.
 * The second line contains space-separated integers that describe
 *
 * .
 *
 * Constraints
 *
 *
 * Output Format
 *
 * Print the following
 * lines, each to
 *
 * decimals:
 *
 *     proportion of positive values
 *     proportion of negative values
 *     proportion of zeros
 */
public class PlusMinus {



    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {

        int length = arr.size();
        int positiveIntegerCount = 0, negativeIntegerCount = 0, zeroCount = 0;
        for (Integer number : arr) {
            if (arr.get(number) < 0) {
                negativeIntegerCount++;
            } else if (arr.get(number) > 0) {
                positiveIntegerCount++;
            } else {
                zeroCount++;
            }
        }
        //System.out.println(positiveIntegerCount + ", " + negativeIntegerCount + ", " + zeroCount);
        calculateAndPrintRatio(positiveIntegerCount, length);
        calculateAndPrintRatio(negativeIntegerCount, length);
        calculateAndPrintRatio(zeroCount, length);


    }

    private static void calculateAndPrintRatio(int count, int length) {
        double ratio = (double) count / length;
        System.out.format("%.6f\n", ratio);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinus.plusMinus(arr);

        bufferedReader.close();
    }


}
