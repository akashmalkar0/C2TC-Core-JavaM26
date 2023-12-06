package collection;

import java.util.*;

public class DequeTest {

	public static void main(String[] args) {
		// creating deque and adding elements
		Deque<String> d = new ArrayDeque<String>();
		d.add("Karan");
		d.add("Abhishek");
		d.add("Ajay");
//		Traversing elements
		for (String str : d) {
			System.out.println(str);
		}
		System.out.println("\n");
		d.remove();
		for (String str : d) {
			System.out.println(str);
		}
	}

}
