package com.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductDetails
 */
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        
       InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
       Properties props = new Properties();
       props.load(in);
       
       try {
		DBConnection conn = new DBConnection(props.getProperty("jdbc:mysql://localhost:3306/ecommerce"), props.getProperty("root"), props.getProperty("rootsys"));
		   Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		   stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('New Product', 17800.00, now())");
		   ResultSet rst = stmt.executeQuery("select * from eproduct");
		   
		   while (rst.next()) {
		           out.println(rst.getInt("ID") + ", " + rst.getString("name") + "<Br>");
		   }
		   
		   stmt.close();
		   
		   
		   
		   out.println("</body></html>");
		   conn.closeConnection();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
