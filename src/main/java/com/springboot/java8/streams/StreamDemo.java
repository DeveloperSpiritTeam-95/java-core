package com.springboot.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        // feature introduced in java 8
        // process collections of data in a functional and declarative manner
        // Simplify Data Processing
        // Functional programming
        // Improve Readability and Maintainability
        // Enable easy Parallelism  (for dealing Multithreading)

        // What is stream ?
        // a sequence of elements supporting functional and declarative programming
        // A sequence of elements supporting sequential and parallel aggregate operations.
        // The following example illustrates an aggregate operation using Stream

        // How to use Streams ?
        // Source, intermediate operations and terminal operation

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        // the number, or values are source
        // convert to streams

        // find how many even numbers in this sequential numbers
        System.out.println("Traditional Way: ");
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even numbers: "+count);

        System.out.println("Using Stream: ");
        // Source is numbers, use stream to perform, filter is intermediate operation, count is terminal operation.

        long count1 = numbers.stream().filter(number -> number % 2 == 0).count();
        System.out.println("Even numbers: "+count1);

        // Creating Streams
        // 1. From Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();

        // 2. From Arrays
        String[] array = {"a","b","c","d","e"};
        Stream<String> stream1 = Arrays.stream(array);

        // 3. Using Stream.of()
        Stream<String> stream2 = Stream.of("a", "b", "c", "d", "e");

        // 4. Infinite Streams
        Stream<Integer> generate = Stream.generate(() -> 1); //.limit(100);     // limit break the infinite
        Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());


    }
}
