package com.springboot.datastructuresandalgo.spacecomplexity;

// O(n) - Linear Space:
public class LinearSpaceComplexity {

    // Explanation:
    //Space Complexity: O(n) because we are creating a new array (copyArr)
    // of the same size as the input array (arr).
    //The space used is proportional to the input array size.

    // This example uses additional space proportional to the input size.
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Create a new array with the same elements
        int[] copyArr = createCopy(arr);

        // Print copied array
        for (int num : copyArr) {
            System.out.print(num + " ");
        }
    }

    // Function to create a copy of the array (O(n) space)
    public static int[] createCopy(int[] arr) {
        int[] copyArr = new int[arr.length];  // Linear space for the new array
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];  // Copy elements to new array
        }
        return copyArr;
    }


}
