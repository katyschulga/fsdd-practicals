//remember the package name comes first
package fsdd;

//Then remember to import any built in Java classes
import java.util.Random;
import java.util.Scanner;

//Then define the class 
public class CardsAnswer {

	public static void main(String[] args) {

		// An array of suits and ranks which we will use to create a pack of cards
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] ranks = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };

		// Create a String array to hold our pack of cards
		String[] cards = new String[52];

		// Populate the cards array using a nested for each loop to create 52 Strings
		int index = 0;
		for (String suit : suits) {
			for (String rank : ranks) {
				
				//create the card string
				String card = rank + " of " + suit;
				
				// add it to the pack and increment the index
				cards[index] = card;
				index++;
			}
		}

		// We need a random number generator to shuffle the pack of cards.
		Random random = new Random();

		// shuffle the cards by randomly swapping two cards 300 times. 
		for (int i = 0; i < 300; i++) {
			int index1 = random.nextInt(52);
			int index2 = random.nextInt(52);

			// we need to use a temporary String variable to swap two cards 
			String temporaryCard = cards[index1];
			cards[index1] = cards[index2];
			cards[index2] = temporaryCard;
		}

		// the cards should now be shuffled 
		
	
		// Lets have a game of higher lower.
		char response = 'Z';
		index = 0;
		Scanner scanner = new Scanner(System.in);
		int lastRank = -1;
		int rank = -1;
		boolean correct = true;
		
		/**
		 * ****************************************************************
		 * add your code in the following loop 
		 * ****************************************************************
		 */
		while (response != 'q' && index < 52) {
			String currentCard = cards[index];
			System.out.println(currentCard);
			for(int i = 0; i < 13; i++) {
				if(currentCard.startsWith(ranks[i])) {
					rank = i + 1;
					break;
				}
			}
			//ignore first time round as no previous card
			if(index > 0) {
				correct = false;
				//two condition give a correct choice
				if(response == 'h' && rank > lastRank) {
					correct = true;
				}
				if(response == 'l' && rank < lastRank) {
					correct = true;
				}
				//if incorrect terminate game otherwise continue
				if(correct) {
					System.out.println("Correct");
					if(index == 51) {
						System.out.println("Game Completed!!!");
						break;
					}
				}else {
					System.out.println("Incorrect Game Over");
					break;
				}
			}
			if(index < 51) {
				System.out.println("is next card (h)igher or (l)ower or q to quit");
			}
			response = scanner.nextLine().toLowerCase().charAt(0);			
			lastRank = rank;					
			index++;
		}//end of while loop
		scanner.close();		
	}
}
