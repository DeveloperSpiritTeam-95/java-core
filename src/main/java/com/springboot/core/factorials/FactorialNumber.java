package com.springboot.core.factorials;

import java.util.Scanner;

public class FactorialNumber {

    /**
     *The Factorial of a whole number 'n' is defined as the product of that number
     * with every whole number less than or equal to 'n' till 1. For example,
     * the factorial of 4 is 4 × 3 × 2 × 1, which is equal to 24.
     */

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        sc.close();
        System.out.println(n + " factorial is " + fact);

    }
}
