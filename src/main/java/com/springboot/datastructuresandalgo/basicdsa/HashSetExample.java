package com.springboot.datastructuresandalgo.basicdsa;

import java.util.HashSet;

public class HashSetExample {

    // HashSet (Unique Elements)
    // Stores unique values only (no duplicates).
    // Time Complexity: O(1) for add, remove, and contains (on average).
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10); // Duplicate, will not be added

        System.out.println("HashSet: " + set);

        System.out.println("Contains 20? " + set.contains(20)); // true
    }
}
