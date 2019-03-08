package com.siemens.lesson2;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(Point other) {
	   double x = Math.pow(this.x - other.x, 2);
	   double y = Math.pow(this.y - other.y, 2);		    
	   return Math.pow(x+y, 0.5);
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(!(obj instanceof Point) )
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		return y == other.y;
	}
	
}
