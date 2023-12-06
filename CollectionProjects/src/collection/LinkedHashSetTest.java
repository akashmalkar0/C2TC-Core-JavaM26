package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
//linked hash set maintain insertion order
public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set =new LinkedHashSet<>();
		set.add("Paul");
		set.add("Ram");
		set.add("Aaron");
		set.add("Leo");
		set.add("Becky");
		set.remove("Ram");
		
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
