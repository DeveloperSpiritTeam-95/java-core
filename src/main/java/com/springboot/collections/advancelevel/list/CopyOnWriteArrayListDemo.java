package com.springboot.collections.advancelevel.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(2);
        copyOnWriteArrayList.add(3);
        System.out.println("CopyOnWriteArrayList: "+copyOnWriteArrayList);

        System.out.println(copyOnWriteArrayList.get(0));

        // Copy On Write means that whenever a write operation
        // like adding or removing an element
        // instead of directly modifying the existing list
        // a new copy of list is created, and the modification is applied to that copy
        // This ensures that other threads reading the list of while it's being modified are unaffected.

        // Read Operations: Fast and direct, since they happen on a stable list without interface from modifications.
        // Write Operations: A new Copy of the list is created for every modification.
        //                   The reference to the list is then updated so that subsequent reads use this new list.
        // read more
        // write function it will take more memory consumption

        //List<String> shoppingList = new ArrayList<>();      //ConcurrentModificationException
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Apple");
        shoppingList.add("Banana");
        shoppingList.add("Orange");
        shoppingList.add("Grape");

        System.out.println("Initial Shopping List: "+shoppingList);

        for (String item : shoppingList) {
            System.out.println(item);
            // try to modify the list while reading
            if (item.equals("Apple")) {
                shoppingList.add("Butter");
                System.out.println("Added Butter to Shopping List: ");
            }
        }

        System.out.println("After Shopping List: "+shoppingList);


        List<String> sharedList = new ArrayList<>();   // ConcurrentModificationException
        //List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");
        Thread readerThread = new Thread(() -> {
            try {
                while (true) {
                    // Iterate through the list
                    for (String item : sharedList) {
                        System.out.println("Reading item: " + item);
                        Thread.sleep(100); // Small delay to simulate work
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in reader thread: " + e);
            }
        });
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(500); // Delay to allow reading to start first
                sharedList.add("Item4");
                System.out.println("Added Item4 to the list.");

                Thread.sleep(500);
                sharedList.remove("Item1");
                System.out.println("Removed Item1 from the list.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        readerThread.start();
        writerThread.start();
    }
}
