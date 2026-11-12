/**
 * 
 */
package combinationlock;

/**
 * @author Simon Powers
 * Stubbed implementation of a class
 * that represents a combination lock.
 *
 */

public class CombinationLock {
	
	//Add any private instance variables that you need here.
	/**
	 * @param combination the lock's 2 digit combination
	 */
	public CombinationLock(int combination){
		//Implement the constructor here.
		//This will need to split the combination 
		//parameter into its two separate digits.
		//Hint: recall the Armstrong numbers tutorial
		//where we did something similar.
		
	}
	
	/**
	 * Queries whether the lock is open.
	 * @return true if the lock is open.
	 */
	public boolean isOpen(){
		return true; //This will need to be modified to correctly implement the method.
	}
	
	/**
	 * Enters a single digit.
	 * @param digit the digit entered.
	 */
	public void enter(int digit){
		//Implement the method here so that the tests pass.
	
	}
	
	
	/**
	 * Closes and resets the lock.
	 */
	public void close(){
		//Implement the method here so that the tests pass.
		
	}

	@Override
	public String toString() {
		return "To be implemented";
	}
	
	
}
