package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Dog dog = new Dog("Aira", 10, "house");
        Cat cat = new Cat("Tom", 5, "gray");
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int weight;
        String address;

        public Dog(String name,int weight, String address) {
            this.name = name;
            this.weight = weight;
            this.address = address;
        }
    }
    public static class Cat {
        String name;
        int age;
        String color;

        public Cat(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }
}
