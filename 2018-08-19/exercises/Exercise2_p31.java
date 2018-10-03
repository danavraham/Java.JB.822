package exercises;

import java.util.Scanner;

public class Exercise2_p31 {

	public static void main(String[] args) {
		// input two numbers, print all the numbers between them from the FIRST to the SECOND
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
//		if(num1 < num2){
//			for(int i=num1; i <= num2; i++){
//				System.out.print(i + " ");
//			}
//		}else {
//			for(int i=num1; i >= num2; i--){
//				System.out.print(i + " ");
//			}
//		}
		
		int delta;
		if(num1 < num2){
			delta = 1;
		}else {
			delta = -1;
		}

		for(int i = num1; i!=num2; i+=delta){
			System.out.print(i + " ");
		}
		System.out.println(num2);
	}

}
