package com.suman.myapp;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws javax.servlet.ServletException, java.io.IOException {
		
		String param = request.getParameter("name");
		
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
