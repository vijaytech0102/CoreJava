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
        String nam = "Alice";
        if (Character.isUpperCase(nam.charAt(0))) {
            System.out.println("Name starts with a capital letter.");
        }
        System.out.println(nam.charAt(nam.length()-1));
        
        for(char c:nam.toCharArray())
        {
        	System.out.println(c);
        }
        
        for(int i=0; i<nam.length(); i++)
        {
        	System.out.println(nam.charAt(i));
        }
        
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
        
        String csv = "apple,banana,grape";
        String[] fruits = csv.split(" ");
        System.out.println(fruits[0]);
        
        String input = "";
        System.out.println(input.isEmpty()); // true

    }
}
