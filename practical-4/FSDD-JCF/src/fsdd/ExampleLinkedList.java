/*
 *  Demo Code used in Week 06 fsdd 
 * 
 *  © Dr Kevin Sim
 *    Edinburgh Napier University 
 *    2016
 *  
 */
package fsdd;

import java.util.LinkedList;

public class ExampleLinkedList {

	public static void main(String[] args) {				
		
		ExampleLinkedList.exampleStackFromLectureSlides();
		
	}

	/**
	 * An example of using a LInkedList as a stack. Taken from the lecture
	 * 
	 */
	static void exampleStackFromLectureSlides() {

		LinkedList<String> customers = new LinkedList<>();

		// push an item on to the top of the stack
		customers.push("Customer 1 9:30 Bob");

		// addFirst is exactly the same as push
		customers.addFirst("Customer 2 10:00 Susan");

		// push another .... this is now at the top of the stack
		customers.push("Customer 3 11:30 Ben");// <-- last added

		// look at the top item on the stack but don't remove it
		String customerName = customers.peek();

		// pop Ben from the top of the stack
		customerName = customers.pop();
		System.out.println(customerName);

		String line = "kevin,bob,bill";
		String[] names = line.split(",");
		for(String name : names){
			System.out.println(name);
		}

	}

}
