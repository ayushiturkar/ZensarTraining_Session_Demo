package com.tqpp;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;  
import javax.servlet.http.HttpSessionListener;  

@WebListener
public class List1 implements HttpSessionListener{  
    
    private int total=0,active=0;  
      
    public void sessionCreated(HttpSessionEvent e) {  
    total++;  
    active++;  
      HttpSession ses = e.getSession();
      ServletContext ctx = ses.getServletContext();
    ctx=e.getSession().getServletContext();  
    ctx.setAttribute("totalusers", total);  
    ctx.setAttribute("currentusers", active); 
    System.out.println("listner executed session created");
      
    }  
  
    public void sessionDestroyed(HttpSessionEvent e) {  
        active--; 
        HttpSession ses = e.getSession();
        ServletContext ctx = ses.getServletContext();
        ctx.setAttribute("currentusers",active);  
    }  
  
}  



