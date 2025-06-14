package com.springboot.datastructuresandalgo.timecomplexity;

//O(n) - Linear Time:
public class LinearTimeComplexity {

    // Occurs when the algorithm processes each element of the input once.

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Linear scan to find maximum
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Max number: " + findMax(arr));
    }
}
