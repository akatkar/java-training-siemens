package com.siemens.lesson3.card;

public enum Suit {
	
	CLUB("\u2663" ), DIAMOND("\u2666" ), HEART("\u2665"), SPADE("\u2660"); 
	
	
	private String symbol;
	
	private Suit(String symbol) {
		this.symbol = symbol;
	}
	
    @Override
    public String toString() {
        return symbol;
    }
}
