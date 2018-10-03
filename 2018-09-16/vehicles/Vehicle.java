package vehicles;

public class Vehicle {
	private int speed, numOfWheels;
	private String color;
	
	public Vehicle(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
		System.out.println("End of Vehicle constructor");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
