/*
 *  Demo Code used in Week 06 fsdd 
 * 
 *    Dr Kevin Sim
 *    Edinburgh Napier University 
 *    2016
 *  
 */
package fsdd;

import java.util.ArrayList;
import java.util.HashMap;

import fsdd.data.HashMapData;

public class HashMapExample {

	public static void main(String[] args) {
		
		//populate an arrayList with lines of text from a file 
		//The class Data does this for you. You don't need to know how for now 
		//(but if you are interested have a look at the Data Class provided) 
		
		ArrayList<String> dataArrayList =  HashMapData.getData();
		
		//we can print out each element of the ArrayList using a loop but it will be long
		for(String entry : dataArrayList){
			System.out.println(entry);
		}
		
		//we can get the size (note lists use a method called size not length)
		int listSize = dataArrayList.size();
		System.out.println("There are " + listSize + " entries in the list");
		
		//an element can be obtained from the list using get
		String firstElement = dataArrayList.get(0);
		
		//each element is a string composed of an id and a module name separated by a comma
		//
		//     9684,Formal Approaches to Software Engineering(SET11515)
		//
		//the *string* 9684 is the students ID and the remainder of the string is the module name
		//we can use the split method of String to split the string into an array of strings each 
		//time it encounters a comma. 
		//The array will have two elements at indexes 0 and 1 
		String[]  idAndModule = firstElement.split(",");
		
		//The first element is the student ID  
		String id = idAndModule[0];
		
		//And the second element of the string array is the module name
		String moduleName = idAndModule[1];
		
		//now create the hashmap 
		HashMap<String, Integer> attendance = new HashMap<>();
		
		//create an Integer to use as the map's Value
		Integer count = new Integer(0);
		
		//and put in a key value pair ( we could use the module name as an id also )
		attendance.put(id, count);
		
		
		
	}

}
