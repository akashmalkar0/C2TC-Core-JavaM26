package collection;

import java.util.*;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("Amit Mishra");
		q.add("Vijay Raj");
		q.add("Raj Travidi");
		q.add("Vikram");
		System.out.println("head: " + q.element());
		System.out.println("head: " + q.peek());
		System.out.println("Iterating the Queue elements");
		Iterator it = q.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
//		q.remove("Vikram"); // remover
		q.remove(); // first element removed
		q.poll();// delete first element
		System.out.println("After removing : ");
		Iterator<String> itr = q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
