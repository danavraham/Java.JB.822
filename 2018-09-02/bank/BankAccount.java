package bank;

public class BankAccount {
	String owner;
	double balance, commission;
	
	// constructor
	public BankAccount(String owner, double balance, double commission) {
		super();
		this.owner = owner;
		this.balance = balance;
		this.commission = commission;
	}
	
	// methods
	public double deposit(double amount){
		balance += amount - commission;
		return balance;
	}
	
	public double withdraw(double amount){
		if(balance - amount - commission >= 0){
			balance -= amount + commission;
		} else {
			System.out.println("No money to withdraw!");
		}
		return balance;
	}
	
}
