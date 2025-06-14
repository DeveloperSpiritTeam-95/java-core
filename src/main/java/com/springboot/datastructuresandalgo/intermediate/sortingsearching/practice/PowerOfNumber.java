package com.springboot.datastructuresandalgo.intermediate.sortingsearching.practice;

/**
 * @author prabhakar, @Date 20-03-2025
 */

public class PowerOfNumber {

    /**
     * Calculates x raised to the power of n (x^n) using recursion.
     * @param x The base number.
     * @param n The exponent (non-negative integer).
     * @return The result of x^n.
     * @throws IllegalArgumentException if n is negative.
     */

    // Power of a Number: Implement a function to calculate x power of n using recursion.
    public static double power(double x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Exponent n must be non-negative");
        }
        if (n == 0) {
            // Any non-zero number raised to the power of 0 equals 1
            // because of the division rule of exponents
            return 1; // Base case: x^0 = 1
        } else if (n % 2 == 0) {
            // If n is even, use the property: x^n = (x^(n/2))^2 this is the actual formula
            double temp = power(x, n / 2);
            return temp * temp;
        } else {
            // If n is odd, use the property: x^n = x * x^(n-1) this is the actual formula
            return x * power(x, n - 1);
        }
    }

    /**
    * Explanation:
     * Base Case:
     * If n is 0, the function returns 1 because any number raised to the power of 0 is 1. This is crucial for stopping the recursion.
     * Recursive Step (Even Exponent):
     * If n is even, the function calculates the power of x raised to n/2 and then squares the result. This uses the property x power n = (x power n/2)power 2. This approach optimizes the number of recursive calls.
     * Recursive Step (Odd Exponent):
     * If n is odd, the function calculates x times the power of x raised to n-1. This uses the property x power n = x * x power n-1.
     * Error Handling:
     * The function throws an IllegalArgumentException if n is negative, as the power function is not defined for negative exponents in this implementation (we're focusing on integer exponents).
    */

    public static void main(String[] args) {
        double x = 2;
        int n = 10;
        double result = power(x, n);
        System.out.println(x + "^" + n + " = " + result); // Output: 2.0^10 = 1024.0
        //System.out.println((x*x*x*x*x*x*x*x*x*x));

        x = 3;
        n = 4;
        result = power(x, n);
        System.out.println(x + "^" + n + " = " + result); // Output: 3.0^4 = 81.0
        //System.out.println((x*x*x*x));

        x = 5;
        n = 0;
        result = power(x, n);
        System.out.println(x + "^" + n + " = " + result); // Output: 5.0^0 = 1.0

        x = 3;
        n = 3;
        result = power(x, n);
        System.out.println(x + "^" + n + " = " + result);

        try {
            x = 2;
            n = -2;
            result = power(x, n); // This will throw an exception
            System.out.println(x + "^" + n + " = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage()); // Output: Exception: Exponent n must be non-negative
        }

    }
}
