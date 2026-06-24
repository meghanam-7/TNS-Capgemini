package com.tnsif.jdbcpgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletingData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step 2: load and register the driver
		Class.forName("org.postgresql.Driver");

		// step 3: Establish connection
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Peenya", "postgres",
				"postgreMeg");
		System.out.println("Connection completed");

		Statement st = conn.createStatement();

		// DELETING DATA INTO DATABASE
		String sqldelete = "delete from library where sid = 103";
		System.out.println("The SQL Statement is: " + sqldelete);

		int countdeleted = st.executeUpdate(sqldelete);
		System.out.println(countdeleted + " record deleted");

	}

}
