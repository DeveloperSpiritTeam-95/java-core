package com.springboot.core.fibonacci;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int next,first=0,second=1;
		for(int i=0;i<10;i++)
		{
			if(i<=1)
				next = i;
			else
			{
				next = first + second;
				first = second;
				second = next;
			}
			System.out.print(" "+next);
		}
	}

	public void fibonacci(){
		int n = 10; // Number of terms to print

		int firstTerm = 0;
		int secondTerm = 1;

		System.out.print(firstTerm + " " + secondTerm + " ");

		for (int i = 2; i < n; i++) {
			int nextTerm = firstTerm + secondTerm;
			System.out.print(nextTerm + " ");
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
