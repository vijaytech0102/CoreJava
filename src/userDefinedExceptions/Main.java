package userDefinedExceptions;

public class Main {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		try {
			Person p1= new Person(12);
		}catch(Exception e)
		{
			System.out.print(e.getMessage());
		}

	}
}
