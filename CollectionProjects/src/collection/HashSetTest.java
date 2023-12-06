package	collection;
import java.util.*;
// HashSet does not maintain insertion order
public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("Paul");
		set.add("Ram");
		set.add("Aaron");
		set.add("Leo");
		set.add("Becky");
		set.add("Leo");
		
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	

	}

}
