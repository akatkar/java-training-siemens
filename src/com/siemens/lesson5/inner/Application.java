package com.siemens.lesson5.inner;

import com.siemens.lesson5.inner.OuterClass.InnerClass;

public class Application {
	
	private static void process(MyList myList) {
		int size = myList.getSize();
		
		MyList.Iterator iterator = myList.getIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		iterator = myList.getIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());		
		}
		
		
	}
	
	public static void main(String[] args) {
		MyList myList1 = new MyList(10);
		MyList myList2 = new MyList(20);
		
		
		process(myList1);
		process(myList2);
		
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in = out.new InnerClass();
		in.getX();

	}
}
