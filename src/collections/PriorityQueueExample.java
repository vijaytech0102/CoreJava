package collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// by default --> It behaves like min- heap
		// Max heap using comparator
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		pq.add(1);
		pq.add(5);
		pq.add(3);
		pq.add(2);
		pq.add(6);
		pq.add(0);
		pq.offer(78);
		System.out.println(pq);
//		System.out.println(pq.peek());
//		pq.remove();
//		System.out.println(pq.peek());
//		System.out.println(pq);
		// traversing of each element in the queue
		while(!pq.isEmpty())
		{
			System.out.println(pq.peek());
			pq.remove();
		}
		pq.clear();
	}

}
