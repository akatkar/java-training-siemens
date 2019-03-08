package com.siemens.lesson2;

public class Factorial {
	
	public int calculate(int n) {
		int result = 1;
		for(int i=1;i<=n; i++) {
			result *= i;
		}
		return result;
	}
	
	public int calculateRecursive(int n) {
		if (n==1) 
			return 1;
		return n * calculateRecursive(n-1);
	}
	
	
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		int result = factorial.calculateRecursive(5);
		System.out.println("5! = " + result);
	}
}
