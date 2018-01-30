
public class Circle extends GeometricObject implements Comparable<Circle>{
	
	private int radius;
	
	public Circle(int newRadius) {
		radius = newRadius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int compareTo(Circle o) {
		if(this.getRadius() < o.getRadius())
			return -1;
		else if (this.getRadius() > o.getRadius())
			return 1;
		else
			return 0;
	}
	
	@Override
	public double getArea() {
		
		double area = (this.radius * this.radius) * 3.14159;
		return area;
	}
	
	@Override
	public double getPerimeter() {
		return 0;
	}
}

