package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int sum = 0;
        for(int i = 0; true; i++) {
            s = reader.readLine();
            if (s.equals("сумма")) {
               break;
            }
            else {
                sum = Integer.parseInt(s) + sum;
            }

        }
        System.out.println(sum);


    }
}
