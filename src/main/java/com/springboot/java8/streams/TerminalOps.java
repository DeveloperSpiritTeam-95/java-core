package com.springboot.java8.streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // 1. collect
        List<Integer> collect = list.stream().skip(1).collect(Collectors.toList());
        //list.stream().skip(1).toList();
        System.out.println(collect);

        // 2. forEach
        list.forEach(x -> System.out.println(x));
        //list.forEach(System.out::println);


        // 3. reduce: Combines elements to produce a single result
        list.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);

        Optional<Integer> sum = list.stream().reduce(Integer::sum);
        System.out.println(sum.get());

        // 4. count
        long count = list.stream().count();
        System.out.println(count);

        long count1 = list.stream().filter(x -> x % 2 == 0).count();
        System.out.println(count1);

        // 5. anyMatch, allMatch, noneMatch

        boolean anyMatch = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(anyMatch);
        boolean allMatch = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(allMatch);
        boolean noneMatch = list.stream().noneMatch(x -> x > 0);
        System.out.println(noneMatch);

        anyMatch = list.stream().anyMatch(x -> x % 2 != 0);
        System.out.println(anyMatch);
        allMatch = list.stream().allMatch(x -> x > 0);
        System.out.println(allMatch);
        noneMatch = list.stream().noneMatch(x -> x < 0);
        System.out.println(noneMatch);

        // 6. findFirst, findAny
        list.stream().findFirst().ifPresent(System.out::println);
        Integer findFirst = list.stream().skip(3).findFirst().get();
        System.out.println(findFirst);

        list.stream().findAny().ifPresent(System.out::println);
        Integer findAny = list.stream().skip(2).findAny().get();
        System.out.println(findAny);

        // 7. toArray
        Object[] array = Stream.of(1, 2, 3).toArray();
        System.out.println(Arrays.toString(array));

        // 8. min, max
        Integer max = Stream.of(1, 2, 3, 4, 5, 6).max(Integer::compare).get();
        System.out.println("max: "+max);
        Optional<Integer> max1 = Stream.of(1, 2, 3, 4, 5, 6).max(Comparator.naturalOrder());
        System.out.println("max: "+max1.get());
        Optional<Integer> max2 = Stream.of(1, 2, 3, 4, 5, 6).max(Integer::compareTo);
        System.out.println("max: "+max2.get());
        Optional<Integer> max3 = Stream.of(1, 2, 3, 4, 5, 6).max((o1, o2) -> o1 - o2);
        System.out.println("max: "+max3.get());

        Integer min = Stream.of(1, 2, 3, 4, 5, 6).min(Integer::compare).get();
        System.out.println("min: "+min);

        Optional<Integer> min1 = Stream.of(1, 2, 3, 4, 5, 6).min(Comparator.naturalOrder());
        System.out.println("min: "+min1.get());

        Optional<Integer> min2 = Stream.of(1, 2, 3, 4, 5, 6).max((o1, o2) -> o2 - o1);
        System.out.println("min: "+min2.get());

        Optional<Integer> min3 = Stream.of(1, 2, 3, 4, 5, 6).min(Integer::compareTo);
        System.out.println("min: "+min3.get());

        // 9. forEachOrdered
        // multithreaded environment using parallel stream involves multiple threads
        List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Using ForEach with parallel stream: ");
        numbers.stream().parallel().forEach(System.out::println);

        System.out.println("Using ForEach with parallel stream: ");
        numbers.parallelStream().forEach(System.out::println);

        // Example: Filtering and Collecting Names

        List<String> names = Arrays.asList("Anna","Bob","Charlie","David","Prabha","Kumar");

        names.stream().filter(x -> x.length() > 3).forEach(System.out::println);
        //List<String> stringList = names.stream().filter(name -> name.length() > 3).toList();
        //System.out.println(stringList);

        // Example: Squaring and sorting numbers

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> integerList = integers.stream().map(x -> x * 2).sorted().toList();
        System.out.println(integerList);

        // Example: Sum values
        Optional<Integer> sumIntegers = integers.stream().reduce((x, y) -> x + y);
        System.out.println(sumIntegers.get());


        // Example: Counting occurrences of a character
        String sentence = "Hello world";
        long count2 = sentence.chars().filter(x -> x == 'l').count();
        System.out.println("l occurrence: "+count2);

        // Example
        // Streams con not be reused after a terminal operations has been called.

        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        // IllegalStateException ==> Stream has already been linked or consumed
        List<String> flatmap = stream.map(String::toUpperCase).toList();       // Exception


        // stateful and stateless operations
        // sorted, distinct, count all are perform stateful operations (complete state must)
        // map, filter, lambda expressions all are perform stateless operations(element at the time of operation)



    }
}
