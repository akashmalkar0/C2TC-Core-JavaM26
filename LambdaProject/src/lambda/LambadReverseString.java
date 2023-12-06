package lambda;
interface MyInterfce1{
	void reverse(String str);
}

public class LambadReverseString {

	public static void main(String[] args) {
		MyInterface s = (String st)->{
			String result = "";
			for(int i=st.length()-1
					;i>=0;i--) {
				result+=st.charAt(i);
			}
			return result;
		};
		String ans = s.reverse("Akash");
		System.out.println(ans);
	}

}
