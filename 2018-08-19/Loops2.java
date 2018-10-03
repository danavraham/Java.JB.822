import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
		// input 5 numbers and print the sum of all digits for each number
		
		Scanner scan = new Scanner(System.in);
		
		int count = 1;
		while(count <= 5){
			System.out.println("Enter a number");
			int num = scan.nextInt();
			int sum = 0;
			while(num != 0){
				//sum = sum + num % 10;
				sum += num % 10;
				//num = num / 10;
				num /= 10;
			}
			
			System.out.println("Sum of all digits is: " + sum);
			count++;
		}
		
		System.out.println("Bye bye and have a great day...");

	}

}
