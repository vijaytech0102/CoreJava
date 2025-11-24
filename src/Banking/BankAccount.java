package Banking;

//kuch cheeze common hai accountNumber,ownerName,balance

public abstract class BankAccount implements Transactionable{
	protected String accountNumber;
	protected String ownerName;
	protected double balance;
	
	public BankAccount(String ac,String  o,double b) {
		this.accountNumber=ac;
		this.ownerName=o;
		this.balance=b;
	}
	
	public abstract void deposit(double amount) throws InvalidAmountException;
	
	//but withdraw()har account mein different chalega isliye abstract method..

	public abstract  void withdraw(double amt) throws InvalidAmountException, InsufficientBalanceException;
	
	public abstract void displayDetails();
	
	protected abstract String getAccountNumber();
	protected abstract String getOwnerName();
	protected abstract Double getBalance();

	
	

}
