package lab2;

public class BankAccount {
	protected double balance, intrestRate,serviceCharges;
	protected int withdraws,deposits;
	
	public BankAccount(double balance, double intrestRate){
		this.balance = balance;
		this.intrestRate = intrestRate;
	}
	
	public void deposit(double amount){
		this.balance = balance + amount;// whatever it was plus the new amount.
		deposits++; // increases number of deposits by one each time.
	}
	
	public void withdraw(double withdraw){
		this.balance = balance - withdraw;
		withdraws++;
	}
	
	public double getBalance(){
		return balance;
	}
	
	

}

