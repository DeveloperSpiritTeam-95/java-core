package com.springboot.datastructuresandalgo.timecomplexity;

import java.util.Arrays;

// O(n log n) - Log-Linear Time:
public class LogLinearTimeComplexity {

    // O(n log n) - Log-Linear Time:
    // Seen in efficient sorting algorithms like Merge Sort or Quick Sort.
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);  // Recursively sort left half
        mergeSort(right); // Recursively sort right half

        merge(arr, left, right); // Merge the sorted halves
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {

        int[] arr = {4,8,3,0,2,7,14,26,1,6};
        mergeSort(arr);
    }
}
