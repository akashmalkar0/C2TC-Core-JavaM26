package collection;

import java.util.*;

public class CompareTest {

	public static void main(String[] args) {
		ArrayList<Student_01> al = new ArrayList<Student_01>();
		al.add(new Student_01(101,"Vijay",23));  
		al.add(new Student_01(106,"Ajay",27));  
		al.add(new Student_01(105,"Jai",21)); 
		Collections.sort(al);
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			Student_01 st = (Student_01)it.next();
			System.out.println(st.rollNo+" "+st.name+" "+st.age);  
		}
	}

}
