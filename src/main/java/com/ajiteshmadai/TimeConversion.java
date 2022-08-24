package com.ajiteshmadai;


//https://www.hackerrank.com/challenges/time-conversion/problem
public class TimeConversion {


    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {

        if (s == null || s.length() == 0) {
            return null;
        }

        //check AM / PM
        // if AM - hours - 12
        // if PM - hours + 12


        boolean isAM = checkIfAM(s);

        return convertTo24HourFormat(s, isAM);


    }

    private static boolean checkIfAM(String time) {
        return time.endsWith("AM");
    }

    private static String convertTo24HourFormat(String time, boolean isAM) {
        String[] splitTime = time.split(":");
        int hours = 0;
        if (splitTime.length > 1) {
            hours = Integer.parseInt(splitTime[0]);
        }


        if (!isAM) {
            hours += 12;
            if (hours >= 24) {
                hours -= 12;
            }
        } else if (hours >= 12) {
            hours -= 12;
        }

        splitTime[0] = Integer.toString(hours);
        if (splitTime[0].length() == 1) {
            splitTime[0] = "0" + splitTime[0];
        }

        return splitTime[0] + ":" + splitTime[1] + ":" + splitTime[2].substring(0, 2);
    }


}
