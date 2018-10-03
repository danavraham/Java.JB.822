package hw;

import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		// input numbers to an array, sort the array so all even numbers will be
		// at the right side and the odd on the left side

		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		int[] eizer = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = scan.nextInt();
		}

		// oddInd is the index of the first "cell" in the array for odd numbers
		// evenInd is the index of the last "cell" in the array for odd numbers
		int oddInd = 0, evenInd = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {// EVEN!
				eizer[evenInd] = array[i];
				evenInd--;
			} else { // ODD!
				eizer[oddInd] = array[i];
				oddInd++;
			}
		}

		// copy numbers from eizer to array
		for (int i = 0; i < eizer.length; i++) {
			array[i] = eizer[i];
		}

		// print the array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
