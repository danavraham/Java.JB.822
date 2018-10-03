package arrays;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[20];
		// input 20 numbers into the array
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			nums[i] = scan.nextInt();
		}
		
		// print the array
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		//swap!
		for (int i = 0; i < nums.length / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[i + nums.length / 2];
			nums[i + nums.length / 2] = temp;
		}
		System.out.println();
		// print the array
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
