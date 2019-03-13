package com.siemens.lesson6.interfaces;

public interface Moveable {
	void moveTo(int x, int y);
	
	default void moveTo() {
		moveTo(0,0);
	}
}
