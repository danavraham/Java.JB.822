package exercises;

import java.util.Scanner;

public class Exercise1_p17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter number 1: ");
		int num1 = scan.nextInt(); // the input operation from the USER!
		System.out.print("Please enter number 2: ");
		int num2 = scan.nextInt();
		
		if(num2 > num1){
			System.out.println("GROWING...");
		}
		

	}

}
