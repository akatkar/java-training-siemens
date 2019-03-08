package com.siemens.lesson1;

public class LoopSamples {
	public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || i == 9) {
                    System.out.print("*");
                } else {
                    System.out.print((j == 0 || j == 9) ? '*' : ' ');
                }
            }
            System.out.println();
        }
    }
}
