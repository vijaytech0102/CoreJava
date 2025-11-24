package Banking;

import java.util.Scanner;

//minimum balance 1000rs. required....

public class CurrentAccount extends BankAccount {
	public CurrentAccount(String accountNumber,String ownerName,double balance) {
		super(accountNumber,ownerName,balance);
	}
	
	@Override
	public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException{
		if(amount<=0) throw new InvalidAmountException("Amount must be positive.");
		
		if(balance-amount<1000) throw new InsufficientBalanceException("Minimum balance Rs.1000 required.");
		balance-=amount;
		System.out.println(amount+"withdrawn from current account.");
	}
	
	@Override
	public void performTransaction(double amount, int ch) throws InvalidAmountException, InsufficientBalanceException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		if(ch==1)
		{
			deposit(amount);
		}
		if(ch==2)
		{
			withdraw(amount);
		}
	}
		
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public Double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) throws InvalidAmountException {
		if(amount<=0)
		{
			throw new InvalidAmountException("Invalid Amount");
		}
		balance+=amount;
	}
	
	@Override
	public String toString() {
		return "CurrentAccount [accountNumber=" + accountNumber + ", ownerName=" + ownerName + ", balance=" + balance
				+ "]";
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub

	}
	

}
