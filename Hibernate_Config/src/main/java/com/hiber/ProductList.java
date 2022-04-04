package com.hiber;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.ForeachStatement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;






/**
 * Servlet implementation class ProductList
 */
@WebServlet("/ProductList")
public class ProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        try {
        	SessionFactory sessionFactory =HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    
    List<Eproduct> list = session.createQuery("selecr E.name from product E").list();
    
    session.close();
    

    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    out.println("<b>Product Listing</b><br>");
    for(Eproduct p: list) {
            out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() +
                            ", Price: " + String.valueOf(p.getPrice()) + ", Date : " +String.valueOf(p.dop) + "<br>");
    }
    
out.println("</body></html>");


} catch (Exception ex) {
    throw ex;
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
