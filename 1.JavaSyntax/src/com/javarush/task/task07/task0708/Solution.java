package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList <> ();
        int max = 0;
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            if (max == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }


    }
}
