package input;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = scan.nextInt();
		System.out.println("You entered the number: " + num);

	}

}
