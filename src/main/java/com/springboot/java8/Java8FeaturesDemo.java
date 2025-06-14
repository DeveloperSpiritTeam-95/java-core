package com.springboot.java8;


import java.util.concurrent.Callable;

public class Java8FeaturesDemo {

    public static void main(String[] args) {

        // Streams

        // Java 8 --> minimal code, functional programing
        // Java 8 --> lambda expression, Streams, Date & Time API

        // lambda expression
        // lambda expression is an anonymous function (no name, no return type, no access modifier).

        // Functional program demo
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello World inside Thread Runnable implementation.");
            }
        });

        thread.start();


        Thread thread1 = new Thread(() -> System.out.println("Hello From Lambda Expression"));
        thread1.start();

        Thread thread2 = new Thread(() -> {
            System.out.println("Hello From Lambda Expression 2nd type.");
        });
        thread2.start();

        System.out.println("Functional Interface Implementation: ");

        MathOperations sum = (x, y) -> x + y;   // Integer::sum
        MathOperations multiply = (x, y) -> x * y;
        MathOperations divide = (x, y) -> x / y;
        MathOperations subtract = (x, y) -> x - y;
        MathOperations mod = (x, y) -> x % y;

        System.out.println("Sum: " + sum.operation(1,2));
        System.out.println("Multiply: " + multiply.operation(1,2));
        System.out.println("Divide: " + divide.operation(1,2));
        System.out.println("Subtract: " + subtract.operation(1,2));
        System.out.println("Mod: " + mod.operation(1,2));


    }
}


@FunctionalInterface
interface MathOperations {
    int operation(int a, int b);
}

class RunTask implements Runnable {
    public void run() {
        System.out.println("Hello From RunTask");
    }
}


class CallTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hello From CallTask";
    }
}