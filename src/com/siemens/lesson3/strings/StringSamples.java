package com.siemens.lesson3.strings;

public class StringSamples {

	public static String getFileExtension(String fileName) {
		int lastDot = fileName.lastIndexOf('.');
		if(lastDot == -1)
			return null;
		return fileName.substring(lastDot+1);
	}
	
	public static void whichFile(String fileName) {
		
		if(fileName.endsWith(".pdf")) {
			System.out.println("Bu bir pdf dosyası");
		}else if(fileName.endsWith(".txt")) {
			System.out.println("Bu bir txt dosyası");
		}else {
			System.out.println("Dosya türü bilinmiyor");
		}
	}
	
	public static void main(String[] args) {
		String s = "ABCDEFGHI";
		
		System.out.println(s.substring(2,5));
		
		String lower = s.toLowerCase();
		if(lower.equals(s)) {
			System.out.println("eşit");
		}else {
			System.out.println("eşit değil");
		}
		
		if(lower.equalsIgnoreCase(s)) {
			System.out.println("eşit");
		}else {
			System.out.println("eşit değil");
		}
		
		String fileName1 = "deneme.pdf";
		String fileName2 = "deneme.txt";
		
		whichFile(fileName1);
		whichFile(fileName2);
		whichFile("deneme.psf");
		System.out.println(getFileExtension(fileName1));
		System.out.println(getFileExtension("deneme"));
		
		StringBuilder sb = new StringBuilder();
		sb.append("deneme")
		.append(" deneme")
		.append("deneme");
		
		System.out.println(sb.toString());
		String ss = String.format("%d %s", 24, "deneme");
		System.out.println(ss);
		
	}
}
