package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample { 
    public static void main(String[] args) { 
        
    	ArrayList<Integer> arlist= new ArrayList<>();
		arlist.add(45);
		arlist.add(5657);
		arlist.add(345);
		arlist.add(345);
		arlist.set(0, 50);
    	
		
		// set does allow duplicate elements
		// It can store one null value
		//It does not maintain order
		Set<Integer>newList= new HashSet<>();
		
		for(int a:arlist)
		{
			newList.add(a);
		}
		newList.add(null);
		newList.add(null);
		System.out.println(newList);
		
		// Set
    	HashSet<String> fruits = new HashSet<>(); 
    	fruits.add("Apple"); 
        fruits.add("Banana"); 
        fruits.add("Apple"); // Duplicate ignored 
        fruits.add("Orange");
        System.out.println("Set: " + fruits); // Output: [Apple, Banana] 
        
        //TreeSet--> sorted and no duplicates elements
        // does not preserve order--> but create natural order
        TreeSet<String>data= new TreeSet<>();
        data.add("Hello");
        data.add("Rahul");
        data.add("Karan");
        System.out.println(data);
        
        TreeSet<Integer>numbers= new TreeSet<>();
        numbers.add(2);
        numbers.add(452);
        numbers.add(23);
        numbers.add(23);
        numbers.add(234);
        numbers.add(2677);
        System.out.println(numbers);
        
        //LinkedHashSet--> maintain insertion order
        LinkedHashSet<Integer> list= new LinkedHashSet<>();
        list.add(23);
        list.add(256);
        list.add(67);
        list.add(89);
        list.add(563);
        System.out.println(list);
        
        
        
        
    } 
}