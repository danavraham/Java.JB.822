package a.shapes;

public class Rectangle extends Shape {
	double length;
	double width;
	
	

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}



	@Override
	public double getArea() {
		return length*width;
	}
}
