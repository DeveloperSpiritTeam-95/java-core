package com.springboot.java8;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionDemo {

    public static void main(String[] args) {

        // Function  --> works for you,
        // It will work for your input returns to you as of your expectations on your logic

        Function<Integer, Integer> doubleIt = x -> x * 2;
        // replace on Function interface
        // Function<Integer, Integer> tripleIt = x -> x * 3;
        UnaryOperator<Integer> tripleIt = x -> x * 3;

        System.out.println("apply Method: double value "+doubleIt.apply(2));
        System.out.println("apply Method: triple value "+tripleIt.apply(2));

        // primarily first function then second one ==> andThen
        System.out.println("andThen Method: "+doubleIt.andThen(tripleIt).apply(20));
        // primarily second one then first one      ==> compose
        System.out.println("compose Method: "+doubleIt.compose(tripleIt).apply(20));

        // identity it will just return what we have given
        Function<Integer, Integer> identity = Function.identity();
        Integer result = identity.apply(99);
        System.out.println("Identity: "+result);

        // something on productive way
        Function<String, String> getWordAfterSpace = (x) -> {
            if (x.split(" ").length > 1) {
                return x.split(" ")[1];
            }
            return x;
        };

        System.out.println(getWordAfterSpace.apply("Kalyan Jewelers"));

    }
}
