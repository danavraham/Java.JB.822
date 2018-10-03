package exercises;

import java.util.Scanner;

public class Exercise4_p15 {

	public static void main(String[] args) {
		// input movie length in minutes, print the length in hours and minutes
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter movie length in minutes: ");
		int length = scan.nextInt();
		int hours = length / 60;
		int minutes = length % 60;
		System.out.println("Movie length: " + hours + " hour(s) and " + minutes + " minute(s)!");

	}

}
