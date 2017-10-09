package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name, address, color;
    int age, weight;
    public Cat(String name) {
        this.name = name;
        this.color = "black";
        this.age = 4;
        this.weight = 1;
    }
    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "orange";
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "white";
    }
    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 5;
    }
    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this. age = 3;
    }

    public static void main(String[] args) {

    }
}
