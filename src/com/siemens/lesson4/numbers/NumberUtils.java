package com.siemens.lesson4.numbers;

public class NumberUtils {

	private static final String[] ONES = { "sıfır", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz",
			"dokuz" };

	private static final String[] TENS = { "", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen",
			"doksan" };

	private static final String[] THOUSANDS = { "", "bin", "milyon", "milyar", "trilyon", "katrilyon" };

	public static String numberToText(long number) {

		String result = "";
		int i = 0;
		while (number > 0) {
			int x = (int) (number % 1000);
			result = numberToText(x) + THOUSANDS[i] + result;
			number/=1000;
			i++;
		}
		return result;
	}

	private static String numberToText(int number) {

		if (number < 10)
			return ONES[number];

		if (number < 100) {
			int x = number % 10;
			int y = number / 10;
			return TENS[y] + ONES[x];
		}

		if (number < 1000) {
			int x = number % 10;
			number /= 10;
			int y = number % 10;
			int z = number / 10;
			return (z == 1 ? "" : ONES[z]) + "yüz" + 
				   (y == 0 ? "" : TENS[y]) + 
				   (x == 0 ? "" : ONES[x]);
		}
		return "";
	}
}
