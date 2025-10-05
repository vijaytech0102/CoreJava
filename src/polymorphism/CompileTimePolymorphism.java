package polymorphism;

public class CompileTimePolymorphism {
		// method overloading // 
	// method define
	void message()
	{
		System.out.println("Compile time polymorphism");
	}
	
	String message(String m)
	{
		return m;
	}
	
	String message(String m,String k)
	{
		return m+k;
	}
	public static void main(String[] args)
	{
		CompileTimePolymorphism obj= new CompileTimePolymorphism();
		obj.message();
		// calling message method
		String str= obj.message("Hello World");
		String ans=obj.message("Compile", "Time Polymorphism");
		System.out.println(ans);
		System.out.println(str);
		System.out.print(false);
	
	//1.Encapsulation--> Binding of data member and member into a single unit--> class and object
	//2.Inheritance--> Acquiring all the properties and behavior from one class to another class
	//3.Polymorphism--> Data or message can be represented in more than one form is known as Polymorphism
	//4.Data Abstraction/ Data Hiding --> To know the essential part of the program without knowing background implementations.
	//5.Constructor --> It is a method having same as class name and used to intialize an object.
	//6.Pojo--> It must have private fields, constructor, getter and setter, toString(), hashcode().
	//7. Exception Handling -->
	//8. Collections-->
	//9. Thread--> Multithreading
	//10.String 
		
	}
}
