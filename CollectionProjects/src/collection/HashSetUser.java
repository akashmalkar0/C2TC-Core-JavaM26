package collection;
import java.util.*;
public class HashSetUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_11 s1 = new Student_11(1, "Mahesh", 21);
		Student_11 s2 = new Student_11(2, "Ajay", 19);
		Student_11 s3 = new Student_11(21, "Abhi", 23);

		HashSet<Student_11> set = new HashSet<Student_11>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s1);
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Student_11 st = (Student_11)itr.next();
			System.out.println(st.rollNo+" "+ st.name+" "+ st.age);
		}

	}

}
