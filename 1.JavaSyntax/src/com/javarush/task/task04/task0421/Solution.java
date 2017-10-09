package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        int len1 = name1.length();
        int len2 = name2.length();
        if (len1 == len2) {
            if (name1.equals(name2)) {
                System.out.println("Имена идентичны");
            }
            else {
                System.out.println("Длины имен равны");

            }
        }
    }
}
