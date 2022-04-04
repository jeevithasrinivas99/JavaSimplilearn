package com.jdbc.UnassJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   Connection conn=DBUtil.getDBconnection();
   
  String insert ="insert into employees values(?,?,current_date,?)";
   PreparedStatement pstmt;
try {
	pstmt = conn.prepareStatement(insert);
	pstmt.setInt(1, 111);
	pstmt.setString(2, "jeevi");
	pstmt.setInt(3,50000);
	int count=pstmt.executeUpdate();
	System.out.println(count +"records effected");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

  
    }
}
}