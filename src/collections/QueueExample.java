package collections;

import java.util.LinkedList;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First in First Out
		// Queue as linked List 
		Queue<String> que= new LinkedList<String>();
		
		// adding an element
		que.add("Hello");
		que.add("world");
		que.add("welcome");
		que.add("to");
		que.add("java programming");
		System.out.println(que);
		
		// remove an element
		que.remove();
		System.out.println(que);
		
		//peek --> top element point out--> first element in the queue
		System.out.println(que.peek());
		
		// remove--> top element from the queue 
		que.poll();
		System.out.println(que);
		
		while(!que.isEmpty())
		{
			// top element point
			System.out.println(que.peek());
			// top element remove
			que.poll();
		}
	}

}
