package com.springboot.core.largest_smallest;

/**
 * @author prabhakar, @Date 26-07-2024
 */
public class SecondLargestNum {
    public static void main(String[] args) {

        //int[] numbers = {10, 10, 10, 10, 10, 10};
        int[] numbers = {10, 5, 20, 8, 12, 15};

        // Call the method to find the second-largest number
        int secondLargest = findSecondLargest(numbers);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("There is no second largest number. you given: "+numbers[0]);
        }

    }

    public static int findSecondLargest(int ...nums){ // varargs method
        if (nums == null || nums.length < 2) {
            return Integer.MIN_VALUE; // Indicating no second-largest number
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
