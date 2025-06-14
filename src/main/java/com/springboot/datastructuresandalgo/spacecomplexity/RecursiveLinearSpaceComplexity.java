package com.springboot.datastructuresandalgo.spacecomplexity;

// O(n) - Linear Space (Recursive Example):
public class RecursiveLinearSpaceComplexity {

    // Explanation:
    //Space Complexity: O(n) because we use an auxiliary array fib to store the Fibonacci numbers.
    //The space usage is proportional to the size of the input (n).

    // This example uses recursion and an auxiliary array to store values, leading to linear space complexity.

    public static void main(String[] args) {
        int n = 5;

        // Generate the Fibonacci sequence (Recursive approach)
        int[] fib = generateFibonacci(n);

        // Print the Fibonacci sequence
        for (int num : fib) {
            System.out.print(num + " ");
        }
    }

    // Recursive function to generate Fibonacci sequence (O(n) space)
    public static int[] generateFibonacci(int n) {
        int[] fib = new int[n];

        // Base case
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
        }

        // Generate the Fibonacci sequence
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;  // Return the Fibonacci array
    }
}
