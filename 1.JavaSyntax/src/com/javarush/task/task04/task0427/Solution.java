package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);
        int len = a.length();
        if (a1 >= 1 && a1 <= 999) {
            if (len == 1){
                if (a1 % 2 == 0) {
                    System.out.println("четное однозначное число");
                }
                else {
                    System.out.println("нечетное однозначное число");
                }
            }
            else if (len == 2) {
                if (a1 % 2 == 0) {
                    System.out.println("четное двузначное число");
                    }
                else {
                    System.out.println("нечетное двузначное число");
                    }
                }
            else if (len == 3) {
                if (a1 % 2 == 0) {
                    System.out.println("четное трехзначное число");
                }
                else {
                    System.out.println("нечетное трехзначное число");
                }
            }
            }

        }


    }


