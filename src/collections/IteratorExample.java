package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Iterator
		ArrayList<Integer> arlist= new ArrayList<>();
		arlist.add(45);
		arlist.add(5657);
		arlist.add(345);
		arlist.add(345);
		arlist.set(0, 50);		
		//[5657, 345, 345]
		Iterator<Integer> itr= arlist.iterator();
		System.out.println();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		LinkedList<String> list= new LinkedList<>();
		list.add("Satyam");
		list.add("karan");
		list.add("Rahul");
		
		Iterator<String> linkitr= list.iterator();
		while(linkitr.hasNext())
		{
			System.out.println(linkitr.next());
		}
		
		HashMap<String, Integer> countryPopulations = new HashMap<>(); 

		// Insert key-value pairs (order not preserved) 
		//1. It does not maintain insertion order
		//2. It allows only one null key and multiple null values
		countryPopulations.put("India", 1_417_000_000); 
		countryPopulations.put("China", 1_412_000_000); 
		countryPopulations.put("USA", 333_000_000); 
		countryPopulations.put("India", 1_418_000_000); // Updates existing key 
		countryPopulations.put("USA", 45000);
		countryPopulations.put("Russia", 4500343);
		
		// if you want to access all the keys from the map->keySet()
		for(String key: countryPopulations.keySet())
		{
			System.out.print(key+" ");
		}
		System.out.println();
		// Iterator
		// Iterator<Integer> itr= arlist.iterator();
		Iterator<Map.Entry<String, Integer>> itrMap=countryPopulations.entrySet().iterator();
		while(itrMap.hasNext())
		{
			Map.Entry<String, Integer> element=itrMap.next();
			System.out.println("Key:"+element.getKey()+ " Value:"+element.getValue());
		}
		
	}	

}
