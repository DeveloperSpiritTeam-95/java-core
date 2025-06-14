package com.springboot.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {

        // It is a type of stream that enables parallel processing of elements.
        // Allowing multiple threads to process parts of the stream simultaneously
        // This is significantly improves performance for large data sets
        // Workload is distributed across the multiple threads

        // normal stream
        long start = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorials = list.stream().map(ParallelStream::factorial).toList();
        //System.out.println(factorials);
        long end = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream: " + (end - start)+" ms");

        // parallel stream
        start = System.currentTimeMillis();
        //factorials = list.parallelStream().map(ParallelStream::factorial).sequential().toList();
        factorials = list.parallelStream().map(ParallelStream::factorial).toList();
        end = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: " + (end - start)+" ms");

        // parallel streams are most effective for CPU-intensive or large datasets where taken are
        // independent. They may add overhead for simple tasks or small datasets.

        //Cumulative Sum
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum = new AtomicInteger(0);       // thread safe
        List<Integer> cumulativeSum = numbers.stream().map(sum::addAndGet).toList();
        //List<Integer> cumulativeSum = numbers.parallelStream().map(sum::addAndGet).toList();
        // in parallel stream multiple threads perform so it's not independent
        System.out.println("Expected cumulative sum: [1, 3, 6, 10, 15]");
        System.out.println("Actual result with parallel stream: "+cumulativeSum);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
