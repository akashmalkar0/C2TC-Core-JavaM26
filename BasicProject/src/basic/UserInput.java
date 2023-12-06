package basic;
import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("Enter Name");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str);
		System.out.println("Enter Number");
		int i = sc.nextInt();
		System.out.println(i);

	}

}
