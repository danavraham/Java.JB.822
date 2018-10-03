package exercises;

import java.util.Scanner;

public class Exercise12_p32 {

	public static void main(String[] args) {
		// input 10 numbers, sum only the even numbers!
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; i <= 10; i++){
			System.out.print("Enter a number: ");
			int num = scan.nextInt();
			
			if(num % 2 == 0){
				sum += num;
			}
		}
		
		System.out.println("The sum of all even numbers is: " + sum);
		

	}

}
