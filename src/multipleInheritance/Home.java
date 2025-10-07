package multipleInheritance;

public class Home implements Animal, Bird {
	
	public void eat()
	{
		System.out.println("Eating food");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping");
	}
	public void walk()
	{
		System.out.println("Walking");
	}
}
