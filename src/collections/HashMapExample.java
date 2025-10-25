package collections;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExample { 
	public static void main(String[] args) { 
		
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
		
		//
		countryPopulations.put(null, null);
		countryPopulations.put(null, null);
		System.out.println(countryPopulations);
		
		// get method--> by using key we can access particular value
		System.out.println("Russia Population:"+countryPopulations.get("Russia"));
		// Output varies: {USA=333000000, China=1412000000, India=1418000000} 
		
		// we want to remove china 
		countryPopulations.remove("China");
		
		System.out.println(countryPopulations.containsKey("India"));
		System.out.println(countryPopulations.containsValue(45000));
		
		// Fast lookup (O(1)) 
		System.out.println("Population of India: " + countryPopulations.get("India")); 
			
		// Allows one null key and multiple null values 
//		countryPopulations.put(null, 0); 
		countryPopulations.put("Unknown", null); 
		System.out.println(countryPopulations); // {null=0, USA=333000000, Unknown=null, ...} 
		
		//TreeMap
		//1. Sorted by keys
		//2. It does not allows null key
		
		TreeMap<String,String> company= new TreeMap<>();
		company.put("Karan", "IT");
		company.put("Satyam","CS");
		company.put("Neeraj", "HR");
		company.put("Unknown", null);
		company.put("Unknown2",null);
		System.out.println("Treemap :"+company);
	// write a program to count the frequency of each letter in a string
		String str="Hello,world,welcome,to,java,programming,Hello,to";
		String strArray[]=str.split(",");
		
		for(String s: strArray)
		{
			System.out.print(s+" ");
		}
		//--loop access character by character
		//for(char ch:str.toCharArray())
		// map<Character, Integer>count
		// if( count.containsKey())
		// h:1, e:1, l:3, o:2, w:1 r:1, d:1
		HashMap<String, Integer>frequencyCount= new HashMap<>();		
		
		for(String s: strArray)
		{
			frequencyCount.put(s,frequencyCount.getOrDefault(s,0)+1);
		}
		System.out.println(frequencyCount);
//		//h:1, e:1, l:3, o:2,w:1, r:1, d:1
		
	} 
} 
