package a.shapes;

public class Circle extends Shape {
	double radius;
	
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}



	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
