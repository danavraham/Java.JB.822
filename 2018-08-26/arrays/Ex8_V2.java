package arrays;

import java.util.Scanner;

public class Ex8_V2 {

	public static void main(String[] args) {
		// check if an array is palindrome
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];
		
		//input the array
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Please enter a number: ");
			numbers[i] = scan.nextInt();
		}
		
		// check if palindrome
		for (int i = 0; i < numbers.length/2; i++) {
			if(numbers[i] != numbers[numbers.length - 1 -i]){
				System.out.print("NOT ");
				break; // exit loop!
			}
		}
		System.out.println("PALINDROME!");
	}

}
