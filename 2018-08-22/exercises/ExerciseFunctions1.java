package exercises;

import java.util.Scanner;

public class ExerciseFunctions1 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
//		factorial(x);
		for (int i = 1; i <=10; i++) {
			factorial(i);
		}
		
		printNums(80, 28);
	}
	
	// method that gets a number and prints its factorial
	public static void factorial(int number){
		int fact = 1;
		for (int i = number; i > 1; i--) {
			fact *= i;
		}
		
		System.out.println(number + "! = " + fact);
	}

	// method the gets 2 numbers and prints all numbers between from the smallest to the largest
	public static void printNums(int num1, int num2){
		if(num1 > num2){
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for (int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}
	}
	
}











