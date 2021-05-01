package com.india;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	public void init(ServletConfig sc) {
		System.out.println("LoginServlet-Init()");

	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" ------ LoginServlet-Service()-------");
		// 1. Collect Request Data
		String un = request.getParameter("uname");
		String pw = request.getParameter("pwd");
		// 2. Process the Request Data
		System.out.println("un");
		System.out.println("pw");
		// 3. Send the Response
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>Online BookStore</h1>");
		out.println("<h2>Hi " + un
				+ "Your Login has been completed successfully");
		out.println("<h1>Online BookStore Home Page</h1>");
		out.println("</center></body></html>");
	}

	public void destroy() {
		System.out.println("LoginServlet-destroy()");

	}

}
