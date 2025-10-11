package userDefinedExceptions;

public class BankSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank user= new Bank("Karan", 1500);
		try {
			user.deposit(-90);
		}catch(InvalidAmount e)
		{
			System.out.print(e.getMessage());
		}
		
		try {
			user.withdraw(2000);
		}catch(InsufficientFund e)
		{
			System.out.print(e.getMessage());
		}
	}

}
