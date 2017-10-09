package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int number1 = Integer.parseInt(number);
        if (number1 > 0) {
            number1 = number1 * 2;
        }
        else if (number1 < 0) {
            number1 = number1 + 1;
        }
        else {
            number1 = 0;
        }
        System.out.println(number1);

    }

}