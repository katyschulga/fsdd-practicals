package fsdd.university;
import java.util.ArrayList;
/**
 * 
 * @author Simon Powers
 * A class to create and test Student, Lecturer, and Module objects.
 *
 */
public class StudentRecordTest {

	public static void main(String[] args) {
		Student jack = new Student("Jack", 001);
		Student jill = new Student("Jill", 002);
		
		Lecturer kevin = new Lecturer("Kevin", 23);
		Lecturer simon = new Lecturer("Simon", 24);
		
		Module sd1 = new Module("Software Development 1 -- the best module", kevin);
		Module compSys = new Module("Computer Systems", simon);
		
		jack.addModule(sd1);
		jack.addModule(compSys);
		jill.addModule(sd1);
		jill.addModule(compSys);
		
		
		
		
		System.out.println("Jack's matric: " + jack.getMatric());
		System.out.println("Jill's matric: " + jill.getMatric());
		System.out.println("Jack's modules");
		ArrayList<Module> jackModules = jack.getModules();
		for(Module m : jackModules){
			System.out.println(m.getName());
		}
		System.out.println("Jill's modules");
		ArrayList<Module> jillModules = jill.getModules();
		for(Module m : jillModules){
			System.out.println(m.getName());
		}
		
		//TODO
		//1. add code to print out details of the lecturers
		//2. add code to swap the lecturers
		
	}

}
