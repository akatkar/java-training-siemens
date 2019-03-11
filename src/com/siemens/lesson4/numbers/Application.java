package com.siemens.lesson4.numbers;

public class Application {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(NumberUtils.numberToText(i));

		System.out.println(NumberUtils.numberToText(16));
		System.out.println(NumberUtils.numberToText(55));

		System.out.println(NumberUtils.numberToText(106));
		System.out.println(NumberUtils.numberToText(163));
		System.out.println(NumberUtils.numberToText(1000));
		System.out.println(NumberUtils.numberToText(1_235_876_123_456L));
		System.out.println(NumberUtils.numberToText(0));
		System.out.println(NumberUtils.numberToText(1_000_000));
		
	}
}
