package com.tnsif.jdbcpgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//step 1: import the packages
public class JDBCselect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step 2: load and register the driver
		Class.forName("org.postgresql.Driver");
		System.out.println("step 2: load and register the driver");

		// step 3: establish the connection
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Peenya", "postgres",
				"postgreMeg");
		System.out.println("step 3: connection completed");

		// step4: create statement
		Statement st = conn.createStatement();
		System.out.println("step 4: statement created");

		// step5: execute the query
		String strselect = "select sid, sname, sbranch from library";
		System.out.println("step 5: the sql statement is: " + strselect);

		// process the result to display
		ResultSet rst = st.executeQuery(strselect);

		System.out.println("the records are:");
		int rowcount = 0;
		while (rst.next()) {
			int sid = rst.getInt("sid");
			String sname = rst.getString("sname");
			String sbranch = rst.getString("sbranch");

			System.out.println(
					"Student id: " + sid + " | " + "Student name: " + sname + " | " + "Student branch: " + sbranch);
			++rowcount;
		}

	}
}
