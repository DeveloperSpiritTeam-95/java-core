package com.springboot.collections.advancelevel.map.treemap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.*;

public class HashTableDemo {

    /*
    HashTable is synchronized
      no null key or value
      Legacy Class, ConcurrentHashMap
      slower than HashMap
      only linked list in case of collision
      all methods are synchronized
    */

    public static void main(String[] args) {

        Hashtable<Integer, String> hashMap = new Hashtable<>();

        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");
        hashMap.put(4, "Pear");
        hashMap.put(5, "Grape");
        hashMap.put(6, "Pineapple");

        System.out.println(hashMap);
        System.out.println("Value for key 2: " + hashMap.get(2));
        System.out.println("Does key exist? " + hashMap.containsKey(3));
        hashMap.remove(1);
        System.out.println("After remove key 1: " + hashMap);

        //hashMap.put(null, "value");     // Throws exception
        //hashMap.put(23,null);           // Throws exception
        //hashMap.put(null,null);

        System.out.println("After key and values null: " + hashMap);


        //HashMap<Integer,String> hashMap2 = new HashMap<>();
        Hashtable<Integer, String> hashMap2 = new Hashtable<>();

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashMap2.put(i, "First Thread" + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                hashMap2.put(i, "Second Thread" + i);
            }
        });

        thread.start();
        thread2.start();

        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Size of HashMap: " + hashMap2.size());



    }
}
