package com.siemens.lesson5.inheritance;

public class Square extends Rectangular {

	public Square(double edge) {
		super(edge, edge);
	}

	@Override
	public String toString() {
		return "Square [height=" + height + ", width=" + width + "]";
	}
}
