package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            a = Integer.parseInt(reader.readLine());
            sum = sum + a;

            if (a == -1) {
                System.out.println(sum);
                isExit = true;
            }

        }

    }
}
