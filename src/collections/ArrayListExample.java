package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList declaration--> dynamic
		ArrayList<Integer> arlist= new ArrayList<>();
		arlist.add(45);
		arlist.add(5657);
		arlist.add(345);
		arlist.add(345);
		arlist.set(0, 50);
		System.out.println(arlist.get(0));
		System.out.println(arlist.contains(45));
		System.out.println(arlist.remove(0));
		System.out.println(arlist);
		System.out.println(arlist.indexOf(345));
		
		// foreach
		for(Integer num:arlist)
		{
			System.out.print(num+" ");
		}
		// Iterator
		//[5657, 345, 345]
		Iterator<Integer> itr= arlist.iterator();
		System.out.println();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		ArrayList<Integer> list1= new ArrayList<>();
		list1.add(45);
		list1.add(56);
		list1.add(78);
		list1.add(89);
		list1.add(67);
		
		ArrayList<Integer> list2= new ArrayList<>();
		list2.add(566);
		list2.add(45);
		list2.add(56);
		list2.add(56667);
		list2.add(56689);
		
		System.out.println(list2);
		for(Integer ele:list1)
		{
			list2.add(ele);
		}
		System.out.println(list2);
		list2.add(67);
		
		// How to remove duplicates in the arraylist  time complexity(n^2)
		for(int i=0; i<list2.size(); i++)
		{
			for(int j=i+1; j<list2.size(); j++)
			{
//				System.out.println(list2.get(i)==(list2.get(j)));
				System.out.println("i:"+i+"j:"+j);
				/*
				 * System.out.println("element using i index:"+list2.get(i));
				 * System.out.println("element using j index:"+ list2.get(i));
				 */
				if(list2.get(i).equals(list2.get(j)))
				{
					list2.remove(j);
				}
			}
		}
		System.out.println(list2);
		HashSet<Integer> set= new HashSet<>();
		int find=45;
		
		// Searching an element in the arraylist time complexity(n^1)
		for(int i=0; i<list2.size(); i++)
		{
			if(find==list2.get(i))
			{
				System.out.println("Element found at index:"+i+"Position:"+(i+1)+":"+list2.get(i));
				break;
			}
		}
		//How to sort an arrayList
		// Using bubble sort, selection sort, insertion sort--> time complexity(n^2)
		// Using collection method sort()
		ArrayList<Integer> list4= new ArrayList<>();
		list4.add(56);
		list4.add(57);
		list4.add(123);
		list4.add(5);
		list4.add(8);
		System.out.println(list4);
		// Sorting technique in the Collection
		Collections.sort(list4);
		
		System.out.println(list4);
		
		
	}

}
