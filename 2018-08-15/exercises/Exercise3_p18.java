package exercises;

import java.util.Scanner;

public class Exercise3_p18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter number 1: ");
		int num1 = scan.nextInt();
		System.out.print("Please enter number 2: ");
		int num2 = scan.nextInt();
		System.out.print("Please enter number 3: ");
		int num3 = scan.nextInt();
		
		if(num1 > num2){
			// TRUE
			if(num1 > num3){
				System.out.println(num1);
			} else {
				System.out.println(num3);
			}
		} else if(num2 > num3){
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}

	}

}
