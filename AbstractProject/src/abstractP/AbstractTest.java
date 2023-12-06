package abstractP;

abstract class Parent{
	abstract void message();
}
class Derived1 extends Parent{
	public void message() {System.out.println("This is First Class");}
}
public class AbstractTest extends Parent{
	public void message() {System.out.println("This is Second Class");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived1 d = new Derived1();
		AbstractTest at = new AbstractTest();
		d.message();
		at.message();
	}

}
