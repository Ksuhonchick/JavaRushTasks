package com.javarush.task.task08.task0820;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<Cat>();

        //напишите тут ваш код
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        return cats;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> dogs = new HashSet<>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);

    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object o : pets) {
            System.out.println(o);
        }
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog {

    }
}
