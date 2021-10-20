package com.tqpp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cook1")
public class Cook1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	Cookie[] arr = req.getCookies();
    	for(Cookie c :arr)
    	{
    		System.out.println(c.getName()+ " "  + c.getValue());
    	}
   }
}
