package cars2;

public class Car {
	// properties
	String color, manufacturer, model;
	double price;
	short currentSpeed, maxSpeed;
	
	// constructor
	public Car(String color, String manufacturer, String model, double price, short currentSpeed, short maxSpeed) {
		this.color = color;
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.currentSpeed = currentSpeed;
		this.maxSpeed = maxSpeed;
	}
	
	
	public Car(String manufacturer, String model, double price, short maxSpeed) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.maxSpeed = maxSpeed;
		this.color = "Black";
	}



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
