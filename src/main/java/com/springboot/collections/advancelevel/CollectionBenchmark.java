package com.springboot.collections.advancelevel;

import java.util.*;

/**
 * @author prabhakar, @Date 16-05-2025
 */

public class CollectionBenchmark {

    public static void main(String[] args) {

        int size = 1_000_000;
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        Random rand = new Random();

        // Measure Time for Adding Elements
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(rand.nextInt(size));
        }
        long arrayListAddTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.add(rand.nextInt(size));
        }
        long hashSetAddTime = System.nanoTime() - start;

        // Measure Time for Searching an Element
        int searchElement = rand.nextInt(size);
        start = System.nanoTime();
        arrayList.contains(searchElement);
        long arrayListSearchTime = System.nanoTime() - start;

        start = System.nanoTime();
        hashSet.contains(searchElement);
        long hashSetSearchTime = System.nanoTime() - start;

        // Measuring time for removing an element
        start = System.currentTimeMillis();
        arrayList.remove(Integer.valueOf(searchElement));
        long arrayListRemoveTime = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        hashSet.remove(searchElement);
        long hashSetRemoveTime = System.currentTimeMillis() - start;

        // Measure Time for Iterating
        start = System.nanoTime();
        for (int num : arrayList) {
        }
        long arrayListIterateTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int num : hashSet) {
        }
        long hashSetIterateTime = System.nanoTime() - start;
        // Output Results
        System.out.println("ArrayList - Add Time: " + arrayListAddTime + " ns");
        System.out.println("HashSet - Add Time: " + hashSetAddTime + " ns");
        System.out.println("ArrayList - Search Time: " + arrayListSearchTime + " ns");
        System.out.println("HashSet - Search Time: " + hashSetSearchTime + " ns");
        System.out.println("ArrayList - Remove Time: " + arrayListRemoveTime + " ms");
        System.out.println("HashSet - Remove Time: " + hashSetRemoveTime + " ms");
        System.out.println("ArrayList - Iterate Time: " + arrayListIterateTime + " ns");
        System.out.println("HashSet - Iterate Time: " + hashSetIterateTime + " ns");

    }
}
