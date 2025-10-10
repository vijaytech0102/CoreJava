package userDefinedExceptions;

public class InsufficientFund extends Exception {

	public InsufficientFund(String message) {
		super(message);
	}
}
