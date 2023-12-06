package arraysTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Cricket");
		arr.add("Hollyball");
		arr.add("Basketball");
		arr.add("Jockey");
		System.out.println("Before Sorting : "+arr);
		Collections.reverse(arr);
		System.out.println("After Sorting : "+arr);
		
	}

}
