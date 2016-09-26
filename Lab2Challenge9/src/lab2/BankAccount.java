package lab2;
public static void main(String[] args) 
public class BankAccount {
	protected double balance, annualInterestRate, serviceCharges;
	protected int withdrawals,deposits;
	
	
	
	public BankAccount(double balance, double interestRate){
		this.balance =balance;
		this.annualInterestRate = interestRate;
	}
	
	public void deposit(double amount){
		this.balance = balance + amount;// whatever it was plus the new amount.
		deposits++; // increases number of deposits by one each time.
	}
	
	public double withdraw(double withdraw){
		this.balance = balance - withdraw;
		withdrawals++;
		return balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	protected void calcInterest(){
		double mir = annualInterestRate/12;
		double monthlyInterest = balance*mir;
		this.balance = balance + monthlyInterest;
	}
	public double getInterest(){
		return balance;
	}
	
	public void monthlyProcess(){
		this.balance = balance - serviceCharges;
		calcInterest();
		withdrawals = 0;
		deposits = 0;
		serviceCharges = 0;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getServiceCharges() {
		return serviceCharges;
	}

	public void setServiceCharges(double serviceCharges) {
		this.serviceCharges = serviceCharges;
	}

	public int getWithdrawals() {
		return withdrawals;
	}

	public void setWithdrawals(int withdrawals) {
		this.withdrawals = withdrawals;
	}

	public int getDeposits() {
		return deposits;
	}

	public void setDeposits(int deposits) {
		this.deposits = deposits;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}