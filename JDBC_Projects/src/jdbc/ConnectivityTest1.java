package jdbc;

import java.sql.*;

public class ConnectivityTest1 {

	public static void main(String[] args) {

		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage", "root", "Akash@123");

			// Insert values
			// PreparedStatement st = con.prepareStatement("insert into manager values(?,?,?)");
//			st.setInt(1, 13);
//			st.setString(2, "Max");
//			st.setFloat(3, 4898);
//			int i = st.executeUpdate();
//			System.out.println("value inserted");

//			Delete row from table
//			PreparedStatement st = con.prepareStatement("DELETE FROM manager WHERE id=13");
//			int i = st.executeUpdate();
//			System.out.println("1 Record Deleted");

//			Update new values
			PreparedStatement st = con.prepareStatement("update manager set name='Pravin' WHERE id=22");
			int i = st.executeUpdate();
			System.out.println("Value Updatede");

			ResultSet rs = st.executeQuery("select * from manager");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3));
			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
