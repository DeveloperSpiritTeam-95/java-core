package com.springboot.datastructuresandalgo.timecomplexity;

// O(n^2) - Quadratic Time:
public class QuadraticTimeComplexity {

    // Occurs with algorithms that use nested loops.
    public static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]); // Nested loop results in O(n^2)
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        printPairs(arr);
    }
}
