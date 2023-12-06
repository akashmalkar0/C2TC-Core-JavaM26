package jdbc;

import java.util.*;

import java.sql.*;

class Employee {
	String name;
	int age;
	float salary;

	Employee(String name, int age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String toString() {
		return "Name : " + name + " Age : " + age + " Salary : " + salary;
	}
}

public class EmployeeDatabase {
	static boolean dataAvailable(String name) throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/collage";
		String USER = "root";
		String PASS = "Akash@123";
		Connection con = DriverManager.getConnection(URL, USER, PASS);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
		ResultSetMetaData smt = rs.getMetaData();
		int n = smt.getColumnCount();

		// Check if the column exists
		for (int i = 1; i <= n; i++) {
			String columnName = smt.getColumnName(i);
			if (columnName.equalsIgnoreCase(name)) {
				con.close(); // Close resources
				return true; // Column found
			}
		}

		con.close(); // Close resources
		return false; // Column not found
	}

	public static void main(String[] args) throws SQLException {
		final String URL = "jdbc:mysql://localhost:3306/collage";
		final String USER = "root";
		final String PASS = "Akash@123";
		Connection con = DriverManager.getConnection(URL, USER, PASS);
		PreparedStatement st = con.prepareStatement("insert into employee values(?,?,?)");

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Prakash", 19, 54000));
		al.add(new Employee("Vijay", 21, 41000));
		al.add(new Employee("Arun", 26, 49000));

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Employee em = (Employee) itr.next();
			if ((dataAvailable(em.name))==false) {
				st.setString(1, em.name);
				st.setInt(2, em.age);
				st.setFloat(3, em.salary);
				int i = st.executeUpdate();
				System.out.println(em.name + " " + em.age + " " + em.salary);
			}
		}

	}

}
