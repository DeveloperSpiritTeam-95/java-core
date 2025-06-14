package com.springboot.datastructuresandalgo.timecomplexity;

//    O(1) - Constant Time:
public class ConstantTimeComplexity {

//    Accessing an array element by index takes constant time (O(1)), because the memory address
//    of an element in the array can be computed directly based on the index.
//    The getElement function simply retrieves the value at the specified index, and the time it
//    takes does not depend on the size of the array.

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // The algorithm takes the same time regardless of the size of the input.
        // Accessing an element using its index (constant time operation)
        int index = 2;
        int element = getElement(arr, index);

        System.out.println("Element at index " + index + ": " + element);
    }

    // Method to get the element from the array by index
    public static int getElement(int[] arr, int index) {
        return arr[index];  // O(1) - Constant time
    }
}
