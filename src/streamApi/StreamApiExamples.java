package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// how to handle---> 1. convert the collection into streams, 2. Apply in intermediate operation, 3. Apply terminal operation to streams
		// we can use more one intermediate operation
		// We can skip intermediate operation
		
		// Intermediate operation
		//1.filter--> conditional sorting
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().filter(n -> n % 3 == 0).forEach(System.out::println);
		
		// 2.map--> operation or transform
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		num.stream().map(n->n+2).forEach(System.out::println);
		
		//3.sorted--> element arranged in ascending order
		List<Integer> number = Arrays.asList(3, 1, 4, 2);
		number.stream().sorted().forEach(System.out::println);
		
		List<String> names = Arrays.asList("Alice", "Bob","Ajay");  
		List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperNames);
		    
		
		//4.Distinct()
		List<Integer> list = Arrays.asList(10, 20, 10, 30, 20);
		List<Integer> unique = list.stream().distinct().toList();
		System.out.println(unique);
		
		//6.limit()
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

		//7.peek()
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
	    
	    
	 // Terminal Operation
	 		//Reduce()
	 		Optional<Integer> sum=numbers.stream().reduce((a,b)->a+b);
	 		System.out.println(sum);
	 		
	    
	    
	    // remove the duplicates from the list and square each element in the list  
	    List<Integer> numberss=Arrays.asList(1,2,3,4,2,3,4);
	    // 0->1, 1->2, 2->3, 3->4, 4->2
	    //  Using Stream API print the duplicate elements from the list
	    // explaination:
	    // 1. Convert the list to a stream using the stream() method.
	    // 2. Use the filter() method to filter out the elements that are duplicates.	
	    //    The condition inside the filter checks if the index of the first occurrence of the element
	    //    is different from the index of the last occurrence of the element in the list.
	    // 3. Use the distinct() method to ensure that each duplicate element is printed only
	     List<Integer> dup=numberss.stream()  
	            .filter(n -> numberss.indexOf(n) != numberss.lastIndexOf(n))  
	            .distinct()  
	            .toList();
	     System.out.print(dup);
	     //--> visit each element store it in 1D array
	     //[[1,3,3],
	     // [1,2,3],
	     // [1,3,5]]
	     
	}
}
