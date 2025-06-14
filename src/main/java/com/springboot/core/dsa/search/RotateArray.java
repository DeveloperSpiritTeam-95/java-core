package com.springboot.core.dsa.search;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author prabhakar, @Date 25-03-2025
 */

public class RotateArray {

    private static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static void leftRotate(int[] arr, int n, int d) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void rightRotate(int[] arr, int n, int d) {
        reverse(arr, 0, n - 1);
        reverse(arr, n - 1, d);
        reverse(arr, n, d - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotate(arr, 5, 2);
        System.out.println(Arrays.toString(arr));

        rightRotate(arr, 5, 2);
        System.out.println(Arrays.toString(arr));

        leftRotate(arr, 2, 1);
        System.out.println(Arrays.toString(arr));
    }
}
