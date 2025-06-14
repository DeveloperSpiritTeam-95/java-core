package com.springboot.collections.advancelevel.list.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Level1 {

    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");

        System.out.println(animals);
        animals.removeFirst();

        System.out.println(animals);
        animals.removeLast();

        System.out.println(animals);
        animals.remove("Cat");

        System.out.println(animals);
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");

        System.out.println(animals);

        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Cat"));

        // we can do that in ArrayList also
        animals.removeAll(animalsToRemove);

        System.out.println(animals);
    }
}
