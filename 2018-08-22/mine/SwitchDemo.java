package mine;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a number:");
		int num = scan.nextInt();
		
//		if(num == 1){
//			System.out.println("ONE!");
//		} else if(num == 2){
//			System.out.println("TWO!!");
//		} else if(num == 3){
//			System.out.println("Three!!!");
//		}

		switch(num){
			case 1:
			case 4:
				System.out.println("ONE!");
				System.out.println("BYE");
				break;
			case 2:
				System.out.println("TWO!!");
				break;
				
			case 3:
				System.out.println("THREE!!!");
				break;
			default:
				System.out.println("I don;t know what to do...");
		}
	}

}
