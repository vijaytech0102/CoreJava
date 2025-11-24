package Banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankSystem {
	private static List<BankAccount> accounts=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[]args) {
		int choice;

		do {
			System.out.println("\n-----Welcome to My Bank----");
			System.out.println("1. Create Account :");
			System.out.println("2. Perform Transaction:");
			System.out.println("3. Show Account Details :");
			System.out.println("4. Exit");

			System.out.print("Enter Choice :");
			choice=sc.nextInt();

			switch(choice) {
			case 1 -> createAccount();
			case 2-> performTransactions();
			case 3 -> showAccountDetails();
			case 4 -> System.out.println("Exit....");
			default -> System.out.println("Invalid Choice.");
			}
		}
		while(choice!=4);
	}

	private static void performTransactions() {
		// TODO Auto-generated method stub
		sc.nextLine();
		System.out.println("Enter the account number:");
		String accountNumber= sc.nextLine();
		BankAccount obj= findAccount(accountNumber);
		System.out.println("Enter the choice:");
		int choice=sc.nextInt();
		System.out.println("Enter the amount");
		double amount=sc.nextDouble();
		try {
			obj.performTransaction(amount,choice);
		} catch (InvalidAmountException | InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void showAccountDetails() {
		sc.nextLine();
		System.out.println("Enter the Account number");
		String ac=sc.nextLine();
		BankAccount acc=findAccount(ac);
		if(acc==null) {
			System.out.println("Account Not Found..");
			return;
		}
		System.out.println(ac);

	}

	private static BankAccount findAccount(String accountNumber) {
		 
		for(BankAccount a :accounts) {
			if(a.getAccountNumber().equals(accountNumber)) {
				return a;
			}
		}
		return null;
	}


	private static void createAccount() {
		System.out.print("Enter Account Number");
		String accNo=sc.next();

		for(BankAccount acc:accounts) {
			if(acc.getAccountNumber().equals(accNo)) {
				System.out.println("Account Already Exists..");
				return;
			}
		}
		System.out.print("Enter Owner Name :");
		String name=sc.next();

		System.out.println("1. Saving Account");
		System.out.println("2. Current Account");

		System.out.print("Choose Type:");
		int type=sc.nextInt();
		System.out.println("Enter the initial Amount:");
		double amount=sc.nextDouble();
		BankAccount newAcc=null;

		if(type==1) 
		{
			newAcc=new SavingAccount(accNo,name,amount);
		}
		else if(type==2)
		{
			newAcc=new CurrentAccount(accNo,name,amount);
		}
		else 
		{
			System.out.println("Invalid Type");
			return;
		}

		accounts.add(newAcc);
		System.out.println(accounts);
		System.out.println("Account Created Successfully..");

	}
}
