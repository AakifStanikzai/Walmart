package com.laibrarys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseManeger {

	static String JDBC_Driver = "orcal.jdbc.orcaldriver";
	static String SQL_URL = "";

	static String username = "hr";
	static String password = "hr";
	public static Connection conn = null;
	public static Statement stamt = null;
	public static ResultSet resultset;

	public ResultSet database(String sqlQuiry) throws SQLException, Exception {

		// connect JDBC
				Class.forName(JDBC_Driver);

				// connect with SQL Server and buld the connection
				conn = DriverManager.getConnection(SQL_URL, username, password);

				// build statement
				stamt = conn.createStatement();

				// build our quiry
				String quiry = "select first_name, Last_name from Emplyees;";

				// run the quiry result
				ResultSet reslut = stamt.executeQuery(quiry);

				while (reslut.next()) {

					String FN = reslut.getString("first_name");
					String LN = reslut.getString("Last_name");

					System.out.println(FN);
					System.out.println(LN);

					// clouse the conneciton
					conn.close();
					stamt.close();
		
		
		
		
	
	}
				return reslut;

	

	}
	

}
