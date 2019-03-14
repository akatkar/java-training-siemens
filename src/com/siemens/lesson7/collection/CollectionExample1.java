package com.siemens.lesson7.collection;

import java.util.*;

public class CollectionExample1 {
	
	public static void display(List list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		List l = myList;
		
		myList.add("this is string");
		l.add(new Object());
		l.add(new ArrayList());
		myList.add(3);
		display(l);
	}

}
