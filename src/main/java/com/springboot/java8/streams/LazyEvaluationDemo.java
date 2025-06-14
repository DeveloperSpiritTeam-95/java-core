package com.springboot.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Anna","Bob","Charlie","David","Prabha","Kumar");

        Stream<String> filtering = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.length() > 3;
                });

        System.out.println("Before terminal operation: " + filtering);

        List<String> result = filtering.toList();
        System.out.println("After terminal operation: " + result);
    }
}
