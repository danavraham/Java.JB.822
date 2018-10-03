package arrays;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// input 10 numbers and print the average of EVEN numbers
		Scanner scan = new Scanner(System.in);
		double avg = 0;
		int count = 0;
		int[] nums = new int[6];
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Please enter a number: ");
			nums[i] = scan.nextInt();
			if(nums[i] % 2 == 0){
				avg += nums[i];
				count++;
			}
		}

		if(count == 0){
			System.out.println("No EVEN NUMBERS!!");
		} else {
			avg /= count;
			System.out.println(avg);
		}
		
	}

}
