package collection;

import java.util.*;

class Student_112 {

	int rollno;
	String name, address;

	public Student_112(int rollno, String name, String address) {

		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public String toString() {

		return this.rollno + " " + this.name + " " + this.address;
	}
}

class Sortbyroll implements Comparator<Student_112> {

	public int compare(Student_112 a, Student_112 b) {

		return a.rollno - b.rollno;
	}
}

class Sortbyname implements Comparator<Student_112> {

	public int compare(Student_112 a, Student_112 b) {

		return a.name.compareTo(b.name);
	}
}

public class ComaratorTest {

	public static void main(String[] args) {

		ArrayList<Student_112> ar = new ArrayList<Student_112>();

		ar.add(new Student_112(110, "Mayank", "Uk"));
		ar.add(new Student_112(132, "Akshay", "Pune"));
		ar.add(new Student_112(101, "Sonu", "Jaipur"));
		ar.add(new Student_112(109, "Vikas", "Nashik"));

		System.out.println("Unsorted");

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyroll());

		System.out.println("\nSorted by rollno");

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyname());

		System.out.println("\nSorted by name");

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
	}
}