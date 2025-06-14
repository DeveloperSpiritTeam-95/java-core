package com.springboot.datastructuresandalgo.intermediate.sortingsearching.practice;

import java.util.Arrays;

public class BinarySearchProblem {

    // Find the first and last occurrence of an element in a sorted array.
    // Input: arr = [5, 7, 7, 8, 8, 10], target = 8
    // Output: [3, 4]

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        // Hint: Use Binary Search twice (one for first occurrence, one for last).
        int[] output = binarySearchFirstOccurrenceAndLastOccurrence(arr, target);
        System.out.println(Arrays.toString(output));
    }

   private static int[] binarySearchFirstOccurrenceAndLastOccurrence(int[] arr, int target) {
       int left = 0, right = arr.length - 1;
       int[] result = {-1, -1}; // To store the first and last occurrences

       // Find the first occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //int mid = (left + right) / 2;
            if (arr[mid] == target) {
                result[0] = mid; // Found the first occurrence, store it in result[0]
                right = mid - 1; // Continue searching in the left half for earlier occurrences
            }
            if (arr[mid] < target) {
                left = mid + 1;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        //return new int[]{-1, -1};
       // If target is not found, return [-1, -1]
       if (result[0] == -1) return result;

       // Find the last occurrence
       left = result[0]; // Start from the first occurrence
       right = arr.length - 1;
       while (left <= right) {
           int mid = left + (right - left) / 2;
           if (arr[mid] == target) {
               result[1] = mid; // Found the last occurrence, store it in result[1]
               left = mid + 1; // Continue searching in the right half for later occurrences
           }else if (arr[mid] < target) {
               left = mid + 1;
           }else {
               right = mid - 1;
           }
       }

       return result;
   }

}
