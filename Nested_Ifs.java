package ifs;

import java.util.Scanner;

public class Nested_Ifs {

	public static void main(String[] args) {
		// input a number and print if negative, positive or ZERO
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = scan.nextInt();

		if(num > 0){
			System.out.println("POSITIVE");
		} else if(num == 0){
			System.out.println("ZERO!");
		} else {
			System.out.println("NEGATIVE");
		}
	}

}
