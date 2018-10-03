package hw;

import java.util.Scanner;

public class Ex7_p37 {

	public static void main(String[] args) {
		// input 10 numbers - show all numbers between each input
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a number:");
		int num1 = scan.nextInt();
		
		for (int i = 2; i <= 10; i++) {
			System.out.print("\nPlease enter a number:");
			int num2 = scan.nextInt();
			
			int delta;
			if(num1 < num2){
				delta =  1;
			} else {
				delta = -1;
			}
			
			for (int j = num1; j != num2; j+=delta) {
				System.out.print(j + " ");
			}
			System.out.print(num2);
			num1 = num2;
		}

	}

}
