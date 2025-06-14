package com.springboot.datastructuresandalgo.basicdsa.array;

import java.util.Arrays;

public class ArrayInsertion {

    /*
        While accessing an element is O(1), insertion and deletion at arbitrary positions
        in an array require O(n) time complexity because of shifting elements.

        Insertion Complexity in Detail

        If inserting at the end: O(1) (No shifting needed)
        If inserting at the beginning or middle: O(n) (Shifting elements right)

        Insert at the Beginning (O(n))

        Shifting all elements right by one position takes O(n) time.
        The actual insertion (arr[0] = 5) is O(1), but the shifting dominates.
    */

    public static void main(String[] args) {
        int[] arr = new int[6]; // New array with extra space
        int[] original = {10, 20, 30, 40, 50};

        // Copy original elements into new array
        System.arraycopy(original, 0, arr, 1, original.length);

        // Insert new element at the beginning
        arr[0] = 5;

        System.out.println("After Insertion: " + Arrays.toString(arr));
    }
}
