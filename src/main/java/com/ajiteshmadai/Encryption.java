package com.ajiteshmadai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/encryption/problem
public class Encryption {


    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) throws Exception {
        //Remove spaces and find the lenght
        System.out.print("Size before trim : " + s.length());
        String trimmedString = s.replace("/s", "");
        System.out.print("Size after trim : " + trimmedString.length());
        //Determine rows X col
        int length = trimmedString.length();
        double squareRoot = Math.sqrt(length);
        System.out.print("sqrt : " + squareRoot);
        List<Integer> rowCols = determineArraySize((int) Math.floor(squareRoot),
                (int) Math.ceil(squareRoot), length);
        Integer row = rowCols.get(0);
        Integer col = rowCols.get(1);

        //insert into grid
        Character[][] charArray = new Character[row][col];
        int charCounter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (charCounter < length) {
                    charArray[i][j] = s.charAt(charCounter);
                    charCounter++;
                }

            }
        }

        //get encoded msg
        StringBuilder encodedMsg = new StringBuilder();
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (charArray[j][i] != null) {
                    encodedMsg.append(charArray[j][i]);
                }


            }
            encodedMsg.append(" ");
        }
        return encodedMsg.toString().trim();


    }

    public static List<Integer> determineArraySize(int row, int col, int length) {
        System.out.print("rows : " + row + "col: " + col);
        if (row * col < length) {
            row++;
            determineArraySize(row, col, length);
        }
        List<Integer> rowCols = new ArrayList<>();
        rowCols.add(row);
        rowCols.add(col);
        return rowCols;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Encryption.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }


}


