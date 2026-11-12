/*
 *  Demo Code used in Week 06 fsdd 
 * 
 *  © Dr Kevin Sim
 *    Edinburgh Napier University 
 *    2016
 *  
 */
package fsdd.data;

/**
 * 
 * A class providing static methods for simulating a pack of Cards
 * 
 * @author Dr Kevin Sim
 *
 */
public class Cards {

	// final variables are constants that cannot be changed
	private final static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

	private final static String[] ranks = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Jack", "Queen", "King" };

	private static String[] deck = null;

	/**
	 * Provides an ordered pack of cards as an array of 52 Strings. Cards are
	 * returned in suit order "Clubs", "Diamonds", "Hearts", "Spades" Within
	 * each suit cards are provided in ascending rank order from "Ace" through
	 * to "King" An example String representation of a card is "Seven of Clubs"
	 * The value of a card can be obtained using the method
	 * {@link #getValue(String)}
	 * 
	 * @return Returns an array of strings of length 52 containing String
	 *         representation of a pack of cards
	 */
	public static String[] getDeck() {
		if (deck == null) {

			// An array of suits and ranks which we will use to create a pack of
			// cards

			// Create a String array to hold our pack of cards
			deck = new String[52];

			// Populate the cards array using a nested for each loop to create
			// 52 Strings
			int index = 0;
			for (String suit : suits) {
				for (String rank : ranks) {

					// create the card string
					String card = rank + " of " + suit;

					// add it to the pack and increment the index
					deck[index] = card;
					index++;
				}
			}
		}

		return deck;
	}// end of method getDeck

	/**
	 * Converts a string representation of a card into an integer value A String
	 * starting with "Ace" returns the the value 1 and Strings starting with
	 * "Jack", "Queen" or "King" return the value 10
	 *
	 * @param card
	 *            A string representing a card
	 * @return An integer representing the value or rank of the card
	 */
	public static int getValue(String card) {
		// Check the parameter won't cause an error
		// Check for null (not initialise) or an empty string ""
		if (card == null || card.length() == 0) {
			// return -1 signifying an error
			return -1;
		}
		int value = -1;

		// get the card value from the position in the ranks array
		// ie "Ace of Hearts" starts with the string "Ace" which is at ranks[0]
		for (int i = 0; i < ranks.length; i++) {
			if (card.startsWith(ranks[i])) {
				value = i + 1;
				// if the position refers to Jack Queen King (index 10, 11, 12)
				// set value to 10
				if (value > 10) {
					value = 10;
				}
				//if we have found the card we can stop checking break exists the for loop 
				break;
			}
		}

		return value;
	}

}
