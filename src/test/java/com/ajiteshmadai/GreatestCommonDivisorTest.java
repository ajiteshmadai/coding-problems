package com.ajiteshmadai;

import org.junit.Test;

public class GreatestCommonDivisorTest {

    @Test
    public void testGeneralizedGCD() {
        int arr[] = {2, 4, 6, 8, 10};
        int gcd = GreatestCommonDivisor.generalizedGCD(5, arr);
        System.out.println(gcd);
    }
}
