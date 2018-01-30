
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String larger = "";
       
       System.out.println("Enter the radius of a circle: ");
       int r = input.nextInt();
       Circle c1 = new Circle(r);
       System.out.println("Enter the color of the circle: ");
       String c = input.next();
       c1.setColor(c);
       
       // Display circles
       System.out.println("\nCircle1\n\tRadius: " + c1.getRadius() + "\tArea: " + c1.getArea() + "\tColor: " + c1.getColor());
       Circle c2 = new Circle(15);
       System.out.println("\nCircle2\n\tRadius: " + c2.getRadius() + "\tArea: " + c2.getArea() + "\tColor: " + c2.getColor());
       
       // display larger circle
       int largerCircle = GeometricObject.max(c1, c2);
       
       if(largerCircle == 1) {
    	   larger = "\nCircle 1 is larger than Circle 2";
       }
       else if (largerCircle == -1) {
    	   larger = "\nCircle 2 is larger than Circle 1";
       }
       else
    	   larger = "\nCircle 1 and Circle 2 are the same size";
       
       System.out.println(larger);
  
	}
	
}
