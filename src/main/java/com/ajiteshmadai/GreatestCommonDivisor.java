package com.ajiteshmadai;
/* Find the GreatestCommonDivisor GCD of N positive integers
 Input :
    num : number of elements
    arr : List of Positive Integers
 */
public class GreatestCommonDivisor {

    public static int generalizedGCD(int num, int[] arr)
    {
        int gcd = 0;
        for(int i = 1; i < 999; i++) {

            boolean isDivisible = false;
            for(int j = 0; j < num; j++) {

                if(arr[j] % i == 0) {
                    System.out.println(arr[j] + " % " + i + " == " +  0);
                    isDivisible = isDivisible && (arr[j] % i == 0);
                }
            }
            if(isDivisible && i > gcd) {
                System.out.println("GCD :" + i);
                gcd = i;
            }

        }

        return gcd;
    }
}
