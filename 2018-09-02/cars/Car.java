package cars;

public class Car {
	// properties
	String color, manufacturer, model;
	double price;
	short currentSpeed, maxSpeed;
	
	// actions
	public void accelerate(){
		if(currentSpeed < maxSpeed){
			currentSpeed++;
		}
	}
	
	public void brake(){
		if(currentSpeed > 0){
			currentSpeed--;
		}
	}
	
	public void honk(){
		System.out.println("BEEP! move...");
	}
}
