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

	
}
