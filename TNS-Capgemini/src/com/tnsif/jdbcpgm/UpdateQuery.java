package com.tnsif.jdbcpgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step 2: load and register the driver
		Class.forName("org.postgresql.Driver");

		// step 3: Establish connection
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Peenya", "postgres",
				"postgreMeg");
		System.out.println("Connection completed");

		Statement st = conn.createStatement();

		String sqlupdate = "UPDATE library SET sname = 'Shinchan' WHERE sname = 'Megh'";
		System.out.println("The SQL Statement is: " + sqlupdate);

		int countupdated = st.executeUpdate(sqlupdate);
		System.out.println(countupdated + " record Updated");

	}

}
