package com.siemens.lesson2;

public class Rational {

	private int num;    // pay
	private int denum;  // payda
	
	
	public Rational(int num, int denum) {
		int n = gcd(num, denum);
		this.num = num/n;
		this.denum = denum/n;
	}
	
	private int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	
	public Rational add(Rational other) {
		
	    int n = this.num * other.denum + other.num*this.denum;
	    int d = this.denum * other.denum;
		
		return new Rational(n, d);
	}
	
	public String toString() {
		return num + "/" + denum;
	}
	
}
