package com.springboot.core.dsa.search;

/**
 * @author prabhakar, @Date 25-03-2025
 */

public class SearchInRotatedArray {

    /**
     * Given a sorted and rotated array A of N district elements which is rotated at
     * some point, and given an element key. The Task is to find the index of the given
     * in the array A.
    */


    public static void main(String[] args) {
        System.out.println(search(new int[] {5,6,7,8,9,10,1,2,3},0,8,10));
    }

    private static int search(int[] arr, int l, int r, int key) {
        int pivot = getPivot(arr,l,r);
        int e = bs(arr,l,pivot,key);
        if (e == -1)
            e = bs(arr, pivot + 1, r, key);
        return e;
    }

    private static int getPivot(int[] arr, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] > arr[l]) {
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return -1;
    }

    private static int bs(int[] arr, int l, int r, int x) {
        while (l <= r){
            int mid = (l+r)/2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
}
