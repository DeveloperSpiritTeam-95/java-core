package com.springboot.core.patterns;

public class TaskPatterns {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
		System.out.println("====================");
		for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
		System.out.println("=======================");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=7;j++) {
				if((i==2 && j%2!=0) || (i==4 && j%2!=0)|| (j==i-1) || (j==9-i)||(j==5-i))
					System.out.print(" *");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
