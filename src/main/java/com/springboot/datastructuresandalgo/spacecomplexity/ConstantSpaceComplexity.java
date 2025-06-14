package com.springboot.datastructuresandalgo.spacecomplexity;

// O(1) - Constant Space:
public class ConstantSpaceComplexity {

    // Explanation:
    //Space Complexity: O(1) because we only use a constant amount of space for the sum
    // variable, regardless of the input size.
    //No new data structures are created, and the space usage does not depend on the array's size.

    // In this example, no extra space is used that grows with the input size.
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Calculate the sum of the array elements
        int sum = calculateSum(arr);
        System.out.println("Sum of array elements: " + sum);
    }

    // Function to calculate sum (constant space)
    public static int calculateSum(int[] arr) {
        int sum = 0; // Constant space for the sum variable
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // No additional space is used for the array
        }
        return sum;
    }


}
