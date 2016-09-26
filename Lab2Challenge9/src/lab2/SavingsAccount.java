package lab2;

public class SavingsAccount extends BankAccount {
	private boolean status;

	public SavingsAccount(double bal, double intRate, String name, int num) {
		super(bal, intRate);
	}

	public void checkAccountStatus() {
		if (getBalance() <= 25) {
			status = false;
		} else {
			status = true;
		}
	}

	public double withdraw(double withdrawAmount) {
		this.checkAccountStatus();
		double withdrawVal = 0;
		if (status) {
			withdrawVal = super.withdraw(withdrawAmount);
		} else {
			System.out.println("Balance is less than $25, cannot withdraw.");
		}
		return withdrawVal;

	}

	public void deposit(double d) {
		super.deposit(d);
		if (getBalance() > 25) {
			status = true;
		} else {

			status = false;
			System.out.println("Enter more to make account active.");
		}
	}

	public void monthlyProcess() {
		if (withdrawals > 4){
			double balancePostFees = getBalance() - (withdrawals - 4);// what is monthly service chage and where do I define this method
			super.setBalance(balancePostFees);
			//super.monthlyProcess();//do we need or what are we doing.
		}
		
		if (getBalance() > 25){
			status = true;
		}else {
			status = false;
			System.out.println("Enter more to make account active.");
		}
	}
}