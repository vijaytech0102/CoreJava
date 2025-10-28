package string;

public class StringBuilderExample {
	public static void main(String[] args) {

		//concatenation--> + when we are adding two or more string
		// string can not modified
		String str="Hello";
		str+="World";
		System.out.println(str);

		//concatenation--> using append() method
		// mutable-> string can be modified
		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder name= new StringBuilder("Karan ");
		//concatenation
		sb.append(" World");
		System.out.println(name.append(sb));
		System.out.println(sb.toString());  // Output: Hello World

		//String buffer
		// mutable --> string can be modified--> concatenation--> using append()
		StringBuffer s=new StringBuffer("Hii");
		//concatenation
		s.append(" Welcome to String");
		System.out.println(s);

		//length()
		int a=s.length();
		System.out.println("Size of s:"+a);

		//stirngname.charAt();
		String nam = "Alice world java";
		System.out.println("Result of Startswith method:"+nam.startsWith("Alice"));
		System.out.println("Result of endswith method:"+nam.endsWith("java"));
		if (Character.isUpperCase(nam.charAt(0))) {
			System.out.println("Name starts with a capital letter.");
		}
		System.out.println(nam.charAt(nam.length()-1));

		for(char c:nam.toCharArray())
		{
			System.out.println(c);
		}

		String rev[]=nam.split(" ");
		
		//0-index==> Alice, 1==> world, 2==> java
		// i--> index rev[i]--> element, rev--> array
		for(int i=rev.length-1; i>=0; i--)
		{
			System.out.print(rev[i]);
//			System.out.println(nam[i]);
		}
		System.out.println();
		//substring(starting index, end index)
		String email = "user@example.com";
		String domain = email.substring(email.indexOf("@") + 1);
		System.out.println(domain); // example.com

		//equals()
		String inputPassword="123456";
		String storedPassword="123456";
		if (inputPassword.equals(storedPassword)) {
			System.out.println("Login successful.");
		}

		else {
			System.out.println("Wrong Password");
		}

		if(inputPassword==storedPassword)
		{
			System.out.println("Reference same");
		}

		//equalIgnoreCase()
		String inputEmail="Vijay0102@gmail.com";
		String storedEmail="vijay0102@gmail.com";
		if (inputEmail.equalsIgnoreCase(storedEmail)) {
			System.out.println("Email matched.");
		}
		//trim()--> remove space from left or right side
		String username = "  admin  ";
		System.out.println(username.trim()); // "admin"

		//contains--> if present then it return true otherwise false
		String description = "This phone has a great camera.";
		if (description.contains("camera")) {
			System.out.println("Camera feature found.");
		}
		
		String input = "";
		System.out.println(input.isEmpty()); // true

		String csv = "apple,banana,grape";
		String[] fruits = csv.split(","); // string array 
		System.out.println(fruits[0]);

		
		String fruit = String.join("hello", fruits);
		System.out.println(fruit);
		
		String strres[]=fruit.split("hello");
		for(String k:strres)
		{
			System.out.println(k);
		}

		// Write a progaram to remove all the space pressent in the string and join the string with comma 
		String  strq= "Hello world welcome to java programming";
		String arrr[]= strq.split(" ");
		String ans= String.join(",", arrr);
		
		System.out.println(ans);
		
		
		//1. Java is a programming language--> language programming is a Java
		//2. java is a fun -->> Java Is A Fun
		//3. 20-01-2025--> 20/01/2025
		//4.
		System.out.println();
		String sr= "Hello world welcome to java programming";// gnimmargorp
				// 0->h, 1->e ,2->3
		char[] ch=sr.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println(ch.length);
		// Write a program to capitalize each character in a string
		// input--> hello world=> 	HELLO WORLD
		//
		String op="HELLO WOLRD";
		System.out.println(op.toUpperCase());
		//
		
		char chr[]=op.toCharArray();
		for(int i=0; i<chr.length; i++)
		{
			char k=chr[i];
			if(k!=32)
			{
			k=(char) (k+32);
			}
			System.out.print(k);
//			System.out.print(chr[i]);
		}
		
		
	}

}
