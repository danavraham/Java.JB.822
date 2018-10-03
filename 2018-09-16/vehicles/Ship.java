package vehicles;

public class Ship extends Vehicle {
	private int numOfSails, crew, length;

	public Ship(int speed, String color, int numOfSails, int crew, int length) {
		super(speed, color);
		this.numOfSails = numOfSails;
		this.crew = crew;
		this.length = length;
	}
	
	
}
