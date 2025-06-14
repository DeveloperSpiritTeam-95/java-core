package com.springboot.datastructuresandalgo.intermediate.sortingsearching.practice;

public class PeakElement {

    // Find the peak element in an unsorted array.
    // Input: arr = [1, 2, 3, 1]
    // Output: 3 (Index: 2)


    public static String findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if mid is the peak element
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
                return arr[mid] + " (Index: " + mid + ")";  // Found the peak element and index
            }
            // If the left neighbor is greater, search the left half
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }
            // If the right neighbor is greater, search the right half
            else {
                left = mid + 1;
            }
        }

        return "-1 (Index: -1)";  // This line will never be reached as we will always find a peak
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        // Output: 3 (Index: 2)
        //Hint: A peak is an element that is greater than its neighbors.
        String peak = findPeakElement(arr);
        System.out.println("Peak Element: " + peak);  // Output should be 3
    }
}
