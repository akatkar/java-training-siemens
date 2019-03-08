package com.siemens.lesson3.wrappers;

public class WrapperSamples {

	public static boolean isPalindrome(int i) {
		String n = Integer.toString(i);
		StringBuilder s = new StringBuilder(n);
		return s.reverse().toString().equals(n);
	}
	
	public static void main(String[] args) {
		int i = 3;
		Integer objectI = i;
		
		int value = Integer.parseInt("12345");
		System.out.println(value);
		
		System.out.println(Integer.reverse(5));
		System.out.println(isPalindrome(123211));
		
	}
}
