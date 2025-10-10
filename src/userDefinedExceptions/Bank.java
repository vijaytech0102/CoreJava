package userDefinedExceptions;

public class Bank {
	String CustomerName;
	int balance;
	
	public Bank(String customerName, int balance) {
		super();
		CustomerName = customerName;
		this.balance = balance;
	}
	
	 public void deposit(int amount) throws InvalidAmount
	{
		if(amount<0)
		{
			throw new InvalidAmount("Invalid Amount.....\n");
		}
		else
		{
			this.balance=this.balance+amount;
		}
	}
	
	public void withdraw(int amount) throws InsufficientFund
	{
		if(amount>this.balance)
		{
			throw new InsufficientFund("Low Balance.......\n");
		}
	}

	
	
}
