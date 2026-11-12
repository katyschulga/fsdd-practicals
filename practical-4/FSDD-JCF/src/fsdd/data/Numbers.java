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
 * Static methods that return sample arrays of different primitive number types
 * 
 * @author Dr Kevin Sim
 *
 */
public class Numbers {

	/**
	 * An array of int values. The variable is declared as private so it is only available to this class 
	 * 
	 * @see #getAnIntArray()
	 */
	private static int[] anIntArray = { 68, 92, 86, 58, 43, 66, 60, 84, 58, 59, 93, 56, 18, 41, 62, 64, 38, 49, 48, 76, 68, 47,
			70, 41, 51, 54, 58, 64, 57, 37, 51, 69, 42, 47, 96, 43, 32, 60, 58, 73, 83, 70, 55, 27, 32, 31, 72, 59,
			46, 63, 85, 80, 61, 43, 88, 74, 72, 44, 25, 79, 49, 58, 75, 77, 60, 68, 70, 82, 56, 61, 35, 11, 85, 60,
			58, 40, 64, 58, 56, 85, 62, 38, 54, 31, 66, 41, 53, 72, 19, 44, 41, 84, 66, 72, 88, 48, 91, 70, 4, 24 };
	
	
	/**
	 * Public static method that gives access to our private class variable anIntArray
	 * 
	 * @return An int[] populated with 100 values
	 */
	public static int[] getAnIntArray(){
		return anIntArray;
	}

}
