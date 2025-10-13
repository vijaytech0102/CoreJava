package collections;

import java.util.ArrayList;
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
		
	}

}
