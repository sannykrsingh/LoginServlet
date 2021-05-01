package com.india;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ForgotServlet extends HttpServlet {
	public void init(ServletConfig sc) {
		System.out.println("ForgotServlet-Init()");

	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" ------ ForgotServlet-Service()-------");
		// 1. Collect Request Data
		String em = request.getParameter("email");

		// 2. Process the Request Data
		System.out.println("em");

		// 3. Send the Response
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>Online BookStore</h1>");
		out.println("<h2>Hi Your Password sent to your email ID successfully");

		out.println("</center></body></html>");
	}

	public void destroy() {
		System.out.println("LoginServlet-destroy()");

	}

}
