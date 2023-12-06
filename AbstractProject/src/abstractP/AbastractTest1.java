package abstractP;

abstract class Animal {
	abstract void eat();

	abstract void run();

}

abstract class Human extends Animal {
	public void eat() {
		System.out.println("Eating........");
	}

	public void run() {
		System.out.println("Runing.......");
	}

	abstract void speak();

	public static void go() {
		System.out.println("Going.......");
	}

}

interface Test {
	void greet();

	void say();
}

interface Test1 extends Test {
	void greet1();

	void say1();
}

public class AbastractTest1 extends Human implements Test1 {

	void speak() {
		System.out.println("Speaking.....");
	}

	public void greet() {
		System.out.println("Greetinging.....");
	}

	public void say() {
		System.out.println("Saying.....");
	}

	public void greet1() {
		System.out.println("Greetinging.....");
	}

	public void say1() {
		System.out.println("Saying.....");
	}

	public static void main(String[] args) {

		AbastractTest1 a = new AbastractTest1();
		Animal an = new AbastractTest1();

		a.run();
		a.go();

	}

}
