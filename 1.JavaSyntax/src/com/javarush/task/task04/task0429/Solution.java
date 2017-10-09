package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int p = 0;
        int n = 0;
        if (a > 0) {
            p = p + 1;
        }
        else if (a < 0) {
            n = n + 1;
        }
        if (b > 0) {
            p = p + 1;
        }
        else if (b < 0) {
            n = n + 1;
        }
        if (c > 0) {
            p = p + 1;
        }
        else if (c < 0) {
            n = n + 1;
        }
        System.out.println("количество отрицательных чисел: " + n);
        System.out.println("количество положительных чисел: " + p);
    }
}


