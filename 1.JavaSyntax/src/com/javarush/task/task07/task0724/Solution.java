package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human human = new Human("Anna", true, 70);
        Human human1 = new Human("Max", false, 68);
        Human human2 = new Human("Vera", true, 80);
        Human human3 = new Human("Den", false, 60);
        Human human4 = new Human("Mike", false, 40, human3, human2);
        Human human5 = new Human("Faina", true, 50, human1, human);
        Human human6 = new Human("Zoya", true, 24, human4, human5);
        Human human7 = new Human("Lilya", true, 18, human4, human5);
        Human human8 = new Human("Konstantin", false, 8, human4, human5);
        System.out.println(human.toString());
        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;


        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















