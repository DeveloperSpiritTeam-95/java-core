package com.springboot.datastructuresandalgo.basicdsa;

import java.util.HashMap;

public class HashMapExample {

    // HashMap (Key-Value Pair)
    // Stores unique keys with associated values.
    // Time Complexity: O(1) for insertion, deletion, and lookup (on average).
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 28);

        System.out.println("Alice's age: " + map.get("Alice")); // 25

        System.out.println("Contains key 'Bob'? " + map.containsKey("Bob")); // true

        map.remove("Charlie");
        System.out.println("Updated HashMap: " + map);
    }
}
