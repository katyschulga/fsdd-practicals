/*
 *    Code used in Week 06 fsdd 
 *    You do not need to understand this code. Just Use It
 *    Dr Kevin Sim
 *    Edinburgh Napier University 
 *    2016
 *  
 */
package fsdd.data;
import java.util.*;
import java.io.*;


public class HashMapData {

	private static String filename = "modules.csv";
	private static ArrayList<String> data = null;
	private static long seed = 1234L;
	private static Random r = new Random(seed);
	private static int numGroups = 3;
	private static int numModulesPerGroup = 3;
	private static int numStudentsPerGroup = 100;
	private static int numCharsInId = 4;
	private static int numEntriesInData = 1000;
	private static HashSet<String> usedIds = new HashSet<>();
	private static HashSet<String> usedModules= new HashSet<>();
	// note generates equal avg num entries for each student
	// could give students probability of attending 
	
	public static ArrayList<String> getData() {
		if (data == null) {			
			data = new ArrayList<>();
			for(int group = 0; group < numGroups; group++){
				//System.out.println("======================Group " + group + "====================");
				BufferedReader br;
				ArrayList<String> list = new ArrayList<>();			
				try {
					br = new BufferedReader(new FileReader(filename));								
					String line; 
					line = br.readLine();
					while (line != null) {					
						list.add(line);					
						line = br.readLine();
					}
					br.close();
				} catch (Exception e) {
					System.out.println("An Error Occurred accessing file " + filename);
	
				}			
				list.removeAll(usedModules);
				while(list.size() > numModulesPerGroup){
					int i = r.nextInt(list.size());
					list.remove(i);
				}
				usedModules.addAll(list);
				for(String moduleName : list){
					//System.out.println(moduleName);
				}
				HashSet<String> ids = new HashSet<>();				
				while(ids.size() < numStudentsPerGroup){
					
				
					for (int i = 0; i < numStudentsPerGroup; i++) {
					String s = "";
						for (int j = 0; j < numCharsInId; j++) {
							s += r.nextInt(10);//add digit 0.. 9
						}
						
						if(usedIds.add(s)){
							ids.add(s);
							//System.out.println("student id " + s);
						}
					}
				}
				
				List<String> idsList = new ArrayList<String>(ids);			
				
				for (int i = 0; i < numEntriesInData; i++) {
					int j = r.nextInt(ids.size());
					String id = idsList.get(j);
					j = r.nextInt(list.size());
					String module = list.get(j);
					String listEntry = id + "," + module;
					data.add(listEntry); 
				}									
			}
		}
		return data;
	}
}
