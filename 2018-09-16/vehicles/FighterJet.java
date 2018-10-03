package vehicles;

public class FighterJet extends Plane {
	private int numOfMissiles, numOfBombs;

	public FighterJet(int speed, String color, int numOfSeats, double altitude, int numOfMissiles, int numOfBombs) {
		super(speed, color, numOfSeats, altitude);
		this.numOfMissiles = numOfMissiles;
		this.numOfBombs = numOfBombs;
		System.out.println("End of FighterJet constructor");

	}

	public int getNumOfMissiles() {
		return numOfMissiles;
	}

	public void setNumOfMissiles(int numOfMissiles) {
		this.numOfMissiles = numOfMissiles;
	}

	public int getNumOfBombs() {
		return numOfBombs;
	}

	public void setNumOfBombs(int numOfBombs) {
		this.numOfBombs = numOfBombs;
	}
	
	
}
