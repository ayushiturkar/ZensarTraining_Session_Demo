package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ayushi")
public class DemoServlets extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//String method = request.getMethod();
		//String username= request.getParameter("fname");
		//System.out.println("method =" +method);
		//out.write("Hi users " +username);
		
		ServletContext ctx = getServletContext();
		ServletConfig cfig = getServletConfig();
		String data = ctx.getInitParameter("url");
		String ur = cfig.getInitParameter("hello");
		out.print("Data context" +data);
	    out.print("Data config" +ur);
	    
	    int i = (int) ctx.getAttribute("active");
	    out.println("<html><body>");
	    out.println("<h1>Welcome</h1>");
	    out.println("active count" +i);
	    out.println("</body></html>");
	    
	   /* String method = request.getMethod();
		String username=request.getParameter("fname");
		String passwd=request.getParameter("pass");
		
		if(username.equals("admin") && passwd.equals("123"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("riya");
			rd.forward(request, response);
		}
		else
		{
			out.println("Wrong username and password");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}*/
		
		
		
	}
	
	

}
