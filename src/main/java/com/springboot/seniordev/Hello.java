package com.springboot.seniordev;

/**
 * @author prabhakar, @Date 24-03-2025
 */

public class Hello {

    public static void main(String[] args) {

        int a = 4;
        int b = 10;
        int c = 3;
        int result1 = a++ + ++b - --c + ++a;
        System.out.println(result1);

//        int x = 5;
//        int y = 2;
//        int result2 = ++x * y-- + x-- - --y;
//        System.out.println(result2);

        int x = 12;
        int y = 4;
        int result2 = (x-- + ++y) * (y++ - --x) / ++y;
        System.out.println(result2);

        int m = 6;
        int n = 9;
        int result3 = m++ + --n * (m-- + ++n) - --m + n++;
        System.out.println(result3);

        for (int i=1; i<=5; i++) {
            for (int j = 1; j <= 5; j++)
                System.out.print("* ");
            System.out.println();
        }

        for (int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++)
                System.out.print(j+" ");
            System.out.println();
        }

        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for (int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++){
                if (i % 2 != 0)
                    System.out.print("* ");
                else
                    System.out.print("+ ");
            }
            System.out.println();
        }

        for(int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++){
                if (i % 2 == 0)
                    System.out.print(i/2);
                else
                    System.out.print(i/2);
            }
            System.out.println();
        }

        for (int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++){
                if (i % 2 != 0)
                    System.out.print(i%2-1);
                else
                    System.out.print(i%2+1);
            }
            System.out.println();
        }



    }
}
