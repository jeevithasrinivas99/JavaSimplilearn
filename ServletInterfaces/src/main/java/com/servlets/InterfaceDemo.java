package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InterfaceDemo
 */
@WebServlet("/InterfaceDemo")
public class InterfaceDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ServletConfig config=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InterfaceDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
        System.out.println("Initialization complete");
     }

		



	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
        System.out.println("In destroy() method");
    }
    public ServletConfig getServletConfig1(){
        return config;
    }
    public String getServletInfo1(){
        return "This is a sample servlet info";
    }


	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
        PrintWriter pwriter=res.getWriter();
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("In the service() method<br>");
        pwriter.print("</body>");
        pwriter.print("</html>");
    }
}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	