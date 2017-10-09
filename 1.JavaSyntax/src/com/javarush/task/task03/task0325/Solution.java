package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String salary1 = reader.readLine();
       int salary2 = Integer.parseInt(salary1);
       System.out.println("Я буду зарабатывать $" + salary2 + " в час");
    }
}
