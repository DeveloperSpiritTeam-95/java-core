package com.springboot.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        // Collectors is a utility class
        // provides a set of methods to create common collectors

        // 1. Collecting to a List
        List<String> fruits = Arrays.asList("banana","orange","apple","kiwi","fruit");
        List<String> filterFruit = fruits.stream().map(x -> x.toUpperCase()).toList();
        List<String> result = fruits.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());

        System.out.println(filterFruit);

        System.out.println(fruits);
        System.out.println(result);

        // 2. Collecting to a Set
        List<Integer> numbers = Arrays.asList(1,2,2,3,3,4,4,5);
        Set<Integer> set = numbers.stream().collect(Collectors.toSet());
        Integer sum = numbers.stream().collect(Collectors.summingInt(x -> x));
        System.out.println(sum);
        System.out.println(set);

        // 3. Collecting to a specific collection
        ArrayDeque<String> collect = fruits.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println(collect);

        // 4. Joining Strings
        String joining = fruits.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println(joining);

        // 5. Summarizing Data
        // Generates statistical summary (count, sum,  min, max, average)

        IntSummaryStatistics summary = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(summary);

        // 6. Calculating Averages
        Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(average);

        // 7. Counting Elements
        Long counting = numbers.stream().collect(Collectors.counting());
        System.out.println(counting);

        // 8. Grouping Elements
        List<String> words = Arrays.asList("java","hello","world","streams","collection");
        Map<Integer, List<String>> collected = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collected);

        Map<Integer, String> collect1 = words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", ")));
        System.out.println(collect1);

        Map<Integer, Long> collect2 = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(collect2);

        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        // 9. Partitioning Elements
        // partitions elements into two groups (true and false) based on a predicate
        Map<Boolean, List<String>> partitions = words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));
        System.out.println(partitions);

        // 10. Mapping and Collecting
        // Applies a mapping function before collecting

        List<String> list = words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList()));
        System.out.println(list);

        // Example 1: Collecting Names by length
        List<String> names = Arrays.asList("Anna","Bob","Alexander","Brain","Alice");
        Map<Integer, List<String>> lengthMaps = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(lengthMaps);

        // Example 2: Counting Word Occurrence
        String sentence = "hello world hello java world";
        Map<String, Long> sentenceMap = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(sentenceMap);

        // Example 3: Partitioning Even and Odd Numbers
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        Map<Boolean, List<Integer>> evenAndOdd = list1.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(evenAndOdd);

        // Example 4: Summing values in a Map

        Map<String, Integer> items = new HashMap<>();

        items.put("Apple",10);
        items.put("Orange",20);
        items.put("Kiwi",30);
        items.put("Banana",40);
        items.put("Watermelon",50);

        items.values().stream().reduce(Integer::sum).ifPresent(System.out::println);

        Integer summingInt = items.values().stream().collect(Collectors.summingInt(x -> x));
        //Integer summingInt = items.values().stream().mapToInt(x -> x).sum();
        System.out.println(summingInt);

        // Example 5: Creating a Map from Stream Elements
        List<String> fruits1 = Arrays.asList("apple","orange","banana");
        Map<String, Integer> stringIntegerMap = fruits1.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length()));
        System.out.println(stringIntegerMap);

        // Example 6:

        List<String> fruits2 = Arrays.asList("apple","orange","banana","apple","orange","banana","cherry","watermelon");
        Map<String, Integer> wordOccurrence = fruits2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));
        System.out.println(wordOccurrence);


    }
}
