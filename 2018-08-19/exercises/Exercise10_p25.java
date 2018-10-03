package exercises;

import java.util.Scanner;

public class Exercise10_p25 {

	public static void main(String[] args) {
		// input a number and print the leftmost digit
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n = scan.nextInt();
		if(n < 0){
			n = -n;
		}
		
		while(n > 9){
			n = n / 10;
		}
		
		System.out.println(n);

	}

}
