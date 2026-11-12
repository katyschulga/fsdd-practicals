package fsdd.shapes;
import java.util.ArrayList;
/**
 * 
 * @author Simon Powers
 * A class to create and test MyRectangle objects.
 *
 */
public class MyRectangleTest {
	/**
	 * The main method is where the program begins execution.
	 * 
	 */
	public static void main(String[] args) {
		int width = 10;
		int length = 100;
		MyRectangle myCoolRectangle = new MyRectangle(width, length);
		System.out.println("Width of myCoolRectangle: " + myCoolRectangle.getWidth());
		System.out.println("Width of myCoolRectangle: " + myCoolRectangle.getHeight());
		System.out.println("Area of myCoolRectangle: " + myCoolRectangle.getArea());
		
		ArrayList<MyRectangle> rectangleList = new ArrayList<>();
		
		//TODO
		
		//1. write a for loop to add 100 rectangles to the list
		//with random widths and heights between 0 and 1000
		
		//2. print out the size of the list after adding the rectangles
		
		//3. write a for loop to calculate the average area of the rectangles
		//in the list
		
		//4. print the average area
	}

}
