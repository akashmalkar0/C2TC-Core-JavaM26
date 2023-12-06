package collection;
import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(101,"Paul");
		hmap.put(102,"Ram");
		hmap.put(103,"Aaron");
		hmap.put(104,"Leo");
		hmap.put(105,"Becky");
		Set set = hmap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry m = (Map.Entry)it.next();
			System.out.println("Key is : "+m.getKey()+" & Value is : "+m.getValue());
		}
		
				}

}
