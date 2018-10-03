package exercises;

import java.util.Scanner;

public class ExerciseSwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int choice;
		
		do{
			System.out.print("Please enter a value to work on:");
			int value = scan.nextInt();

			System.out.print(
					"Actions Menu:\n1> Power of 2\n2> Factorial\n3> Positive/Negative\n4> Exit\nPlease choose: ");
			choice = scan.nextInt();
			
			switch (choice) {
			// Power
			case 1:
				System.out.println("The power of two is: " + value * value);
				break;
			// Factorial
			case 2:
				long fact = 1;
				for (int i = value; i > 1; i--) {
					fact *= i;
				}
				System.out.println(value + "! = " + fact);
				break;
			// Pos/Neg
			case 3:
				if (value < 0) {
					System.out.println("Negative");
				} else {
					System.out.println("Positive");
				}
				break;
				
			default:
				System.out.println("Error, try again...");
				break;
			}
			
			
		}while(choice != 4);
		
		System.out.println("Bye");

	}
}
