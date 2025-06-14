package com.springboot.datastructuresandalgo.intermediate.sortingsearching;

public class BinarySearch {

    /*
         Time Complexity: O(log n)
         Space Complexity: O(1) (Iterative approach)

         Binary Search (O(log n))
            Used on sorted arrays to find an element efficiently.
            Divides the search space in half at each step.
            Faster than linear search (O(n)) for large datasets.
    */

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;  // Target found
            else if (arr[mid] < target)
                left = mid + 1;  // Search right half
            else
                right = mid - 1;  // Search left half
        }
        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int result = binarySearch(sortedArray, target);
        System.out.println("Element found at index: " + result);
    }
}

