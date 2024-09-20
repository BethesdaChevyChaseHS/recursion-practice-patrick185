package com.example.project;

public class RecursionPractice {

	public static void main(final String[] args) {
		//use main to test your functions!
		System.out.println(factorial(5));
		System.out.println(sum(10));
		System.out.println(findTheFirstW("Hello world", 0));
		fibonacci(9);
		findTheFirstW("Hello World", 1);
	}
	
	//factorial of n should return the long n multiplied by all numbers before it. 
	//if n == 0 or n == 1, 1 should be returned.
	//note that a long is just an int with twice the memory
	public static long factorial(long n){
		if (n==1 || n==0) {
			return 1;
		}	
		else {
			return n*factorial(n-1);
		}
	}

	//sum of n should return the long n added  by all numbers before it. 
	//if n == 0, 0 should be returned.
	//this is essentially factorial but with addition
	public static long sum(long n){
		
		if (n<=0) {
			return n;
		}	
		return n+sum(n-1);
		
	}
	
	// The fibonacci of n should return the long value at position n in the Fibonacci sequence.
	// If n == 0, 0 should be returned.
	// If n == 1, 1 should be returned.
	// For n > 1, it should return the sum of fibonacci(n - 1) and fibonacci(n - 2).
	public static long fibonacci(long n){
		if (n == 0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

	//Should return the index of the first W/w in a string. 
	//If there is no w, return -1. 
	// Use recursion!The point of this exercise is to show that anything you can do with a loop, 
	//you can do with recursion
	//This is a problem that can be easily solved without recursion, but I want you to practice
	//using recursion to solve problems. 

	//hint with base cases - 
	//1)  the character at the current index is W
	//2) The current index is out of bounds
	public static int findTheFirstW(String s, int curIndex){
		if (curIndex < 0 || curIndex>=s.length()) {
			return -1;
		}
		if (s.charAt(curIndex) == 'W' || s.charAt(curIndex) == 'w') {
			
			return curIndex;
		}
		return findTheFirstW(s, curIndex+1);
	
		
		
		
		
	}
}

