package exception;

public class Test_Exception extends Exception {
	public String toString() {
		return super.toString() + " I am String";
	}

	public String getMessage() {
		return super.getMessage() + " I am message";
	}

	public static int divide(int a, int b) throws ArithmeticException {
		int c = a / b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		/*
		 * try { int a = 4/0; System.out.println(a); } catch (Exception e) {
		 * System.out.println(e); }
		 */

		/*
		 * try { throw new Test_Exception();
		 * 
		 * }catch(Exception e) { System.out.println(e.getMessage());
		 * System.out.println(e.toString()); // System.out.println(e); // e give
		 * toString method same output e.printStackTrace();
		 * 
		 * }
		 */
		try {
			divide(4, 0);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
