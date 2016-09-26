package lab2;

import java.util.Scanner;

public class Lab2main {

	public static void main(String[] args) {
		double balance;
		double intRate;
		String choice;
		int Number;

		SavingsAccount account = new SavingsAccount(0, 0, "Name", 0);

		System.out.println("What is your balance? ");

		Scanner keyboard = new Scanner(System.in);
		balance = keyboard.nextDouble();
		account.setBalance(balance);
		System.out.println("Your account balance is " +account.getBalance());
		
		
		System.out.println("How much would you like to withdraw? ");
		double withdrawAmount = keyboard.nextDouble();
		account.withdraw(withdrawAmount);
		System.out.println("Your account balance is " +account.getBalance());
	
		
		
		System.out.println("How much would you like to deposit? ");
		double depositAmount = keyboard.nextDouble();
		account.deposit(depositAmount);
		System.out.println("Your account balance is " +account.getBalance());
		

	}

}
