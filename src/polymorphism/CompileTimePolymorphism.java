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
	}
}
