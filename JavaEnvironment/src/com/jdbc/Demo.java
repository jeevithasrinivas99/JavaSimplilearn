package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	
	Connection conn =	DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "rootsys");
	 Statement stmt=conn.createStatement();
	 String query="insert into employees values(106,'dakha',current_date,90000)";
	 int count =stmt.executeUpdate(query);
	 
System.out.println(count +" record inserted......");
conn.close();
} catch (SQLException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
}


