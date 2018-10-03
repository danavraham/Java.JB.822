package a.shapes;

public class Test2 {
	
	public static void main(String[] args) {
		// reference of type shape
		Shape s;
		
		// assigned to an object of type Circle
		s = new Circle(3);
		System.out.println("area: " + s.getArea());
		
		s = new Rectangle(10, 5);
		System.out.println("area: " + s.getArea());
		
	}

}
