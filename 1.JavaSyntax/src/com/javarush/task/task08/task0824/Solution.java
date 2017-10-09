package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human baby1 = new Human("Sasha", true, 15, new ArrayList<>());
        Human baby2 = new Human("Mark", true, 12, new ArrayList<>());
        Human baby3 = new Human("Lika", false, 10, new ArrayList<>());
        ArrayList<Human> mather1List = new ArrayList<>();
        mather1List.add(baby1);
        mather1List.add(baby2);
        mather1List.add(baby3);
        Human mother = new Human("Vera", false, 42, mather1List);
        Human father = new Human("Gera", true, 43, mather1List);
        ArrayList<Human> granny1list = new ArrayList<>();
        granny1list.add(mother);
        Human granny1 = new Human("Masha", false, 60, granny1list);
        Human grandfather1 = new Human("Misha", true, 63, granny1list);
        ArrayList<Human> granny2list = new ArrayList<>();
        granny2list.add(father);
        Human granny2 = new Human("Dasha", false, 65, granny2list);
        Human grandfather2 = new Human("Sasha", true, 68, granny2list);

        System.out.println(baby1.toString());
        System.out.println(baby2.toString());
        System.out.println(baby3.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(granny1.toString());
        System.out.println(grandfather1.toString());
        System.out.println(granny2.toString());
        System.out.println(grandfather2.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
