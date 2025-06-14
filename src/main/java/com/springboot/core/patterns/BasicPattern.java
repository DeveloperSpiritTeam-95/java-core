package com.springboot.core.patterns;

public class BasicPattern {

	public static void main(String[] args) {
		
		System.out.println("1 st pattern:");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++)
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.println("2nd problem:");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==5||j==1||i==1||i==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("3rd problem:");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			
			System.out.println();
		}		
		
		System.out.println("4th problem:");
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
				System.out.print("* ");
			
			System.out.println();
		}
		
		System.out.println("5th problem");
		for(int i=5;i>=1;i--)
		{
			for(int k=i-1;k>=i;i++) {
				System.out.println(" ");
			}
			for(int j=i;j>=1;j--)
				System.out.print("*");
			
			System.out.println();
		}
	       
		System.out.println("Box shape: ");
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==3||j==1||i==1||i==3)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1 || j==4)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(j==1 || i==4)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
		int i=1;
		while(i<=4) {
			int j=1;
			while(j<=4) {
				if(j==4||j==1||i==1||i==4)
					System.out.print("* ");
				else
					System.out.print("  ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}
}
