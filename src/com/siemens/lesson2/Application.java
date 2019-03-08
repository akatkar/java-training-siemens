package com.siemens.lesson2;

public class Application {

	public static void main(String[] args) {
		Rational r1 = new Rational(100, 200);
		Rational r2 = new Rational(100, 300);
		Rational r3 = r1.add(r2);
		
		System.out.println(r1 +  " + " + r2 + " = " + r3);
		
		System.out.println(Math.pow(6, 0.5));
		
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,0);
		
		if(p1.equals(p2)) {
			System.out.println("Bunlar eşit");
		}else {
			System.out.println("eşit değiller");
		}
		
		System.out.println("distance between "+ p1 + " and " + p2 + " = " + p1.distance(p2));
		
	}
}
