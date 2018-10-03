package arrays;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// input 10 numbers and print all the numbers that are BIGGER 
		// than the average of all the numbers
		
		int sum = 0;
		double avg = 0;
		int[] nums = new int[10]; // define an int array
		Scanner scan = new Scanner(System.in);
		// input 10 numbers and calculate their sum
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Please enter a number: ");
			nums[i] = scan.nextInt();
			sum += nums[i];
		}

		avg = sum / nums.length;
		System.out.println("Average = " + avg);
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > avg){
				System.out.println(nums[i]);
			}
		}
	}

}
