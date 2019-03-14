package com.siemens.lesson7.collection;

import java.util.*;

import com.siemens.lesson5.inheritance.*;

public class CollectionExample2 {
	
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		
		myList.add("Bu listeye sadece String konabilir");
		//myList.add(new ArrayList<String>()); String listesine ArrayList nesnesi konamaz
		System.out.println(myList.get(0));
		
		List<Shape> shapeList = new ArrayList<>();
		shapeList.add(new Rectangular(2,3));
		shapeList.add(new Circle(3));
		shapeList.add(new Square(4));
		
	}
}
