package com.springboot.context;

/**
 * @author prabhakar, @Date 06-03-2025
 */

public class ArrayType {

    // Arrays:
    // An array in Java is a data structure that stores a fixed-size sequential
    // collection of elements of the same type

    public static void main(String[] args) {

        // Declaration
        //An array must be declared with a specific data type.

        int[] numbers; // Recommended style
        // OR
        int number []; // Allowed, but less common, you must declare the size first

        // Creation
        //Arrays are created using the new keyword, and their size is specified.

        numbers = new int[5];
        // Creates an array of size 5

        // Initialization
        //Array elements can be initialized individually or in bulk.

        numbers[0] = 10; // Initialize individual elements
        numbers[1] = 20;
        int[] values = {1, 2, 3, 4, 5}; // Combined declaration, creation, and initialization

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int value : values) {
            System.out.println(value);
        }
        

    }
}
