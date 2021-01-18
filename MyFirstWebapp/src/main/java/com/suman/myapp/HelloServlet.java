package com.suman.myapp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
	
	
	String webSiteName;
	
	
	public void init(ServletConfig servletConfig) throws ServletException {
		
		System.out.println("I AM IN INIT METHOD..!!!");
		this.webSiteName=servletConfig.getInitParameter("websitename");
		
		
		
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws javax.servlet.ServletException, java.io.IOException {
		
		
		System.out.println("THE WEBSITE is " + webSiteName);
		
		
		String contextParam = request.getSession().getServletContext().getInitParameter("commonName");
		
		System.out.println("THE CONTEXT PARAMM is " + contextParam);
		
		String param = request.getParameter("name");
		
		//System.out.println("Checking the Init Parameter--" + myParam);
		
		request.setAttribute("name", param);
		
		
		
	
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws javax.servlet.ServletException, java.io.IOException {
		
		String param = request.getParameter("name");
		
		String param2 =  request.getParameter("password");
		
		UserValidationService service = new UserValidationService();
		
		boolean validateUser = service.validateUser(param, param2);
		
		
		
		
		if(validateUser) {
			
			request.setAttribute("name", param);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
			
			
		}
		else {
			
			request.setAttribute("message", "Please enter Valid UserName or Password..!!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			
		}
		
		
		
		
		
		
	}

	
}
