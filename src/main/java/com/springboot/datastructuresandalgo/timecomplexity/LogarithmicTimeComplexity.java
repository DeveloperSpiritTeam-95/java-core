package com.springboot.datastructuresandalgo.timecomplexity;

// O(log n) - Logarithmic Time:
public class LogarithmicTimeComplexity {

    // Typically seen in algorithms like binary search, where the input is reduced by half each time.
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid; // Found target
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(9+" found at: "+binarySearch(arr, 9)+" index in binary search");

    }
}
