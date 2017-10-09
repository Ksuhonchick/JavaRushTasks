package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int i;
       boolean isExit = false;
       double sum = 0;
       for (i = 0; !isExit ;i++) {
           int a = Integer.parseInt(reader.readLine());
           sum += a;
           if (a == -1) {
               System.out.println((sum + 1)/ i);
               isExit = true;
           }

       }
       }

    }


