package arraysTest;

import java.util.ArrayList;

public class ArrayListInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0,15);
		arr.add(1,16);
//		arr.remove(0);
		
		for(int a:arr) {
			System.out.println(a);
		}
		
	}

}
