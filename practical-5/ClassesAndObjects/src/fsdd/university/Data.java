package fsdd.university;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Data {

	/**
	 *  This code reads a file line by line into a string array which is returned by the method
	 *  It expects the file to have 50 lines
	 *  
	 */
	public static String[] getData(){
		String[] data = new String[50];
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("StudentData.csv")));
			String line;
			int idx = 0;
			while((line = reader.readLine()) != null){
				data[idx] = line;
				idx++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
