package com.springboot.java8;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        // Supplier --> it doesn't take input, but return something.

        Supplier<String> giveHelloWorld = () -> "Hello World";
        // Supplier<String> giveHelloWorld = () -> "";
        // Supplier<String> giveHelloWorld = () -> null;

        System.out.println(giveHelloWorld.get());

        String theData = getTheData(giveHelloWorld);
        System.out.println(theData);


    }

    public static String getTheData(Supplier<String> input) {
        if (input.get() == null || input.get().isEmpty()) {
            return "Database Connection Error";
        }
        return "Database connection established";
    }
}
