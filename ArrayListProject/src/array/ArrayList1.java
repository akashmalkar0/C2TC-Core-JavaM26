package array;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Cricket");
		arr.add(0,"Hollyball");
		arr.remove(0);
		arr.add(0,"Basketball");
		for(String a:arr) {
			System.out.println(a);
		}System.out.println(arr.get(1));
	}

}
