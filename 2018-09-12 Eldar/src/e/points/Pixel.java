package e.points;

public class Pixel extends Point {

	private String color;

	public Pixel(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public Pixel() {
		this(0, 0, "black");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
