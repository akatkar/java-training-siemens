package com.siemens.lesson3.array;

public class Array2DSamples {

	public static void displayArray(int[] a) {
		for(int i : a ) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] intDoubleArray = {
				{1,2,3},
				{1,2,3,4,5},
				{1,2,3,4,5,6},
				{1,2,3,4,5,6,7}				
		};
		
		for( int[] array: intDoubleArray )
			displayArray(array);
	}
}
