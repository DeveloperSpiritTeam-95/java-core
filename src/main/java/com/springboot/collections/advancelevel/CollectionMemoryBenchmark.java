package com.springboot.collections.advancelevel;

import java.util.*;
/**
 * @author prabhakar, @Date 16-05-2025
 */

public class CollectionMemoryBenchmark {
    public static void main(String[] args) {
        int size = 1_000_000;
        Runtime runtime = Runtime.getRuntime();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Random rand = new Random();

        runtime.gc(); // Clear garbage collector before measurement
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        for (int i = 0; i < size; i++) arrayList.add(rand.nextInt(size));
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("ArrayList Memory Usage: " + (memoryAfter - memoryBefore) + " bytes");

        runtime.gc();
        memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        for (int i = 0; i < size; i++) linkedList.add(rand.nextInt(size));
        memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("LinkedList Memory Usage: " + (memoryAfter - memoryBefore) + " bytes");

        runtime.gc();
        memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        for (int i = 0; i < size; i++) hashSet.add(rand.nextInt(size));
        memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("HashSet Memory Usage: " + (memoryAfter - memoryBefore) + " bytes");

        runtime.gc();
        memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        for (int i = 0; i < size; i++) treeSet.add(rand.nextInt(size));
        memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("TreeSet Memory Usage: " + (memoryAfter - memoryBefore) + " bytes");

        runtime.gc();
        memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        for (int i = 0; i < size; i++) linkedHashSet.add(rand.nextInt(size));
        memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("LinkedHashSet Memory Usage: " + (memoryAfter - memoryBefore) + " bytes");
    }
}
