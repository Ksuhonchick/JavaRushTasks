package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int max = 1;

        for (int i = 0; i < 9; i++) {
            int count = 1;
            for (int j = i + 1; j < 10; j++) {
                if (list.get(i) == list.get(j)) {
                    count = count + 1;
                    if (count > max) {
                        max = count;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(max);

    }
}