package collections;

import java.util.Stack;
import java.util.Vector;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Rule--> Last in first out/ First in last out 
		// push() --> element add 
		// pop()--> element remove
		// peek() --> top element in the stack
		Stack<Integer> st= new Stack<>();
		
		//element add in the stack --> add()/ push()
		st.add(45);
		st.add(56);
		st.add(78);
		st.add(90);
		st.add(53);
		st.push(78);
		
		System.out.println(st);
		
		// remove an element from the stack
		st.pop();
		System.out.println(st);
		
		// peek()
		System.out.println(st.peek());
		
		Vector<Integer> vc= new Vector<>();
		
		vc.add(56);
		vc.add(78);
		vc.add(78);
		vc.add(0);
		
		System.out.println(vc);

	}

}
