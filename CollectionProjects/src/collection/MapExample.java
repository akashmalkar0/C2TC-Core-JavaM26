package collection;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Vijay");
		map.put(123, "Pranav");
		map.put(122, "Vijay");// duplicate key not allowed duplicate values are allowed
		map.put(103, "Ram");
		map.put(123, "Ramesh");
		map.put(null, null);
		map.put(null, "Ajay");
		for (Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		map.replace(103, "Aditya");
		map.replaceAll((K,V)->"Ajay");
		for (Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
