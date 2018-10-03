package exercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// input a number and print the first digit
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		System.out.println("The rightmost digit is: " + (num % 10) );

	}

}
