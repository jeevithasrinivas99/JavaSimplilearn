package com.jdbc.UnassJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBconnection()
{Connection conn=null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			 conn =	DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "rootsys");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

return conn;
}
}
