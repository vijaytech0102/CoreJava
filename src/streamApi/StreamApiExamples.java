package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
		Optional<Integer> sum=numbers.stream().reduce((a,b)->a+b);
		System.out.println(sum);
		
		// Distinct()
		List<Integer> list = Arrays.asList(10, 20, 10, 30, 20);
		List<Integer> unique = list.stream().distinct().toList();
		System.out.println(unique);
		
		//limit()
		List<Integer> firstThree = list.stream().distinct()
		        .limit(3)
		        .map(n->n*n).map(n->n/100)
		        .toList();
		System.out.println(firstThree);
		
		List<Integer> slist = Arrays.asList(10, 20, 30, 40, 50, 60);

		List<Integer> skipped = slist.stream()
		        .skip(3)
		        .limit(2)
		        .toList();

		System.out.println(skipped);

		List<Integer> plist = Arrays.asList(10, 20, 30);
		List<Integer> result = plist.stream()
		        .peek(n -> System.out.println("Processing: " + n))
		        .map(n -> n * 2)
		        .toList();
		System.out.println(result);
		
		String s="123";
		String d="345";
		System.out.println(s+d);
		int dd=Integer.parseInt(d);
	    int aa=Integer.parseInt(s);
	    System.out.println(aa+dd);
	    // remove the duplicates from the list and square each element in the list  
	    List<Integer> numberss=Arrays.asList(1,2,3,4,2,1,2,3,4,3,4,3,4,3);

	}

}
