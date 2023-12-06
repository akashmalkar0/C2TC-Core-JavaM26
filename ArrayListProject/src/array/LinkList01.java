package array;import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<>();
		list.add(0,"orange");
		list.add("Apple");
	
		System.out.println("Linked list element: ");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
