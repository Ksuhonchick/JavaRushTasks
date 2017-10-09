package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a == b && a != c) {
            System.out.println(a + " " + b);
        }
        else if (b == c && a != c) {
            System.out.println(b + " " + c);
        }
        else if (c == a && a != b) {
            System.out.println(c + " " + a);
        }
        else if (a == b && a == c) {
            System.out.println(a + " " + b + " " + c);
        }
    }
}