package lab2;

public class SavingsAccount extends BankAccount {
	private boolean stat;

	public SavingsAccount(String name, int num) {
		super(name, num);
	}

	public void checkAccountStatus() {
		if (getBalance() <= 25)
			stat = false;
		else
			stat = true;
	}

	public void Withdraw(double w) {
		if (stat)
			super.withdrawal(w);
		else
			System.out
					.println("Balance is less than $25, cannot withdraw.");
	}

	public void Deposit(double d) {
		super.deposit(d);
		if (getBalance() > 25)
			status = true;
		else {

			status = false;
			System.out
					.println("Enter more to make account active.");
		}
	}

	public void monthlyProcess() {
		if (deposits() > 4)
			setMonthlycharges(deposits() - 4);
		super.monthlyProcess();

		if (getBalance() > 25)
			status = true;
		else {
			status = false;
			System.out
					.println("Enter more to make account active.");
		}
	}
}
