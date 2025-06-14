package com.springboot.collections.advancelevel.map.hashmap;

import java.util.HashMap;

public class Level2 {

    public static void main(String[] args) {

        // Suppose we want to store information about the number of fruits in a store.
        // Here what we want to store:

        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 10);
        fruits.put("orange", 20);
        fruits.put("banana", 30);
        fruits.put("grapes", 40);
        fruits.put("pear", 50);
        fruits.put("watermelon", 60);
        fruits.put("pineapple", 70);
        fruits.put("cherry", 80);

        System.out.println(28394678 % 16);

//        System.out.println(fruits);

        /*
                            Internal Process
            The key "apple" is hashed using its hashCode(). Let's assume "apple"
            generates a hashCade of 28394678 ( this is just like example value not exact).

            THe hashCode is used to calculate the index in the internal array (bucket array).
            Let's say the array size is internally 16.

            index = hashCode % arraySize;

            index = 28462991 % 16 = 6

            This means "apple" will be stored in bucket 6.

            fruits.put("orange", 20);                   fruits.put("banana", 30);
            index = 2348485 % 16 = 4                    index = 47839364 % 16 = 13


            fruits.put("grapes", 40);
            index = 59683365 % 16 = 13

            fruits.put("banana", 30); and fruits.put("grapes", 40);

            it is called collision

            Since "banana" is already stored in bucket 13, the HashMap handles the collision by
            adding "grapes" to the linked list in bucket 14.

            Now, bucket 13 contains two entries: ("banana", 30) and ("grapes", 40).

        */

        // get the data if present else take the default value
        System.out.println(fruits.getOrDefault("apple", 0)); // not works
        System.out.println(fruits.getOrDefault("defend", 23)); // its works


        fruits.putIfAbsent("grapes",45);        // it will not work
        fruits.putIfAbsent("dragon",45);        // it will work
        System.out.println(fruits);


    }

}
