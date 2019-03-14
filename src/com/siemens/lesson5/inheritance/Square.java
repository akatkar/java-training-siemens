package com.siemens.lesson5.inheritance;

public class Square extends Rectangular {

	public Square(double edge) {
		super(edge, edge);
	}

	@Override
	public String toString() {
		String s = super.toString();
		return s + "Square [height=" + height + ", width=" + width + "]";
	}
}
