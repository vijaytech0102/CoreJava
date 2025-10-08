package abstraction;

class Dog extends Animal { 
	
	@Override 
	void sound() 
	{ 
		System.out.println("Bark"); 
	} 
	
	void sleep()
	{
		System.out.print("Sleeping");
	}
	
	public static void main(String args[])
	{
		Dog animal1= new Dog();
		animal1.sound();
		animal1.sleep();
	}
} 