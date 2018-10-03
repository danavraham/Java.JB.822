package exercises;

import java.util.Scanner;

public class
 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter month: ");
		int month = scan.nextInt();
		System.out.print("Enter Year: ");
		int year = scan.nextInt();
		
		if(month == 4 || month == 6 || month == 9 || month == 11){
			System.out.println("30 days");
		} else if(month == 2){
			if(year%4 == 0 && year%100 !=0 || year%400 == 0){
				System.out.println("29 days");
			} else {
				System.out.println("28 days");
			}
		} else {
			System.out.println("31 days");
		}

	}

}
