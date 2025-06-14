package com.springboot.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        // Consumer --> it will take the input but not given returns

        Consumer<Integer> consumer = (x) -> System.out.println("Consumer: "+x);
        consumer.accept(1);
        consumer.accept(20);

        System.out.println("Consumer List: ");
        List<Integer> list = Arrays.asList(10,20,30,40);

        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };

        printList.accept(list);

        System.out.println("PrintList andThen Method: ");
        printList.andThen(printList).accept(list);

        // Consumer to print a number
        Consumer<Integer> printNumber = number -> System.out.println("Number: " + number);

        // Consumer to multiply a number by 2
        Consumer<Integer> multiplyByTwo = number -> System.out.println("Multiplied: " + number * 2);

        // Use accept() method directly
        // differ is reference
        printNumber.accept(9); // Output: Number: 5

        // Chain consumers using andThen()
        Consumer<Integer> printAndMultiply = printNumber.andThen(multiplyByTwo);

        // Apply the chained consumer to each number in the list
        list.forEach(printAndMultiply);


    }
}
