package ebay;

public class Program {

	public static void main(String[] args) {
//		ShoppingItem item1 = new ShoppingItem();
//		item1.description = "LED Spinner";
//		item1.price = 105.9;
//		item1.quantity = 30;
//		item1.shippingMethod = "Express";
		
		ShoppingItem item1 = new ShoppingItem("LED Spinner", 105.9, 30, "Express");
		item1.printInfo();
		//System.out.println( item1.calcTotalPrice() );
		
		ShoppingItem item2 = new ShoppingItem("Donkey", 2000, "Air Shipment");
		item2.printInfo();
		//System.out.println( item2.calcTotalPrice() );
	}

}
