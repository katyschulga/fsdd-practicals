/*
 *  Demo Code used in Week 06 fsdd 
 * 
 *  © Dr Kevin Sim
 *    Edinburgh Napier University 
 *    2016
 *  
 */
package fsdd;

import java.util.ArrayList;

import fsdd.data.Cards;
import fsdd.data.Numbers;

public class ExampleArrayList {

	public static void main(String[] args) {
		// call 2 static methods defined in this class
		ExampleArrayList.exercise1();
		ExampleArrayList.exercise2();
	}

	/**
	 * 
	 * Complete this exercise by following the instructions contained in the comments and adding code
	 * 
	 */
	private static void exercise1() {
		// An array of strings
		String[] cardArray = Cards.getDeck();

		// We can populate an ArrayList by looping though the array, adding each
		// element to the list
		
		// Note that the Arrays class you saw last week provides static helper methods for
		// converting arrays to lists but it is good practice to try these things yourself 

		// Declare and Initialise an empty ArrayList of Strings to hold our cards
		ArrayList<String> cardList = new ArrayList<>();

		// populate the list with each element of the array
		for (String card : cardArray) {
			cardList.add(card);
		}

		/**
		 * Your Tasks is to add code under this comment block but before the end of the method to:
		 * 
		 * a) Use the Collections.shuffle(List<E>) method to shuffle the deck of cards. 
		 * 
		 * b) Print out each card in the order it exists in the list.
		 *  
		 * c) Look at the methods described in the javadoc for the Collections Class. 
		 *    Can you easily reverse the order of the list (you should know the URL by now)
		 * 
		 */
		
		
	}//end of method exercise1

	
	/**
	 * Exercise 2 Instructions</br> 
	 * 
	 * Hover the mouse over the method name exercise2 below to show this comment using HTML</br></br>
	 *  
	 * Class {@link Numbers} contains an array of int values 
	 * It can be accessed using the method {@link Numbers#getAnIntArray()} 
	 * </br>	 
	 * </br>
	 * Using your knowledge (you can adapt the code from {@link #exercise1()})
	 * Add the integer values to an ArrayList and use the helper methods in {@link #Collections} to</br></br>
	 * 
	 *    a) calculate the minimum and maximum values stored in the list</br>    
	 *    b) calculate the number of times that the number 88 occurs</br>
	 *    c) Sort the list in descending order</br>
	 *    d) Swap the first and Last element</br>
	 *    
	 */
	private static void exercise2() {
		//TODO Add your code in the body of this method

	}	
	
}
