package com.springboot.core.basic;

/**
 * @author prabhakar, @Date 02-04-2025
 */

public class DailyDouble {

    public static void main(String[] args) {
        long value = 1;
        int days = 31;
        long sum;
        System.out.println("Day 1: " + value);
        sum = value;

        for (int i = 2; i <= days; i++) {
            value *= 2;
            System.out.println("Day " + i + ": " + value);
            sum += value;
        }

        System.out.println("Sum: " + sum);

    }
}
