package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            }
        ArrayList<Integer> listthree = new ArrayList<>();
        ArrayList<Integer> listtwo = new ArrayList<>();
        ArrayList<Integer> listrest = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0) {
                listthree.add(list.get(i));
                listtwo.add(list.get(i));
            }
            else if (list.get(i) % 3 == 0) {
                listthree.add(list.get(i));
            }
            else if (list.get(i) % 2 == 0) {
                listtwo.add(list.get(i));
            }

            else {
                listrest.add(list.get(i));
            }
        }

        printList(listthree);
        printList(listtwo);
        printList(listrest);
        }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    }

