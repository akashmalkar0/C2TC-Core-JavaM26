package collection;

import java.util.*;

class Student_11 {
	int rollNo;
	String name;
	int age;

	Student_11(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
}

public class ArrayListUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_11 s1 = new Student_11(1, "Mahesh", 21);
		Student_11 s2 = new Student_11(2, "Ajay", 19);
		Student_11 s3 = new Student_11(21, "Abhi", 23);

		ArrayList<Student_11> al = new ArrayList<Student_11>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		Iterator it = al.iterator();
		while (it.hasNext()) {
			Student_11 st = (Student_11) it.next();
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}

	}

}
