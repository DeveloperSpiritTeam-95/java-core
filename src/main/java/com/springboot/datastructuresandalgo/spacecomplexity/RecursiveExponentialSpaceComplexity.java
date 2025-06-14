package com.springboot.datastructuresandalgo.spacecomplexity;

// O(2^n) - Exponential Space (Recursive Example):
public class RecursiveExponentialSpaceComplexity {

    // Explanation:
    //Space Complexity: O(2^n) because the recursion tree grows exponentially. In the worst case,
    // we have to store many recursive calls in the function stack.
    //This space complexity is due to the number of function calls and the depth of recursion.

    // This example demonstrates how space complexity can grow exponentially in a recursive algorithm.

    public static void main(String[] args) {
        int n = 4;

        // Calculate Fibonacci number using recursion
        System.out.println("Fibonacci number at position " + n + ": " + fibonacci(n));
    }

    // Recursive function for Fibonacci (Exponential space complexity)
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursion leads to exponential space
    }
}
