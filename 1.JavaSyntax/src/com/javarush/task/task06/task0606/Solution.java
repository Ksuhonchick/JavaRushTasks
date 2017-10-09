package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chet = Integer.parseInt(reader.readLine());
        while (chet > 0) {
            if (chet % 2 == 0) {
                even = even + 1;
            }
            else {
                odd = odd + 1;
            }
            chet/=10;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}