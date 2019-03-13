package com.siemens.lesson5.inheritance;

public class Circle extends Shape {
	private static final double PI=3.14;
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
