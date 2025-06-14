package com.springboot.core.basic;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author prabhakar, @Date 20-09-2024
 */
public class RandomStringGenerator {
    public static void main(String[] args) {
        String randomString = generateRandomString();
        String randomNumber = generateRandomNumber();
        String finalString = "APP-" + randomNumber + "-" + randomString;

        System.out.println(finalString);

    }

    private static String generateRandomString() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return getString(6, characters);
    }

    private static String generateRandomNumber() {
        String digits = "0123456789";
        return getString(3, digits);
    }

    private static String getString(int length, String digits) {
        StringBuilder randomNumber = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(digits.length());
            randomNumber.append(digits.charAt(index));
        }

        return randomNumber.toString();
    }

}
