package vehicles;

public class Plane extends Vehicle {
	private int numOfSeats;
	private double altitude;
	
	public Plane(int speed, String color, int numOfSeats, double altitude) {
		super(speed, color);
		this.numOfSeats = numOfSeats;
		this.altitude = altitude;
		System.out.println("End of Plane constructor");

	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	
	
	
}
