package com.springboot.datastructuresandalgo.intermediate.sortingsearching.practice;

public class SquareRootBinarySearch {

    // Find the square root of a number using Binary Search.
    // Input: x = 16
    // Output: 4

    public static int sqrt(int x) {
        if (x == 0 || x == 1) {
            return x; // Handle edge cases for 0 and 1
        }

        int left = 0, right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid;  // Use long to avoid overflow

            if (midSquared == x) {
                return mid;  // Exact square root found
            } else if (midSquared < x) {
                left = mid + 1;  // Search on the right half
                result = mid;    // Keep track of the best result so far
            } else {
                right = mid - 1; // Search on the left half
            }
        }

        return result;  // Return the integer part of the square root
    }

    public static void main(String[] args) {
        // Hint: Search in range [0, x] for the closest integer square root
        int x = 16;
        System.out.println("Square root of " + x + " is: " + sqrt(x));
    }
}

