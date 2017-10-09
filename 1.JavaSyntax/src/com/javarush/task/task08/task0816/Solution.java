package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Dep", new Date("MAY 5 1968"));
        map.put("Stal", new Date("JULY 1 1990"));
        map.put("Den", new Date("MARCH 5 1986"));
        map.put("Bond", new Date("JANUARY 1 1970"));
        map.put("Dex", new Date("APRIL 9 1978"));
        map.put("Max", new Date("JUNE 12 1989"));
        map.put("Dell", new Date("AUGUST 5 1968"));
        map.put("Sonm", new Date("JULY 15 1980"));
        map.put("Deny", new Date("OCTOBER 25 1988"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            if (value.getMonth() > 4 && value.getMonth() < 8) {
               iterator.remove();
            }
        }

            }

    public static void main(String[] args) {
        removeAllSummerPeople(createMap());
    }
}
