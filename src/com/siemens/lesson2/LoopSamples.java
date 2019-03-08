package com.siemens.lesson2;

import java.util.Scanner;

public class LoopSamples {
	
	
	static void doFrame(int size) {
		for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size-1) {
                    System.out.print("*");
                } else {
                    System.out.print((j == 0 || j == size-1) ? '*' : ' ');
                }
            }
            System.out.println();
        }
	}
	
	static void doRightTriangle() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(( j < 10 - i -1) ? ' ' : '*');
			}
			System.out.println();
		}
		
	}
	
	
	static short maxShortValue() {
		short result = 0;
		short next = (short) (result + 1);
		
		while(++result < ++next) {
		}
		
	    return result;
	}
	
	static int maxIntegerValue() {
		int result = 0;
		int next = result + 1;
		
		while(++result < ++next) {
		}
		
	    return result;
	}
	
	public static void main(String[] args) {

		//Scanner scanner = new Scanner(System.in);
		//int size = scanner.nextInt();
        //doFrame(size);
        doFrame(5);
        doRightTriangle();
        
        long start = System.currentTimeMillis();
        short max = maxShortValue();
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Duration:" + duration);

        
        System.out.println("Max short:" + max);
   
        start = System.currentTimeMillis();
        int maxInt = maxIntegerValue();
        end = System.currentTimeMillis();
        duration = end - start;
        System.out.println("Duration:" + duration);
        System.out.println("Max integer:" + maxInt);

	}
}
