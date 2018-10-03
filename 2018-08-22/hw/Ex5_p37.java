package hw;

import java.util.Scanner;

public class Ex5_p37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a number:");
		int num1 = scan.nextInt();
		
//		for (int i = num1; i > 0; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			// end of the line
//			System.out.println();
//		}
		
		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num1 + 1 - i; j++) {
				System.out.print(j + " ");
			}
			// end of the line
			System.out.println();
		}

	}

}
