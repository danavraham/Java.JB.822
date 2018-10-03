package hw;

import java.util.Scanner;

public class FuncEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		long num = scan.nextLong();
		System.out.println( "Reversed number is: " + reverseNumber(num) );
	}

	// method that gets a number and returns the reversed number
	public static long reverseNumber(long number){
		long newNum = 0;
		while(number != 0){
			newNum = newNum * 10 + number % 10;
			number /= 10;
		}
		
		return newNum;
	}
	
}
