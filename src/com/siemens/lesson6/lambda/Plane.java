package com.siemens.lesson6.lambda;

public class Plane extends Aircraft {

	@Override
	public void fly() {
		System.out.println("Plane flies with engine");		
	}

	@Override
	public int distance() {
		// TODO Auto-generated method stub
		return 5000;
	}
}
