package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnector {
	

	public static String getData() throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/employees";
		String username="root";
		String password="manoj@123";
		
		String query="select * from employees";
		
		//Establish Connection
		Connection connection= DriverManager.getConnection(url, username, password);
		
		//Create a Statement
		Statement statement= connection.createStatement();
		
		ResultSet result= statement.executeQuery(query);
		
		result.next();
		
		String firstname= result.getString("first_name");
		System.out.println(firstname);
		
		return firstname;
	}
}
