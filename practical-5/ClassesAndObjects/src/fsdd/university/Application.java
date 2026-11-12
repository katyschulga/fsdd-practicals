package fsdd.university;

import java.util.ArrayList;

public class Application {

public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		for(String line : Data.getData()){
		
			System.out.println(line);
			
			//split the string to an array every time a comma exists in the string
			String[] elements = line.split(",");
			
			//the name is the first element of the array
			String name = elements[0];
			
			//the matric number is the second element but needs converted from a string to an integer
			Integer matricNumber = Integer.parseInt(elements[1]);
			
			//Create a new Student object and add it to our list
			Student student = new Student(name, matricNumber);			
			students.add(student);
		}
		
		
		//print out the size then each element of the list 
		System.out.println(students.size());
		
		for(Student student : students){
			System.out.println(student);
		}
		
		//Todo: write code to create 5 modules. Then randomly add 3 modules
		//to each of the 50 students.
	}
}
