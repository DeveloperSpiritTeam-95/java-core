package com.springboot.core.advance;

import java.util.Random;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class RandomNumbers {

    static Random random = new Random();
    public static void main(String[] args) {



        for (int i=1; i<=6; i++)
            System.out.print(random.nextInt(10));

        System.out.println();
        System.out.println(generateOTP());
        System.out.println(generateOTP1());
        System.out.println(generateOTP2());
    }

    private static int generateOTP() {
        // Method 1: Using Random class
        Random random = new Random();
        // Generates number between 100000 and 999999
        return 100000 + random.nextInt(900000);
    }

    private static int generateOTP1() {
        // Method 2: Using Math.random()
        return (int) ((Math.random() * 900000) + 100000);
    }

    private static int generateOTP2() {
        // Method 3: Using StringBuilder and a loop
         StringBuilder otp = new StringBuilder();
         for (int i = 0; i < 6; i++) {
             otp.append(random.nextInt(10)); // Generates one digit at a time
         }
         return Integer.parseInt(otp.toString());
    }

}
