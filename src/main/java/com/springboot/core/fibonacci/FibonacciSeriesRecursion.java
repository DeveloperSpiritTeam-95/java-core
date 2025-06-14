package com.springboot.core.fibonacci;

public class FibonacciSeriesRecursion {

	/**
	 *In programming, recursion is a technique where a function calls itself to solve
	 *  a problem, breaking it down into smaller, similar sub problems until a base
	 *  case is reached, allowing the recursion to terminate.
	 */

	static int a=0,b=1,c=0;
	 static void printFibonacci(int n){ 
		    if(n>0){
		         c = a + b;
		         a = b;
		         b = c;
		         System.out.print(" "+c);
		         printFibonacci(n-1);
		     }    
	 }
	
	public static void main(String[] args) {
		System.out.print(a+" "+b);
		printFibonacci(10-2);
	 	//printFibonacci(8);
		System.out.println();
		System.out.println(fibonacci(11)-1);
	}


	private static int fibonacci(int n){
		 if(n==0){
			 return 0;
		 }
		 if(n==1) {
			 return 1;
		 }
		 if(n>0){
			 return fibonacci(n-1) + fibonacci(n-2);
		 }
		 return n;
	}


}
