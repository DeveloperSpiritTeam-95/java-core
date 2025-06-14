package com.springboot.datastructuresandalgo.basicdsa.array;

import java.util.Arrays;

public class ArrayDeletion {

    /*
        While accessing an element is O(1), insertion and deletion at arbitrary positions
        in an array require O(n) time complexity because of shifting elements.

        Deletion Complexity in Detail

        Deleting an element at the end: O(1) (No shifting required)
        Deleting an element at the beginning/middle: O(n) (Shifting elements left)

        Delete from the Middle (O(n))

        Shifting elements left takes O(n).
        Actual deletion is O(1), but shifting dominates.
     */

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int deleteIndex = 2; // Deleting element at index 2 (30)

        System.out.println(Arrays.toString(arr));
        // Shift elements left
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Resize array by creating a new one (Java does not support dynamic shrinking)
        arr = Arrays.copyOf(arr, arr.length - 1);

        System.out.println("After Deletion: " + Arrays.toString(arr));
    }
}
