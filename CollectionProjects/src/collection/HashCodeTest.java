package collection;

import java.util.*;

class Employee {
	private String name;
	private int salary;
	private int id;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSallary() {
		return salary;
	}

	public void setSallary(int sallary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "Id:" + this.id + " Name:"+this.name+" Salary :"+this.salary;
	}

	public int HashCode() {
		System.out.println("In hashcode");
		return this.getId();
	}

	public boolean equals(Object obj) {
		Employee e = null;
		if (obj instanceof Employee) {
			e = (Employee) obj;
		}
		System.out.println("In equals");
		if (this.getId() == e.getId()) {
			return true;
		} else {
			return false;
		}
	}
}

public class HashCodeTest {

	public static void main(String[] args) {
		HashSet<Employee> hset = new HashSet<Employee>();
		hset.add(new Employee(1,"Jai",50000));
		hset.add(new Employee(2,"Mahesh",60000));
		hset.add(new Employee(21,"Vishal",55000));
		hset.add(new Employee(13,"Hemant",97000));
		hset.add(new Employee(1,"jai",50000));
		for(Employee e : hset) {
			System.out.println(e);
		}
	}

}
