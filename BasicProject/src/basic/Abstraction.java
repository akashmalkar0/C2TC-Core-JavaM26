package basic;

abstract class Parent {
 abstract int run();
}

class Child extends Parent {
	int run() {
		return 0;
	}
}


public class Abstraction {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.run());
	}
}