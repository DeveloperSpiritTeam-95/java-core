package com.springboot.datastructuresandalgo.intermediate.sortingsearching.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author prabhakar, @Date 20-03-2025
 */

public class Subsets {
    /**
     * Generates all possible subsets of the given array using bit manipulation.
     * @param nums The input array of integers.
     * @return A list of lists, where each inner list represents a subset.
     */

    public static List<List<Integer>> generateSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        int n = nums.length;

        // Iterate through all possible bitmasks from 0 to 2^n - 1
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> currentSubset = new ArrayList<>();
            // Check each bit of the bitmask to determine if the corresponding element should be included
            for (int j = 0; j < n; j++) {
                if ((i >> j) % 2 == 1) { // Check if the j-th bit is set
                    currentSubset.add(nums[j]);
                }
            }
            subsets.add(currentSubset);
        }
        return subsets;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = generateSubsets(nums);

        System.out.println("Subsets of " + Arrays.toString(nums) + ":");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }

        int[] nums2 = {0};
        List<List<Integer>> subsets2 = generateSubsets(nums2);

        System.out.println("\nSubsets of " + Arrays.toString(nums2) + ":");
        for (List<Integer> subset : subsets2) {
            System.out.println(subset);
        }

        int[] nums3 = {1, 2, 2};
        List<List<Integer>> subsets3 = generateSubsets(nums3);

        System.out.println("\nSubsets of " + Arrays.toString(nums3) + ":");
        for (List<Integer> subset : subsets3) {
            System.out.println(subset);
        }
    }
}
