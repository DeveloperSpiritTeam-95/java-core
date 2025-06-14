package com.springboot.core.patterns;

/**
 * @author prabhakar, @Date 27-03-2025
 */

public class SimplePatterns {

    public static void main(String[] args) {

        System.out.println("Square Pattern");
        squarePattern();
        System.out.println("==============");
        System.out.println("Right Triangle Pattern");
        rightTrianglePattern();
        System.out.println("==============");
        System.out.println("Inverse Right Triangle Pattern");
        invertedRightTrianglePattern();
        System.out.println("==============");
        System.out.println("Pyramid Pattern");
        pyramidPattern();
        System.out.println("==============");
        System.out.println("Reverse Pyramid Pattern");
        reversePyramidPattern();
        System.out.println("==============");

    }

    private static void squarePattern(){

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    private static void rightTrianglePattern(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void invertedRightTrianglePattern(){
        for (int i = 5; i >= 1; i--){
            for (int j = i; j >= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        for (int i =1; i <= 5; i++){
            for (int j = 5; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
    }

    private static void pyramidPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void reversePyramidPattern(){
        int row = 5;
        for (int i = row; i >= 1; i--) {
            for (int j =row  - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
