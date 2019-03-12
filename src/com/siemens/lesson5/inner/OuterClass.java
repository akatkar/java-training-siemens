package com.siemens.lesson5.inner;

public class OuterClass {    // Dıştaki Sınıf
	int x=2; 
	
	public class InnerClass {    // İçteki Sınıf
		int x=6;
		public void getX() {
			int x=8;
			System.out.println(x);   
			// Ekrana 8 basılır
			System.out.println(this.x);   
			// Ekrana 6 basılır
			System.out.println(OuterClass.this.x);
			// Ekrana 2 basılır
		}
	}
	
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		InnerClass in = out.new InnerClass();
		in.getX();
		
		new OuterClass().new InnerClass().getX();
		
	}
}
