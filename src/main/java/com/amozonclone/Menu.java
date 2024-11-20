package com.amozonclone;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Menu extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 response.setContentType("text/html");
	     PrintWriter out=response.getWriter();
	     request.getRequestDispatcher("links.html").include(request, response);
	     
	    HttpSession session=request.getSession(false);
	    String user=(String)session.getAttribute("username");
	    if(session!=null) 
	    {
	    	
	    	out.println("<h4 Style='float:right'><i>Hi,"+user+"</i></h4>");
	    	out.println("<div>");
	    	out.println("<h3>Here Are the list of items we provide...</h3>");
	    	out.println("<ol>");
	    	out.println("<li>Mobile</li>");
	    	out.println("<li>Garmeter</li>");
	    	out.println("<li>Tv</li>");
	    	out.println("<li>Furniture</li>");
	    	out.println("<li>Grocery</li>");
	    	out.println("<li>kithchenary</li>");
	    	out.println("</ol>");
	    	out.println("</div>");	 	
	    }
	    
	    else 
	    {
	    	out.println("<h2 style='color:red'>Please Login First</h2>");
	    	request.getRequestDispatcher("LoginPage.html").include(request, response);
	    }
		
	}

}
