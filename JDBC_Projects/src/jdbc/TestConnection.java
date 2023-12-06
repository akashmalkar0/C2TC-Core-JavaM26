package jdbc;

import java.sql.*;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage", "root", "Akash@123");
			Statement st = con.createStatement();

			String str = ("create table employee(name varchar(255) , age integer, salary float) ");
			int i = st.executeUpdate(str);
			System.out.println("Table created " + i);

			ResultSet rs = st.executeQuery("select * from manager");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3));
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
