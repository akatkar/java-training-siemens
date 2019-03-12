package com.siemens.lesson5.inheritance;

public class Rectangular extends Shape {
	
	protected double height;
	protected double width;

	public Rectangular(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double area() {
		return height * width;
	}

	@Override
	public double perimeter() {
		return 2*(height + width);
	}

	@Override
	public String toString() {
		return "Rectangular [height=" + height + ", width=" + width + "]";
	}
}
