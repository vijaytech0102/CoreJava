package inheritance;

class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}

	void bark() {
		System.out.println("Barking...");
	}
	
	public static void main(String[] args)
	{
		Animal animal= new Animal("Leo");
		
		Dog obj= new Dog("leo");		
		obj.eat();
		obj.details();
		animal.details();
		obj.name="kk";
	}
}
