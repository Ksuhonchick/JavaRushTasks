package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap <String, Integer> map = new HashMap<>();
        map.put("Ivanov", 200);
        map.put("Petrov", 300);
        map.put("Sidorov", 400);
        map.put("Kotov", 500);
        map.put("Lomov", 600);
        map.put("Sanov", 700);
        map.put("Petov", 800);
        map.put("Sidov", 900);
        map.put("Komov", 1000);
        map.put("Logov", 400);
        return map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap <String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            String key = pair.getKey();
            int value = pair.getValue();
            if (value < 500) {
                map.remove(key);

            }

        }
    }

    public static void main(String[] args) {

    }
}