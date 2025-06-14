package com.springboot.datastructuresandalgo.intermediate.sortingsearching;

public class QuickSort {

    /*
        Quick Sort (Divide & Conquer Sorting Algorithm)
            Quick Sort is a highly efficient sorting algorithm.
            It selects a pivot element, partitions the array into two sub-arrays,
            and recursively sorts them.
            Best & Average Time Complexity:
                O(n log n)
            Worst Case Complexity:
                O(n²) (when the pivot is the smallest or largest element in a
                sorted/near-sorted array).
            Space Complexity:
                O(log n) (for recursive function calls).
            
            Time Complexity:
            Best & Average Case: O(n log n) (Balanced partitions).
            Worst Case: O(n²) (If pivot is always the smallest or largest element).
            
            Space Complexity:
            O(log n) (Recursive function calls on the stack).
            
            Not Stable:
            Doesn't maintain the order of duplicate elements.
            
            Used in Practice:
            Faster than Merge Sort for small & medium datasets due to in-place sorting (no extra space).


    */

    // Partition function to place pivot at the correct position
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choosing last element as pivot
        int i = low - 1;  // Pointer for smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {  // Swap if element is smaller than pivot
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);  // Place pivot at the right position
        return i + 1;  // Return pivot index
    }

    // QuickSort function (recursive)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);  // Sort left part
            quickSort(arr, pi + 1, high); // Sort right part
        }
    }

    // Utility function to swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main function to test Quick Sort
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

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
