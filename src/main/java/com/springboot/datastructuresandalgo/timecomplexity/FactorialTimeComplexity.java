package com.springboot.datastructuresandalgo.timecomplexity;

// O(n!) - Factorial Time:
public class FactorialTimeComplexity {

    // Occurs in algorithms that generate all permutations of a set
    // (like the Traveling Salesman Problem).
    public static void printPermutations(String str) {
        printPermutationsHelper(str, "");
    }

    private static void printPermutationsHelper(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix); // Print permutation
        } else {
            for (int i = 0; i < str.length(); i++) {
                printPermutationsHelper(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        printPermutations("hi");
        //printPermutations("perrry");
    }
}
