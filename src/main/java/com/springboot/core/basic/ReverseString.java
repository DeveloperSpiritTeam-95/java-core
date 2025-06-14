package com.springboot.core.basic;

/**
 * @author prabhakar, @Date 14-08-2024
 */
public class ReverseString {

    public static void main(String[] args) {

        String name = "prabhakar naik";
        String[] splitName = name.split(" ");
        String string = "";

        for (String str : splitName) {
            for (int i = str.length() - 1; i >= 0; i--) {
                string += str.charAt(i);
            }
            string += " ";
        }

        System.out.println(string);

        String text = """
                Line 1
                Line 2
                """;

        System.out.println(text.stripIndent()); // Removes unnecessary indentation


    }
}
