package fsdd;

import java.util.ArrayList;

import org.openstreetmap.gui.jmapviewer.Coordinate;

import gui.MapGui;

public class Application {

	public static void main(String[] args) {

		exampleTask1();		
//		exampleTask2();
//		exampleTask3();
//		exampleTask4();
//		exampleTask5();
	}

	/**
	 * Print each string contained in the airport data  
	 * 
	 */
	private static void exampleTask1() {
		
		//get the data as a string array
		String[] data = Data.getAirports();
		
		// loop through each line of the data		
		for (String line : data) {
			System.out.println(line);
		}
			
	}
	
	/**
	 * Print the details of the airport containing the word "Edinburgh" 
	 * 
	 */
	private static void exampleTask2() {

		//get the data as a string array
		String[] data = Data.getAirports();
		
		// loop through each line of the data		
		for (String line : data) {
		
			// check if the line contains the substring "Edinburgh" 
			if (line.contains("Edinburgh")) {
			
				//print the line
				System.out.println(line);				
			}
		}		
	}

	/**
	 * Split a line of data to its individual fields and store in variables 
	 *  
	 */
	private static void exampleTask3() {


		//get the data as a string array
		String[] data = Data.getAirports();

		// The first line of the data at index 0 is a table header containing the field names 
		// Loop through each subsequent line of data starting at index 1 		
		for (int i = 1; i < data.length; i++) {

			//get the next line of data
			String line = data[i];
		    
			/* 
		     * Each line is a string containing 4 fields separated by commas
			 * 
			 * Each line is formatted similar to 
			 * 
			 * "9200PIK1,Glasgow Prestwick International Airport,55.5089315378,-4.6110428419
			 * 
			 * The 4 fields are the ID, Name, Latitude and Longitude of an airport
			 * 
			 * We can split a line into its fields using the String.split method to get an
			 * 
			 * array containing 4 substrings
			 */
			 
			String[] elements = line.split(",");

			// The ID and Name are both strings so we dont need to convert them
			String id = elements[0];
			String name = elements[1];

			// Latitude and Longitude are stored as Strings 
			String latString = elements[2];
			String lonString = elements[3];

			// Convert the strings representing Latitude and Longitude to type double
			double lat = Double.parseDouble(latString);
			double lon = Double.parseDouble(lonString);

			//build a string to print the details
			String str = "";
			str += id + " ";
			str += name + " ";
			str += lat + " ";
			str += lon ;
			System.out.println(str);
		}
	}


	/**
	 * Plot a location on a map using the supplied libraries 
	 * 
	 *  
	 */
	private static void exampleTask4() {

		//specify a latitude and longitude 
		double lat = 55.932932;
		double lon = -3.213520;		

		//Create an instance of Coordinate supplied with the JMapViewer library		
		Coordinate coordinate = new Coordinate(lat, lon);
		
		
		// Display the coordinate on a map
		MapGui.showMap(coordinate);
		
	}
	
	/**
	 * Display all the airports on a map
	 */
	private static void exampleTask5() {
		//create an empty ArrayList to hold a list of Coordinates 
		ArrayList<Coordinate> coordinates = new ArrayList<>();
		
		//get the data as a string array
		String[] data = Data.getAirports();
		
		// go through each line of data starting at index 1 (line 0 is the header)		
		for (int i = 1; i < data.length; i++) {
						
			String line = data[i];
			System.out.println(line);

			/* 
			 * Each string looks like "9200PIK1,Glasgow Prestwick International Airport,55.5089315378,-4.6110428419"
			 * 
			 * There are 4 fields separated by commas
			 * 
			 * Representing ID, Name, Latitude, Longitude
			 * 
			 * We can split this using the String.split method to get an
			 * 
			 * array of 4 strings
			 */
			 
			String[] elements = line.split(",");

			// The ID and Name are both strings
			String id = elements[0];
			String name = elements[1];

			// Latitude and Longitude are of type String but need converted
			// to the primitive type double
			String latString = elements[2];
			String lonString = elements[3];

			// Change the strings to a double
			double lat = Double.parseDouble(latString);
			double lon = Double.parseDouble(lonString);

			// Create a new Coordinate using lat and lon
			Coordinate coordinate = new Coordinate(lat, lon);

			//add the coordinate to our list				
			coordinates.add(coordinate);	
		}
		// Display the coordinates on a map
		MapGui.showMap(coordinates);

	}

	

}
