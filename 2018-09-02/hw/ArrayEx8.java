package hw;

import java.util.Scanner;

public class ArrayEx8 {

	public static void main(String[] args) {
		// input numbers into array and check if palindrome
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		int size = array.length;

		// input numbers to the array
		for (int i = 0; i < size; i++) {
			System.out.print("Enter a number: ");
			array[i] = scan.nextInt();
		}

		int i;
		// check if palindrome
		for (i = 0; i < size / 2; i++) {
			if (array[i] != array[size - 1 - i]) {
				break;
			}
		}

		// after for loop
		if (i == size / 2) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("NOT Palindrome");
		}
	}

}
