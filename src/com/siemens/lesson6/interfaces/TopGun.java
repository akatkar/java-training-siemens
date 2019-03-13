package com.siemens.lesson6.interfaces;

public class TopGun implements Moveable {

	public String getName() {
		return "top gun";
	}

	@Override
	public void moveTo(int x, int y) {
		System.out.println("moved to" + x + "," + y);		
	}
	
	
}
