package com.springboot.datastructuresandalgo.basicdsa.array;

public class ArrayAccess {

    /*
        Access Time: O(1)
            Arrays provide constant time (O(1)) access to elements because they are
            stored in contiguous memory locations.

            In contiguous memory allocation:
             It is a process is allocated a single, unbroken block of memory addresses.
            Advantage:
             Simple Addressing: Direct and efficient access to data within the allocated block.
            DisAdvantage:
             External Fragmentation and Memory Wastage

            The memory address of any element can be calculated using the index in O(1) time.

        Formula for Accessing an Element in an Array
            For an array arr stored at base address B, the memory location
            of an element at index i is:

            Address(arr[i]) = B+(i×size of one element)

        Since this calculation is independent of the array size, accessing an element
        via indexing (arr[i]) always takes O(1) time.

    */

    // Time Complexity: O(1) (Direct access without iteration)
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Accessing elements directly using index
        System.out.println("Element at index 2: " + arr[2]);  // O(1) operation
    }
}
