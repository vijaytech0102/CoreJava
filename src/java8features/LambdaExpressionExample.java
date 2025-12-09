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
		
		List<String> digit =  new ArrayList<>();
		digit.add("1");
		digit.add("2");
		digit.add("3");
		List<String> result =  new ArrayList<>();
		
		// One 1
		// two 2
		// three 3
//		numbers.forEach((n)->digit.add(digit.get(digit.indexOf(++j))+" "+numbers.get(numbers.indexOf(n))));
//		result.forEach(n->System.out.println(n));
		
		for(int i=0;i<numbers.size();i++) {
			result.add(numbers.get(i)+" "+digit.get(i));
		}result.forEach(n->System.out.println(n));
//		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//		names.stream()
//		     .filter(name -> name.startsWith("A"))
//		     .forEach(System.out::println);
//
//        List<Integer> integers = Arrays.asList(10, 25, 30, 45, 60);
//        List<Integer> filtered = integers.stream()
//            .filter(n -> n > 30)
//            .collect(Collectors.toList());
//        filtered.forEach(n -> System.out.println("Filtereds: " + n));
//        int a=90;  
	}

}
