package lab2;

public class BankAccount {
	protected double balance, annualInterestRate, serviceCharges;
	protected int withdrawals,deposits;
	
	public BankAccount(double balance, double intrestRate){
		this.balance = balance;
		this.annualInterestRate = intrestRate;
	}
	
	public void deposit(double amount){
		this.balance = balance + amount;// whatever it was plus the new amount.
		deposits++; // increases number of deposits by one each time.
	}
	
	public void withdraw(double withdraw){
		this.balance = balance - withdraw;
		withdrawals++;
	}
	
	public double getBalance(){
		return balance;
	}
	
	protected void calcInterest(){
		double mir = annualInterestRate/12;
		double monthlyInterest = balance*mir;
		this.balance = balance + monthlyInterest;
	}
	public double getIntrest(){
		return balance;
	}
	
	public void monthlyProcess(){
		this.balance = balance - serviceCharges;
		calcInterest();
		withdrawals = 0;
		deposits = 0;
		serviceCharges = 0;
	}
}

