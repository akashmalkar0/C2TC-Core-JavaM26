package collection;


import java.util.*;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> hmap = new LinkedHashMap<>();
		hmap.put(101,"Paul");
		hmap.put(102,"Chetan");
		hmap.put(103,"Derik");
		hmap.put(104,"Logen");
		hmap.put(105,"Becky");
		Set set = hmap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry m = (Map.Entry)it.next();
			System.out.println("Key is : "+m.getKey()+" & Value is : "+m.getValue());
		}
		
				}

}
