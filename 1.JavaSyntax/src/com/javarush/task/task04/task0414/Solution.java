package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String year = reader.readLine();
       int year1 = Integer.parseInt(year);
       if (year1 % 100 == 0) {
           if (year1 % 400 == 0){
               System.out.println("количество дней в году: 366");
           }
           else {
               System.out.println("количество дней в году: 365");
           }
       }
       else {
           if (year1 % 4 == 0) {
               System.out.println("количество дней в году: 366");
           } else {
               System.out.println("количество дней в году: 365");
           }
       }
    }
}