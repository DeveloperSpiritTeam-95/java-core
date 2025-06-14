package com.springboot.java8;

import java.util.function.*;

public class CombinedExample {

    public static void main(String[] args) {

        // Combined Example

        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(2));

        Function<Integer, Integer> function = i -> i * i;
        System.out.println(function.apply(2));

        Consumer<Integer> consumer = System.out::println;
        consumer.accept(2);

        Supplier<Integer> supplier = () -> 100;
        System.out.println(supplier.get());

        if (predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        // BiPredicate, BiConsumer and BiFunction
        System.out.println("BiPredicate, BiConsumer and BiFunction");

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x+y) % 2 == 0;
        System.out.println(isSumEven.test(2, 3));
        System.out.println(isSumEven.test(2, 4));

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept(2, 3);
        biConsumer.accept(2, 4);

        BiFunction<String, String,Integer> biFunction = (x, y) -> (x+y).length();

        // replace on BiFunction interface
        //BinaryOperator<Integer> binaryOperator = (x, y) -> (x+y);

        System.out.println(biFunction.apply("abc", "def"));

    }
}
