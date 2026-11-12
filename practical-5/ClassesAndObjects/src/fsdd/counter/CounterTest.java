package fsdd.counter;


/**
 * 
 * @author Simon Powers
 * A class to create and test our simple counter objects.
 *
 */
public class CounterTest {

	/**
	 * The main method is where the program begins execution.
	 * 
	 */
	public static void main(String[] args) {
		
		Counter myCoolCounter = new Counter();
		//run the stepCountCommand
		myCoolCounter.stepCount();
		//query the counter for the value of its count property
		//and print the result
		System.out.println(myCoolCounter.getCount());
		//reset the counter...
		myCoolCounter.reset();
		//.. and check it worked!
		if(myCoolCounter.getCount() == 0){
			System.out.println("Reset command works! :-)");
		}
		else{
			System.out.println("Reset has not been implemented correctly :-(");
		}
		
		//let's make another counter
		Counter c2 = new Counter();
		c2.stepCount();
		c2.stepCount();
		c2.stepCount();
		//check the two counter's have independent property values
		System.out.println("Count of myCoolCounter: " + myCoolCounter.getCount());
		System.out.println("Count of c2: " + c2.getCount());
		
		//TODO
		
		//1.add a for loop here to increment myCoolCounter 1000 times
		//2.add a print statement to check it worked
		
		//3.call the decrement command to remove 100 clicks from myCoolCounter
		//4.add a print statement to check it worked
		
		//5.add another constructor to the class Counter that takes in an initial count
		//6.create a new counter here using that constructor
		//7.print out the result of querying your new counter for getCount()
		
		//8. add a method to the class Counter that will double the count of a Counter
		//add code here to test the implementation of your method
		
		//9. add a method to the class Counter to implement an unReset command
		//this should restore count to what it was before the most recent reset
		//add code here to test the implementation of your method
		
		
		
		
		
	}

}
