package constructor;

public class Employee extends Student {

	Employee() {
		System.out.println("Employee Constructor call ...");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.display();
	}

}
