package exercises;

import java.util.Scanner;

public class Exercise4_p18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = scan.nextInt();

		if(num < 10){
			System.out.println(1);
		} else if(num < 100){
			System.out.println(2);
		} else if(num < 1000){
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		
	}

}
