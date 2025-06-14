package com.springboot.datastructuresandalgo.spacecomplexity;

import java.util.Arrays;

public class SpaceComplexity {

    // Space complexity refers to the amount of memory the algorithm
    // uses relative to the size of the input.

    // O(1): Constant space (no extra space needed).
    // O(n): Linear space (extra space grows with the input size).

    public static int exampleFunction(int[] arr) {
        int sum = 0;  // O(1) space for sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // O(1) space for sum
        }
        return sum;
    }

    public static int[] createArray(int size) {
        int[] newArr = new int[size];  // O(n) space for the array
        return newArr;
    }

    // Key Takeaways:
    //      Time Complexity describes how the runtime grows with the input size.
    //      Space Complexity describes how memory usage grows with the input size.
    //      Use Big O Notation to evaluate and optimize algorithms.
    public static void main(String[] args) {
        int[] arr = createArray(10);
        System.out.println(exampleFunction(arr));

    }

    /*
        Summary of Space Complexity:
            O(1): Constant space usage, no extra space based on input size.
            O(n): Linear space usage, the space grows linearly with the input size.
            O(n^2): Quadratic space usage, typically when working with 2D arrays or matrices.
            O(2^n): Exponential space usage, common with recursive problems with overlapping
                    subproblems (e.g., Fibonacci).

    */
}
