package com.springboot.core.patterns;

/**
 * @author prabhakar, @Date 27-03-2025
 */

public class IntermediatePatterns {

    public static void main(String[] args) {
        System.out.println("Hallow Square Pattern");
        hollowSquarePattern();
        System.out.println("==============");
        System.out.println("Diamond Pattern");
        diamondPattern();
        System.out.println("==============");
        System.out.println("Diamond Pattern 2");
        diamondPattern2();
        System.out.println("==============");
        System.out.println("Pascals Triangle Pattern");
        pascalsTriangle();
        System.out.println("==============");
        System.out.println("Increasing Triangle Pattern");
        increasingTriangleWithNumbers();
        System.out.println("==============");
        System.out.println("Decreasing Triangle Pattern");
        decreasingTriangleWithNumbers();
        System.out.println("==============");
        System.out.println("Triangle With Numbers Pattern");
        triangleWithNumbers();
        System.out.println("==============");

    }

    private static void hollowSquarePattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print(" * ");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void diamondPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = 4; i >= 1; i--) {
            for (int j = 5 - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void diamondPattern2() {
        int rows = 5;
        for (int i = -rows + 1; i < rows; i++) {
            int stars = 2 * (rows - Math.abs(i)) - 1;
            int spaces = (2 * rows - 1 - stars) / 2;
            System.out.print(" ".repeat(spaces) + "*".repeat(stars) + "\n");
        }
    }

    private static void pascalsTriangle() {

        //        1
        //       1 1
        //      1 2 1
        //     1 3 3 1
        //    1 4 6 4 1
        //   1 5 10 10 5 1

        int rows = 6; // Number of rows in Pascal's Triangle

        // Outer loop for the number of rows
        for (int i = 0; i < rows; i++) {

            // Inner loop for printing spaces before the numbers
            for (int j = rows - i - 1; j > 0; j--) { // Adjusted space calculation
                System.out.print("  ");
            }

            // Inner loop for printing numbers in each row
            int number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.printf("%4d", number); // Use printf for formatting
                number = number * (i - k) / (k + 1); // Calculate the next number
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }

    private static void increasingTriangleWithNumbers() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void decreasingTriangleWithNumbers(){
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void triangleWithNumbers() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }


}
