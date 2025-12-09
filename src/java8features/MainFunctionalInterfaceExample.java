package java8features;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MainFunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		Calculator add=(a,b,c)->a+b+c;
//		Scanner sc= new Scanner(System.in);
//		String a,b,c;
//		System.out.println("Enter the value of a, b,c:");
//		a=sc.nextLine();
//		b=sc.nextLine();
//		c=sc.nextLine();
//		System.out.println("Addition: "+add.calculate(a, b,c));
		
		// test(T t): boolean value according to condition--> relational and logical operator  
		Predicate<Integer> isPositive = n -> n>0 && n<1000;
		System.out.println(isPositive.test(5)); // true
		
		// apply(T t): R value after applying some function
		Function<String, String> stringReplace = s -> s.replace("Hello", "hii");
		System.out.println(stringReplace.apply("Hello")); // 5
		  
		
		// accept(T t): performs some operation on the given argument
		Consumer<Integer> greeter = name -> System.out.println("Hello " + name);
		greeter.accept(5); // Hello Alice

		Consumer<Integer> greeter1 = name -> System.out.println(100* name);
		greeter1.accept(5); // Hello Alice

		// get(): returns a value without any input
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get()); // e.g., 0.7234

		// apply(T t): returns a value after applying some operation on the input
		UnaryOperator<Integer> square = n -> n*n;
		System.out.println(square.apply(4)); // 16
		
		// apply(T t, U u): returns a value after applying some operation on two inputs
		BinaryOperator<Integer> ad = (a, b) -> a >> b;
		System.out.println(ad.apply(5, 1)); // 101
											// 101

	}

}
