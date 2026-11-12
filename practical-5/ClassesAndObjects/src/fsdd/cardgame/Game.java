package fsdd.cardgame;

import java.util.Scanner;

public class Game {

	
	public static void main(String[] args) {
		Deck deck = new Deck();
		Scanner scanner = new Scanner(System.in);
		char response = '?';
		Card lastCard = deck.getNextCard();
		//CardViewer.show(lastCard);
		System.out.println("The first card is " + lastCard.toString());
		Card nextCard;
		while (response != 'q' && deck.hasMoreCards()) {

			System.out.print("Do you think the next card will be Higher (h) or lower (l) than the "
					+ lastCard.toString() + "? (Type q to quit) -> ");
			String line = scanner.nextLine();
			if (line.length() > 0) {
				response = line.charAt(0);
			}
			if (response == 'h' || response == 'l') {
				nextCard = deck.getNextCard();
				//CardViewer.show(nextCard);
				if (response == 'h') {
					if (nextCard.getValue() > lastCard.getValue()) {
						System.out.println(
								"You were Correct " + nextCard.toString() + " is higher than " + lastCard.toString());
					} else {
						System.out.println(
								"You were Wrong " + nextCard.toString() + " is not higher than " + lastCard.toString());
					}
				} else {
					if (nextCard.getValue() < lastCard.getValue()) {
						System.out.println(
								"You were Correct " + nextCard.toString() + " is lower than " + lastCard.toString());
					} else {
						System.out.println(
								"You were Wrong " + nextCard.toString() + " is not lower than " + lastCard.toString());
					}
				}
				lastCard = nextCard;
			} else if (response != 'q') {
				System.out.println("Please enter l, h or q");
			}
		}

		scanner.close();
	}

}
