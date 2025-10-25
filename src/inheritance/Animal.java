package inheritance;

import java.util.Scanner;

class Animal {
	
	String name;
	
	void eat() {
		System.out.println("Eating...");
	}
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the name:");
		name=sc.nextLine();
	}

	void details()
	{
		System.out.println("Name:"+name);
	}
}
