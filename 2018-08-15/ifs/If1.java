package ifs;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		// input a number and check if it is positive or negative
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		
		if(number >= 0){
			// what to do if TRUE
			System.out.println("POSITIVE");
			number = number / 2;
		} else {
			// what to do if FALSE
			System.out.println("NEGATIVE");
		}

	}

}
