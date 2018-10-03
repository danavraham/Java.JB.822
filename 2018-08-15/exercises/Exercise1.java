package exercises;

public class Exercise1 {

	public static void main(String[] args) {
		// create 2 vars print them, swap their values and print again!
		int num1 = 8, num2 = 6;
		System.out.println("num1 = " + num1 +", num2 = " + num2);
		// SWAP
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 = " + num1 +", num2 = " + num2);

	}

}
