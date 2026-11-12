package fsdd.cardgame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	public static final String[] suits = { "Clubs", "Spades", "Hearts", "Diamonds"};

	public static final String[] ranks = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
					"Queen", "King" };
	
	private ArrayList<Card> deck = new ArrayList<>();
	
	
	public Deck() {		
		initialise();							
	}

	private void initialise() {
		deck.clear();
		for(int suitId = 0; suitId < suits.length; suitId++){
			for(int rankId = 0; rankId < ranks.length; rankId++){
				int value = rankId+1;
				if(value > 10){
					value = 10;
				}
				Card card = new Card(suits[suitId], ranks[rankId], value);
				deck.add(card);
			}
		}		
		//TODO: add code to shuffle the deck here	
	}	
	
	/**
	 * 
	 * Query: returns the first card from the deck (and removes it).
	 */
	public Card getNextCard(){
		
	}
	
	/**
	 * 
	 * Query: returns true if the deck has more cards left in it
	 */
	public boolean hasMoreCards(){
		
	}
	
	/**
	 * 
	 * Query:returns the number of cards remaining in the deck
	 */
	public int cardsRemaining(){
		
	}
}
