 = package exercises;

import java.util.Scanner;

public class Exercise22_p26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value of fibonacci: ");
		int value = scan.nextInt();
		
		int f1 = 1, f2 = 1;
		System.out.print("1, 1");
		
		while(value >= f2){
			f2 = f1 + f2;
			f1 = f2 - f1;
			System.out.print(", " + f2);
		}
	}

}
