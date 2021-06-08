package ru.geekbrains.javacore.homeworks.hw4;

import java.util.*;

public class Homework4 {
    public static void makeArrAndCount() {
        List<String> arr = Arrays.asList("qwert", "cat", "qwert", "dog", "home",
                "windows", "shift", "qwert", "qwert", "home", "home", "windows",
                "dog", "car", "dog", "cat", "dog", "home", "dog", "shift", "r");
        Set<String> arrWithoutDuplicates = new HashSet<>(arr);
        int temp;
        for (String s : arrWithoutDuplicates) {
            System.out.println(s + ": " + Collections.frequency(arr, s));
        }
    }

    public static void main(String[] args) {
        makeArrAndCount();

        Phonebook phoneBook = new Phonebook();
        phoneBook.add("Vasya", 348618);
        phoneBook.add("Ira", 873461);
        phoneBook.add("Petya", 984723);
        phoneBook.add("Vasya", 193485);
        phoneBook.add("Vasya", 239357);
        phoneBook.add("Kolya", 113392);
        System.out.println();

        System.out.println("Ira phones: " + phoneBook.get("Ira"));
        System.out.println("Vasya phones: " + phoneBook.get("Vasya"));
    }
}
