package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(
		urlPatterns = { "/HelloServlet" }, 
		initParams = { 
				@WebInitParam(name = "city", value = "bangalore")
		})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param city 
	 * @see Servlet#init(ServletConfig)
	 */public void init(ServletConfig config, String city) throws ServletException {
	    	
	    	city =	config.getInitParameter("city");
	    	
	    		
	    	
	    }
	    
		protected void doGet(HttpServletRequest request, HttpServletResponse response, String city) throws ServletException, IOException {
			
			
			PrintWriter out =	response.getWriter();
			
				out.print("You are from "+city);
		}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
