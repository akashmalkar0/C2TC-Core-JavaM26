package collection;
import java.util.*;
//Stack class extends vector class which means
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		stack.push("Chetan");
		stack.push("Ajeet");
		stack.push("Hari");
		stack.pop();//last element removed
		stack.push("Steve");
		stack.push("Car1");
		stack.pop();
		System.out.println("Stack Element : "+stack);
		Iterator<String> it = stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
