package a.shapes;

public class Test {

	public static void main(String[] args) {
		Shape s = new Shape();
		Rectangle r = new Rectangle(1,1);
		Circle c = new Circle(1);

		// shape
		s.color = "RED";
		System.out.println("shape color: " + s.color);
		System.out.println("=============");

		// rectangle
		r.color = "BLUE";
		r.length=5;
		r.width=3;
		System.out.println("rectangle color: " + r.color);
		System.out.println("rectangle length: " + r.length);
		System.out.println("rectangle width: " + r.width);
		System.out.println("=============");

		// circle
		c.color = "YELLOW";
		c.radius=5;
		System.out.println("circle color: " + c.color);
		System.out.println("circle radius: " + c.radius);
		System.out.println("=============");
	}
}
