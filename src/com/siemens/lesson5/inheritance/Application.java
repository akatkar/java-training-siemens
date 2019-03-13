package com.siemens.lesson5.inheritance;

public class Application {
	
	public static void displayShape(Shape shape) {
		System.out.println("shape:" + shape);
		System.out.println("area:" + shape.area());
		System.out.println("perimeter:" + shape.perimeter());
		System.out.println();
	}
	
	public static void main(String[] args) {
		Rectangular rect = new Rectangular(3,4);
		displayShape(rect);
		
		Square square = new Square(5);
		displayShape(square);
		
		Circle c1 = new Circle(2);
		displayShape(c1);	
	}
}
