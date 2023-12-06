package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver_Version_Info {

	public static void main(String[] args) {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage", "root", "Akash@123");
			Statement stmt = con.createStatement();
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println("Driver Name : "+dbmd.getDriverName());
			System.out.println("Driver Name : "+dbmd.getDriverVersion());
			System.out.println("Driver Name : "+dbmd.getUserName());
			System.out.println("Driver Name : "+dbmd.getDatabaseProductName());
			System.out.println("Driver Name : "+dbmd.getDatabaseProductVersion());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
