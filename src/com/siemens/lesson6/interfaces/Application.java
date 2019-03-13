package com.siemens.lesson6.interfaces;

public class Application {
	
	public static void moveShapes(Moveable moveable) {
		moveable.moveTo(4,5);
		moveable.moveTo();
	}

	public static void main(String[] args) {
		TopGun topGun = new TopGun();
		topGun.getName();
		
		Moveable m = topGun;
		m.moveTo(3, 4);
		m.moveTo();
		
		moveShapes(topGun);
	}
}
