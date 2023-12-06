package arraysTest;
import java.util.*;

public class LinkList0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<>();
		list.add(0,"Orange");
		list.add("Apple");
		list.add(2,"Banana");

		LinkedList<Integer> ints=new LinkedList<>();
		ints.add(34);
		ints.add(33);
		ints.add(0,78);

		System.out.println("Linked list element: ");
//		System.out.println(list);
		Iterator<String> it = list.iterator();
		Collections.sort(list);
//		System.out.println(list);
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		/*for(int n =0 ;n<list.size();n++) {
			System.out.println(list.get(n));
		}
		*/
		
		/*for(String s:list) {
			System.out.println(s);
		}
		*/
		
		/*
		int num=0;
		while(list.size()>num) {
			System.out.println(list.get(num));
			num++;
		}
		*/
				
		list.addFirst("First");
		list.addLast("Last");
		System.out.println(list);
		
		ints.addFirst(88);
		ints.addLast(99);
		System.out.println(ints);
//		System.out.println(ints.get(2));
		System.out.println(ints.getFirst());
		System.out.println(ints.getLast());
		
	}

}
