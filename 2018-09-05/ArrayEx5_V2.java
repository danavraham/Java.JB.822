import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] array = new int[4];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a nuber: ");
			array[i] = scan.nextInt();
		}

		// print the array BEFORE sorting
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		// SORT
		int left = 0;
		int right = array.length - 1;

		// Keep going until left < right becomes false, then it's done!
		while (left < right) {
			if (array[left] % 2 != 0){ //odd
				left++;
			} else{ // even
				int temp = array[right];
				array[right] = array[left];
				array[left] = temp;
				right--;
			}
		}

		// print the array AFTER sorting
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
