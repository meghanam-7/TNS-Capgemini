package com.tnsif.jdbcpgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//demo for insert and delete

public class Preparedstatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step 2: load and register the driver
		Class.forName("org.postgresql.Driver");

		// step 3: Establish connection
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Peenya", "postgres",
				"postgreMeg");
		System.out.println("Connection completed");

		// step4: create statement
		Statement st = conn.createStatement();

		// step5: execute the query
		String sqlinsert = "insert into library values(103, 'Shin', 'CSE')";
		System.out.println("The SQL Statement is: " + sqlinsert);

		int countinserted = st.executeUpdate(sqlinsert);
		System.out.println(countinserted + " record inserted");
	}

}
