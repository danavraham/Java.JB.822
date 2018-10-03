package bank;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		BankAccount lichay = new BankAccount("Lichay", 10000, 10.5);
//		lichay.deposit(20000);
//		System.out.println(lichay.balance);
		
		System.out.println( lichay.deposit(20000) );
		System.out.println("***********************");
		System.out.println( lichay.withdraw(5000) );
		
		System.out.println( "Balance = " + lichay.getBalance() );
		double b = lichay.getBalance();
		b = 20000000;
		
		Random rand = new Random();
		int x = rand.nextInt(101);
		

	}

}
