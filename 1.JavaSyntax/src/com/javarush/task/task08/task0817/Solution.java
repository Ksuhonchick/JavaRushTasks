package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
       HashMap<String, String> map = new HashMap<>();
       map.put("Strog", "Den");
       map.put("Son", "Max");
       map.put("Volk", "Mark");
       map.put("Tolstoy", "Leo");
       map.put("Tven", "Mark");
       map.put("Stroy", "Den");
       map.put("Sont", "Max");
       map.put("Volkov", "Mark");
       map.put("Tol", "Leo");
       map.put("Tolk", "Mark");
       return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            String value = pair.getValue();
            String key = pair.getKey();
            map.remove(key, value);
            int size = map.size();
            removeItemFromMapByValue(map, value);
            if (map.size() == size) map.put(key, value);
        }

    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
