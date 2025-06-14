package com.springboot.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {

    public static void main(String[] args) {

        //  Intermediate Operations transform a stream into another stream
        // They are Lazy, meaning they don't execute until a terminal operation is invoked.

        System.out.println("Filter: ");
        // 1. filter intermediate operation
        List<String> list = Arrays.asList("Ram","Shyam","Ghyam","Shyam");
        Stream<String> filteredStream = list.stream().filter(s -> s.startsWith("R")).limit(10);
        long count = filteredStream.count();
        System.out.println(count);

        System.out.println("Map: ");
        // 2. map intermediate operation
        Stream<String> mapStream = list.stream().map(x -> x.toUpperCase());
        //Stream<String> mapStream = list.stream().map(String::toUpperCase);
        mapStream.forEach(System.out::println);

        System.out.println("Sorting: ");
        // 3. sorted
        Stream<String> sortedStream = list.stream().sorted();
        sortedStream.forEach(System.out::println);

        System.out.println("Sorting Reverse Order: ");
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a,b) ->a.length() - b.length());
        sortedStreamUsingComparator.forEach(System.out::println);

        // 4. distinct
        long count1 = list.stream().filter(s -> s.startsWith("S")).limit(1).count();
        System.out.println(count1);

        long count2 = list.stream().filter(x -> x.startsWith("S")).distinct().count();
        System.out.println(count2);

        // 5. limit
        Stream.iterate(1, x -> x + 1).limit(5).forEach(System.out::println);

        // 6. skip
        Stream.iterate(1, x -> x + 1).skip(10).limit(50).forEach(System.out::println);

        // 7. peek similar to foreach
        // perform an action on each element as it is consumed.
        // Stream.iterate(1,x -> x + 1).skip(10).limit(50).forEach(System.out::println);
        Stream.iterate(1,x -> x + 1).skip(10).limit(50).peek(System.out::println);


        // 8. flatMap
        // Handle stream of collections, lists, or arrays where each element itself a collection.
        // Flatten nested structures (e.g, lists within lists) so that they can be processed as a single sequence of elements.
        // Transform and flatten elements at the same time.

        List<List<String>> flatMapList = Arrays.asList(
                Arrays.asList("Prabha", "Sudha"),
                Arrays.asList("orange", "banana"),
                Arrays.asList("Information", "Technologies"),
                Arrays.asList("Venu", "Naresh")
        );

        String string = flatMapList.get(1).get(1);
        System.out.println(string);

        List<String> flatMapList1 = flatMapList.stream().flatMap(x -> x.stream()).map(y -> y.toUpperCase()).toList();
        //flatMapList.stream().flatMap(Collection::stream).map(String::toUpperCase).toList();
        System.out.println(flatMapList1);

        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java Streams are useful",
                "flatmap is useful",
                "This is from prabhakar output"
        );

        List<String> sentenceFlatMap = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).map(x -> x.toUpperCase()).toList();
        System.out.println(sentenceFlatMap);


    }
}
