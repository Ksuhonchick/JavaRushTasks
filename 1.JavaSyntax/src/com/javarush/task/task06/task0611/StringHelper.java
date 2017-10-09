package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

import com.sun.org.apache.xpath.internal.SourceTree;

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        result = StringHelper.multiply(s, 5);
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + s;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(StringHelper.multiply("Amigo"));
    }
}
