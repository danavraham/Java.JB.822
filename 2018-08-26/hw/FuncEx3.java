package hw;

import java.util.Scanner;

public class FuncEx3 {

	public static void main(String[] args) {
		// test printText() method
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter some text: ");
		String txt = scan.nextLine();
		printText(txt, 4);
		
		String t = printText2("DO IT", 10);
		System.out.println(t);
	}
	
	// a method that gets a String and a number and prints the text times the number given
	public static void printText(String text, int number){
		for (int i = 1; i <= number; i++) {
			System.out.print(text);
		}
		System.out.println();
	}
	
	public static String printText2(String text, int number){
		String result = "";
		for (int i = 1; i <= number; i++) {
			result += text;
		}
		return result;
		
	}

}
