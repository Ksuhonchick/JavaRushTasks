package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a > 0)  {
            if (b > 0) {
                if (c > 0){
                    System.out.println("3");
                }
                else {
                    System.out.println("2");
                }
            }
            else {
                if (c > 0){
                    System.out.println("2");
                }
                else {
                    System.out.println("1");
                }
            }
        }
        else {
            if (b > 0) {
                if (c > 0){
                    System.out.println("2");
                }
                else {
                    System.out.println("1");
                }
            }
            else {
                if (c > 0){
                    System.out.println("1");
                }
                else {
                    System.out.println("0");
                }

            }
        }

    }
}
