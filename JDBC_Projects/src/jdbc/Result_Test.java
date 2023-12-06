package jdbc;

import java.sql.*;

public class Result_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/collage";
		String user = "root";
		String pass = "Akash@123";
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage", "root", "Akash@123");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from manager");
			ResultSetMetaData smt = rs.getMetaData();
			int n = smt.getColumnCount();
			while(rs.next()) {
				for (int i=1;i<=n;i++) {
					System.out.println(smt.getColumnName(i));
					System.out.println(rs.getString(i));
					System.out.println(smt.getColumnTypeName(i));
				}
			}
			

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
