package com.springboot.datastructuresandalgo.timecomplexity;

// O(2^n) - Exponential Time:
public class ExponentialTimeComplexity {

    // Occurs in algorithms that have exponential growth, such as recursive algorithms
    // solving problems like the Fibonacci sequence.

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Exponential time complexity
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
