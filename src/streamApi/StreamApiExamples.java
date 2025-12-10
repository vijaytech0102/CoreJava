package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Intermediate operation
		//filter--> conditional sorting
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().filter(n -> n % 3 == 0).forEach(System.out::println);
		
		// map--> operation or transform
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		num.stream().map(n->n+2).forEach(System.out::println);
		
		//sorted--> element arranged in ascending order
		List<Integer> number = Arrays.asList(3, 1, 4, 2);
		number.stream().sorted().forEach(System.out::println);
		
		List<String> names = Arrays.asList("Alice", "Bob","Ajay");  
		List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperNames);
		//Reduce()
		int sum=numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);
	}

}
