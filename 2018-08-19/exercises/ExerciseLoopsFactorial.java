package exercises;

import java.util.Scanner;

public class ExerciseLoopsFactorial {

	public static void main(String[] args) {
		// input unknown number of positive numbers, for each number print the factorial
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number (negative to exit): ");
		int num = scan.nextInt();
		while(num >=0){
			int fact = 1;
			while(num >1){
				fact *= num;
				num--;
			}
			System.out.println("Factorial is: " + fact);
			System.out.print("Enter a number (negative to exit): ");
			num = scan.nextInt();
			
		}
		
		System.out.println("BYE! Come again..");
	}

}
