package com.springboot.collections.advancelevel;

import java.util.*;

/**
 * @author prabhakar, @Date 16-05-2025
 */

public class ComparisonCollectionBenchmark {
    public static void main(String[] args) {
        int[] sizes = {100_000, 500_000, 1_000_000};

        for (int size : sizes) {
            System.out.println("\nBenchmark for size: " + size);

            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();
            Set<Integer> hashSet = new HashSet<>();
            Set<Integer> treeSet = new TreeSet<>();
            Random rand = new Random();

            // Adding elements
            long start = System.currentTimeMillis();
            for (int i = 0; i < size; i++) arrayList.add(rand.nextInt(size));
            long arrayListAddTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            for (int i = 0; i < size; i++) linkedList.add(rand.nextInt(size));
            long linkedListAddTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            for (int i = 0; i < size; i++) hashSet.add(rand.nextInt(size));
            long hashSetAddTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            for (int i = 0; i < size; i++) treeSet.add(rand.nextInt(size));
            long treeSetAddTime = System.currentTimeMillis() - start;

            // Indexed retrieval (only for lists)
            int randomIndex = rand.nextInt(size);
            start = System.currentTimeMillis();
            arrayList.get(randomIndex);
            long arrayListGetTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            linkedList.get(randomIndex);
            long linkedListGetTime = System.currentTimeMillis() - start;

            // Searching
            int searchElement = rand.nextInt(size);
            start = System.currentTimeMillis();
            arrayList.contains(searchElement);
            long arrayListSearchTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            linkedList.contains(searchElement);
            long linkedListSearchTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            hashSet.contains(searchElement);
            long hashSetSearchTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            treeSet.contains(searchElement);
            long treeSetSearchTime = System.currentTimeMillis() - start;

            // Removing
            start = System.currentTimeMillis();
            arrayList.remove(Integer.valueOf(searchElement));
            long arrayListRemoveTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            linkedList.remove(Integer.valueOf(searchElement));
            long linkedListRemoveTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            hashSet.remove(searchElement);
            long hashSetRemoveTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            treeSet.remove(searchElement);
            long treeSetRemoveTime = System.currentTimeMillis() - start;

            // Iteration
            start = System.currentTimeMillis();
            for (int num : arrayList) {
            }
            long arrayListIterateTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            for (int num : linkedList) {
            }
            long linkedListIterateTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            for (int num : hashSet) {
            }
            long hashSetIterateTime = System.currentTimeMillis() - start;

            start = System.currentTimeMillis();
            for (int num : treeSet) {
            }
            long treeSetIterateTime = System.currentTimeMillis() - start;

            // Displaying Results
            System.out.printf("""
                            ArrayList - Add: %d ms, Get: %d ms, Search: %d ms, Remove: %d ms, Iterate: %d ms
                            LinkedList - Add: %d ms, Get: %d ms, Search: %d ms, Remove: %d ms, Iterate: %d ms
                            HashSet - Add: %d ms, Search: %d ms, Remove: %d ms, Iterate: %d ms
                            TreeSet - Add: %d ms, Search: %d ms, Remove: %d ms, Iterate: %d ms
                            """,
                    arrayListAddTime, arrayListGetTime, arrayListSearchTime, arrayListRemoveTime, arrayListIterateTime,
                    linkedListAddTime, linkedListGetTime, linkedListSearchTime, linkedListRemoveTime, linkedListIterateTime,
                    hashSetAddTime, hashSetSearchTime, hashSetRemoveTime, hashSetIterateTime,
                    treeSetAddTime, treeSetSearchTime, treeSetRemoveTime, treeSetIterateTime);
        }
    }
}

