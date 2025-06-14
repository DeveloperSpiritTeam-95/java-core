package com.springboot.collections.advancelevel;

import java.util.*;
import java.util.concurrent.*;
/**
 * @author prabhakar, @Date 16-05-2025
 */


public class MultithreadingBenchmark {
    static final int size = 100_000;

    public static void main(String[] args) throws InterruptedException {
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>();
        ConcurrentHashMap<Integer, Integer> concurrentMap = new ConcurrentHashMap<>();

        // Multithreading Test
        Runnable task1 = () -> { for (int i = 0; i < size; i++) syncList.add(i); };
        Runnable task2 = () -> { for (int i = 0; i < size; i++) cowList.add(i); };
        Runnable task3 = () -> { for (int i = 0; i < size; i++) concurrentMap.put(i, i); };

        ExecutorService executor = Executors.newFixedThreadPool(3);

        long start = System.currentTimeMillis();
        executor.execute(task1);
        long syncListTime = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        executor.execute(task2);
        long cowListTime = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        executor.execute(task3);
        long concurrentMapTime = System.currentTimeMillis() - start;

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("Synchronized List Time: " + syncListTime + " ms");
        System.out.println("CopyOnWriteArrayList Time: " + cowListTime + " ms");
        System.out.println("ConcurrentHashMap Time: " + concurrentMapTime + " ms");
    }
}
