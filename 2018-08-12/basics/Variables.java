package basics;

public class Variables {

	public static void main(String[] args) {

		// whole numbers
		byte num1 = 127; // one byte in memory ( -128 <==> 127 )
		short num2 = 32000; // two bytes in memory ( -32,768 .. 32,767 )
		int num3 = 2000000000; // 4 bytes in memory ( -2,147,483,648 .. 2,147,483,647 )
		long num4 = 2334543546L; // 8 byte in memory ( -9,223,372,036,854,775,808 .. 9,223,372,036,854,775,807 )
		
		// decimal numbers
		float dec1 = 1.58F; // 4 bytes in memory 
		double dec2 = 2.879; // 8 bytes in memory
		
		// boolean (logical)
		boolean bool = true; // true or false
		
		// text
		char tav = 'A';
		String text = "hello everyone!";
	

	}

}
