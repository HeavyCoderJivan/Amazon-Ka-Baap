package com.amozonclone;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 response.setContentType("text/html");
	     PrintWriter out=response.getWriter();
	     request.getRequestDispatcher("links.html").include(request, response);
	     HttpSession session=request.getSession(false);
	     session.invalidate();	
	     out.println("<h2 style='color:yellow'>Logout succesfully<h2>");
	}

}
