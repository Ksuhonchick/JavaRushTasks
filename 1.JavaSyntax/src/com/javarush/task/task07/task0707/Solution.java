package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList();
        list.add("mama");
        list.add("mila");
        list.add("ramu");
        list.add("papa");
        list.add("fhgiudfgj");
       int n = list.size();
        System.out.println(n);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }


    }
}
