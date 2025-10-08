package builtInException;

public class Person {
  int age;

  public Person(int age) throws InvalidAgeException {
	super();
	this.age = age;
	if(age<18)
	{
		throw new InvalidAgeException("Invalid Age");
	}
  }
  
}
