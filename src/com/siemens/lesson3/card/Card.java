package com.siemens.lesson3.card;

import static com.siemens.lesson3.card.Card.Rank.*;
import static com.siemens.lesson3.card.Suit.*;


public class Card {
	
	enum Rank {
		TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), 
		EIGHT("8"), NINE("9"), TEN("T"), JACK("J"), QUEEN("Q"), KING("K"), ACE("A");
		
		private String symbol;
		
		private Rank(String symbol) {
			this.symbol = symbol;
		}
		
	    @Override
	    public String toString() {
	        return symbol;
	    }
	}
	
	private Suit suit;
	private Rank rank;
	
	public Card (Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "" + suit + rank;
	}
}
