package com.springboot.datastructuresandalgo.intermediate.sortingsearching;

public class MergeSort {

    /*
        Merge Sort (Divide & Conquer Sorting Algorithm)

        Merge Sort is a stable sorting algorithm that follows the divide & conquer approach.

        It recursively splits the array into smaller sub-arrays,
        sorts them, and then merges them back together.

        Time Complexity: O(n log n) in all cases (best, worst, average).
        Space Complexity: O(n) (due to extra space used for merging).

        Time Complexity:
            O(n log n) in best, worst, and average cases (since the array is always split in half).
        Space Complexity:
            O(n) (Extra space required for merging).
        Stable Sort:
            Maintains the order of duplicate elements (important in sorting objects).
    */

    // Merge function to combine two sorted sub arrays
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArray[j] = arr[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) arr[k++] = leftArray[i++];
        while (j < n2) arr[k++] = rightArray[j++];
    }

    // Merge Sort function (recursive)
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort the two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Main function to test Merge Sort
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    // Utility function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
