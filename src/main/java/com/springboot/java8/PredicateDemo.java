package com.springboot.java8;

import java.util.function.Predicate;

public class PredicateDemo {

    // Predicate is a conditional functional implementation

    public static void main(String[] args) {

        // Predicate  --> Functional Interface ( Boolean valued function)
        // It will check the condition and returns the boolean value

        System.out.println("Predicate function implementation: ");

        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isOdd = x -> x % 2 == 1;
        System.out.println("12 isEven: " + isEven.test(12));
        System.out.println("12 isOdd: " + isOdd.test(12));


        Predicate<String> isWordStartsWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordStartsWithB = x -> x.toLowerCase().startsWith("b");
        Predicate<String> isWordEndsWithH = x -> x.toLowerCase().endsWith("h");

        Predicate<String> isStartsWithAEndsWithH = isWordStartsWithA.and(isWordEndsWithH);
        Predicate<String> isStartsWithBEndsWithH = isWordStartsWithB.and(isWordEndsWithH);

        System.out.println("isWordStartsWithA: " + isWordStartsWithA.test("amarnatha"));
        System.out.println("isWordStartsWithB: " + isWordStartsWithB.test("badrinath"));
        System.out.println("isWordEndsWithH: " + isWordEndsWithH.test("badrinath"));

        System.out.println("isStartsWithAEndsWithH: " + isStartsWithAEndsWithH.test("amarnatha"));
        System.out.println("isStartsWithBEndsWithH: " + isStartsWithBEndsWithH.test("badrinath"));


    }
}
