package fsdd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Data {

	private static String[] flights;
	private static String[] airports;

	public static String[] getFlights() {
		if(flights == null){
			ArrayList<String> dataList = new ArrayList<>();
			try {
				BufferedReader reader = new BufferedReader(new FileReader("./data/flights.csv"));
				String line; 								
				while((line = reader.readLine()) != null){
					dataList.add(line);
				}
				flights = new String[dataList.size()];
				dataList.toArray(flights);	
				reader.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flights;
	}	
	
	public static String[] getAirports() {
		if(airports == null){
			ArrayList<String> dataList = new ArrayList<>();
			try {
				BufferedReader reader = new BufferedReader(new FileReader("./data/airports.csv"));
				String line; 								
				while((line = reader.readLine()) != null){
					dataList.add(line);
				}
				airports = new String[dataList.size()];
				dataList.toArray(airports);	
				reader.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return airports;
	}	
}
