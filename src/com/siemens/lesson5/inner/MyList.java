package com.siemens.lesson5.inner;

public class MyList {
	
	private Object[] data;
	
	public MyList(int size) {
		data = new Object[size];
		for(int i=0; i<size; i++)
			data[i] = (Object) ("data " + i);
	}

	public int getSize() {
		return data.length;
	}

	public Iterator getIterator() {
		return new Iterator(this);
	}
	
	public class Iterator {
		private MyList myList;
		private int position;
		
		public Iterator(MyList myList) {
			this.myList = myList;
			this.position = 0;
		}
		
		public boolean hasNext() {
			return position < myList.getSize();
		}
		
		public Object next() {
			return myList.data[position++];
		}
	}
}
