package ebay;

public class ShoppingItem {
	String description, shippingMethod;
	double price;
	int quantity;
	
	public ShoppingItem(String description, double price, int quantity, String shippingMethod) {
		super();
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.shippingMethod = shippingMethod;
	}

	public ShoppingItem(String description, double price, String shippingMethod) {
		super();
		this.description = description;
		this.price = price;
		this.shippingMethod = shippingMethod;
		this.quantity = 1;
	}
	
	public void printInfo(){
		System.out.println(description + " " + shippingMethod + " $" + price + " " + quantity 
				+ " total price: " + calcTotalPrice());
	}
	
	public double calcTotalPrice(){
		return this.price * this.quantity;
	}
	
}
