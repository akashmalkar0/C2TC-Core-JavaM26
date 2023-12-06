package basic;

public class MethodTest {
	public static int test(int a) 	{
		return a;
	}
	int test2(int a) {
		return a;
	}

	public static void main(String[] args) {
//		for static method no need to create object
		System.out.println(MethodTest.test(45));
		
		MethodTest mt =new MethodTest();
		System.out.println(mt.test2(67));
		
		
	}

}
