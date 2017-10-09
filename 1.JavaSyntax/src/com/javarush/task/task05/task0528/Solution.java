package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        Date date = new Date(28,"08",2017);

        System.out.println(date.day + " " + date.month + " " + date.year);


    }
    public static class Date {
        int day, year;
        String month;

        public Date(int day, String month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
}
