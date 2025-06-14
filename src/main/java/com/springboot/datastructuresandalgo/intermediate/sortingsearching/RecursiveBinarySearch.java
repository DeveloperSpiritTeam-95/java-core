package com.springboot.datastructuresandalgo.intermediate.sortingsearching;

public class RecursiveBinarySearch {

    /*
        Instead of using a loop, the recursive approach calls itself with a reduced search space.

        Time Complexity: O(log n)
        Space Complexity: O(log n) (due to recursive function calls on the call stack)

    */

    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;  // Base case: Element not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;  // Target found
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target);  // Search right half
        } else {
            return binarySearch(arr, left, mid - 1, target);  // Search left half
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int result = binarySearch(sortedArray, 0, sortedArray.length - 1, target);
        System.out.println("Element found at index: " + result);
    }
}

