package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numbers =  new ArrayList<>();
		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.forEach(n -> System.out.println(n));
		for(String n : numbers) {
			System.out.println(n);
		}
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.stream()
		     .filter(name -> name.startsWith("A"))
		     .forEach(System.out::println);

        List<Integer> integers = Arrays.asList(10, 25, 30, 45, 60);
        List<Integer> filtered = integers.stream()
            .filter(n -> n > 30)
            .collect(Collectors.toList());
        filtered.forEach(n -> System.out.println("Filtered: " + n));

	}

}
