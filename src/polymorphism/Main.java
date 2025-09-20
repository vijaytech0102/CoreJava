package polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTime t1= new CompileTime();
		double result=t1.division(2.3, 2.3);
		int ans=t1.division(10, 5);
		System.out.println(result);
		System.out.println(ans);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int addition= t1.add(a,b);
		System.out.println(addition);
		long d=90;
		long f=89;
		t1.add(d,f);
		String s1="Hello";
		String s2="World";
		String addition_String=t1.add(s1, s2);
		System.out.println(addition_String);
		
	}

}
