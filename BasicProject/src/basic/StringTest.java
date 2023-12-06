package basic;

public class StringTest {

	public static void main(String[] args) {
		// Two ways of string create
		String st = "Max";
		String str = new String("Pravin");
		System.out.println(str);
		System.out.println(str.substring(1,3));
		st.concat("Akash");
		// String is immutable
		System.out.println(st);
		
	}

}
