package collection;
import java.util.*;

// Hashtable in java with example
//the class implements a hash table , which maps  key to value . Any non-null
// objevct can be used as a key or as value HashTable is similar to Hashmap 
//Exception it is Synchronized 

public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumeration names;
		String key;
		// creating hashtable
		Hashtable<String,String> h = new Hashtable<String, String>();
		h.put("key1", "Jhon");
		h.put("key2", "Max");
		h.put("key3", "Ajeet");
		h.put("key4", "Peter");
		h.put("key5", "Mona");
		
		names =h.keys();
		while(names.hasMoreElements()) {
			key = (String) names.nextElement();
			System.out.println("Key : "+key+" & Value : "+h.get(key));
		}
		/*
		 * OR
		Set set = h.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry m = (Map.Entry)it.next();
			System.out.println("Key is : "+m.getKey()+" & Value is : "+m.getValue());
		}
		*/


	}

}
