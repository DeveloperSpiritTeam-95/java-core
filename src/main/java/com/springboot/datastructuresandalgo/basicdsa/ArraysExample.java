package com.springboot.datastructuresandalgo.basicdsa;

public class ArraysExample {

    // Fixed size data structure storing elements of the same type.
    // Access time: O(1), Insertion/Deletion: O(n) (shifting required).

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Element at index 2: " + arr[2]);  // O(1)

        // Traversing the array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /*
    Final Complexity Summary
        Operation	            Best Case	    Worst Case	    Why?
        Access (arr[i])	            O(1)	    O(1)	    Direct index lookup
        Insert at end	            O(1)	    O(1)	    No shifting required
        Insert at beginning/middle	O(n)	    O(n)	    Shifting required
        Delete at end	            O(1)	    O(1)	    No shifting required
        Delete at beginning/middle	O(n)	    O(n)	    Shifting required
    */

}
