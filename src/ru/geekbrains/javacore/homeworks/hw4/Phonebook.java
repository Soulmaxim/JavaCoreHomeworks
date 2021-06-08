package ru.geekbrains.javacore.homeworks.hw4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<Integer>> phoneBook = new HashMap<>();
    public void add(String name, int phone) {
        List<Integer> phoneList = phoneBook.get(name);
        if (phoneList != null) phoneList.add(phone);
        else {
            phoneList = new ArrayList<>();
            phoneList.add(phone);
            phoneBook.put(name, phoneList);
        }
    }
    public List<Integer> get(String name) {
        return phoneBook.get(name);
    }

    @Override
    public String toString() {
        return "Phonebook{" + phoneBook + '}';
    }
}
