package com.springboot.collections.advancelevel.set;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {

    public static void main(String[] args) {

        // Thread safe
        // Copy-On-Write Mechanism
        // No Duplicate elements
        // Iterations Do Not Reflect Modifications

//        Set<String> shoppingSet = new HashSet<>();     // ConcurrentModificationException

        // According to use case you can apply on your requirements.
        CopyOnWriteArraySet<String> shoppingSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<String> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        shoppingSet.add("Apple");
        shoppingSet.add("Banana");
        shoppingSet.add("Bread");
        shoppingSet.add("Eggs");
        System.out.println("Initial Shopping List: "+shoppingSet);

       /*
        // this is for Set interface as well CopyOnWriteArraySet
        for (String item : shoppingSet) {
            System.out.println(item);
            if (item.equals("Eggs")){
                shoppingSet.add("Butter");
                //shoppingList.add("Cucumber");
                System.out.println("Added Butter while reading");
            }
        }
        */

        // comparison between CopyOnWriteArraySet and ConcurrentSkipListSet

        System.out.println("Iterating and modifying CopyOnWriteArraySet: ");
        for (String shoppingItem : shoppingSet) {
            System.out.println("Reading from CopyOnWriteArraySet: "+shoppingItem);

            // Attempting to modify the set during iteration
            shoppingSet.add("Laptop");
            concurrentSkipListSet.add(shoppingItem);
        }

        System.out.println("Iterating and modifying ConcurrentSkipListSet: ");
        for (String shoppingItem : concurrentSkipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet: "+shoppingItem);

            // Attempting to modify the set during iteration
            concurrentSkipListSet.add("Laptop");
        }

        System.out.println("After Shopping List: "+shoppingSet);
        System.out.println("After ConcurrentSkipList: "+concurrentSkipListSet);


    }
}
