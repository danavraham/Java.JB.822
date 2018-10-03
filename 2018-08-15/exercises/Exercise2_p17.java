package exercises;

import java.util.Scanner;

public class Exercise2_p17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter number 1: ");
		int num1 = scan.nextInt();
		System.out.print("Please enter number 2: ");
		int num2 = scan.nextInt();

		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}

	}

}
