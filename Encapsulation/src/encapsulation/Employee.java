package encapsulation;

public class Employee {
	private int id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Akash");
		System.out.println(e1.getId()+" "+e1.getName());
		System.out.println(new Employee().id); // Anonymous Object
		
	}
}
