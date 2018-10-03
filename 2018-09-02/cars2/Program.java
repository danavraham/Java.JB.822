package cars2;

public class Program {

	public static void main(String[] args) {
		Car c1 = new Car("White", "Hyundai", "i25", 100000.0, (short)10, (short)120);
		
		Car c2 = new Car("Ferrari", "458", 345345435, (short)450);
		
		System.out.println(c2.color);
	}

}
