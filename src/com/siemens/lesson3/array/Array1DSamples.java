package com.siemens.lesson3.array;


public class Array1DSamples {
	
	public static int[] reverse(int[] a) {
		int[] reversedArray = new int[a.length];
		for(int i=0;i<a.length;i++) {
			reversedArray[i] = a[a.length -1 - i];
		}
		return reversedArray;
	}

	public static void reverse2(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 -i];
			a[a.length-i-1] = temp;
		}
	}
	
	public static void displayArray(int[] a) {
		for(int i : a ) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		displayArray(intArray);
		
		intArray = reverse(intArray);
		
		displayArray(intArray);
		
		int[] intArray2 = {1, 2, 3, 4, 5};
		
		displayArray(intArray2);
		
		reverse2(intArray2);
		
		displayArray(intArray2);
		
	}
}
