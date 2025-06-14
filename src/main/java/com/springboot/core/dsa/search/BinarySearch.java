package com.springboot.core.dsa.search;

import java.util.Scanner;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class BinarySearch {

    public static void main(String[] args) {

        int i, first, last, middle, size, search, array[];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements");
        size = input.nextInt();

        array = new int[size];
        System.out.println("Enter " + size + " integers");

        for (i = 0; i < size; i++)
            array[i] = input.nextInt();

        System.out.println("Enter value to find");
        search = input.nextInt();

        first = 0;
        last = size - 1;
        middle = (first + last) / 2;

        while (first <= last) {
            //middle = first + (last - first) / 2;
            if (array[middle] < search) {
                first = middle + 1;
            } else if (array[middle] == search) {
                System.out.println(search + " found at location " + (middle + 1) + ".");
                break;
            } else {
                last = middle - 1;
            }

            middle = (first + last) / 2;
        }
        if (first > last)
            System.out.println(search + " is not present in the list.\n");
    }
}
