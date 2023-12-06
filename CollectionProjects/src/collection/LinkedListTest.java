package collection;
import java.util.*;
// converting of linkedlist to arraylist
public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String>  lklist =new LinkedList<String>();
		lklist.add("Harry");
		lklist.add("Jack");
		lklist.add("Tim");
		lklist.add("Rick");
		lklist.add("Rock");
		List<String> list =new ArrayList<String>(lklist);
		for(String str:list) {System.out.println(str);}

	}

}
