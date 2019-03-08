package com.siemens.lesson3.card;

import java.util.Arrays;

import com.siemens.lesson3.card.Card.Rank;

public class Deck {
	private Card[] cards;
	
	public Deck() {
		cards = new Card[52];
		int i = 0;
		
		for(Suit s: Suit.values()) {
			for(Rank r: Rank.values()) {
				cards[i] = new Card(s,r);
				i++;
			}
		}
	}

	@Override
	public String toString() {
		String s = "[";
		for(Card c:cards) {
			s += c.toString() + ",";
		}
		return s + "]";
	}
	
	
	
}
