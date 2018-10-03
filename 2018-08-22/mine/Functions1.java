package mine;

import java.util.Scanner;
 
public class Functions1 {

	public static void main(String[] args) {
		
		
		sayHi2("Hi there!");
		sayHi2("Shalom Olam");
		add(2, 8);
		add(-90, 120);
		
		int res = add2(10, 90);
		System.out.println(res);
		add(res, 100);
		
		add(add2(10, 9), 10);
		
		System.out.println( Math.abs(-9) );
		int num1 = 2, num2 = 10;
		
		System.out.println( Math.pow(num1, num2) );
	}
	
	public static void sayHi(){
		System.out.println("Hello World!");
		System.out.println("Have a nice day :)");
	}
	
	public static void sayHi2(String greeting){
		System.out.println(greeting);
		System.out.println("Have a nice day :)");
	}
	
	public static void add(int num1, int num2){
		System.out.println("The sum is: " + (num1 + num2));
	}
	
	public static int add2(int num1, int num2){
		return num1 + num2;
	}

}
