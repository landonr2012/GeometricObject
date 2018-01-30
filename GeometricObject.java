

	import java.util.Scanner;

	public abstract class GeometricObject{

	    // Class fields
	    String color = "Green";
	    String isFilled = "";
	    
	    //default constructor
	    public GeometricObject() {
	       
	    }
	    
	    public GeometricObject(String color, String isFilled) {
	        this.color = color;
	        this.isFilled = isFilled;
	    }
	    
	    public String getColor() {
	        return color;
	    }
	    
	    public void setColor(String color) {
	        this.color = color;
	    }
	    
	    public String getIsFilled() {
	        return isFilled;
	    }
	    
	    public void setIsFilled(String isFilled) {
	        this.isFilled = isFilled;
	    }
	    
	    @Override
	    public String toString() {
	        return "Color: " + color + "\tFilled: " + isFilled; 
	    }
	    
	    public abstract double getArea();
	    public abstract double getPerimeter();
	    
	    public static int max (Circle x, Circle y) {
	        
	        if (x.getArea() > y.getArea()) {
	            return 1;
	        }
	        else if (x.getArea() < y.getArea()) {
	            return -1;
	        }
	        else
	            return 0;
	    }

	}

