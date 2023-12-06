package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Add_Batch_Test {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage", "root", "Akash@123");
			Statement stmt = con.createStatement();
			String s1 = "insert into manager values(11,'Vijay',4567)";
			boolean s = stmt.execute(s1);
			int n = stmt.executeUpdate(s1);
			System.out.println(s + " " + n);
			stmt.addBatch("insert into manager values(13,'Pranav',5684)");
			stmt.executeBatch();
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
