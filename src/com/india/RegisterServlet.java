package com.india;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

	public void init(ServletConfig sc) {
		System.out.println("*** RegisterServlet-init()***");
	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegisterServlet-servise()");
		// 1. Collect the Request Data
		String fn = request.getParameter("fname");
		String ln = request.getParameter("lname");
		String em = request.getParameter("email");
		String ph = request.getParameter("phone");
		String ge = request.getParameter("gender");
		String ct = request.getParameter("ctype");
		String cn = request.getParameter("cnum");
		String co[] = request.getParameterValues("color");
		String un = request.getParameter("uname");
		String pw = request.getParameter("pword");
		// 2. Process the Request Data
		System.out.println("fn");
		System.out.println("ln");
		System.out.println("em");
		System.out.println("ph");
		System.out.println("ge");
		System.out.println("ct");
		System.out.println("cn");
		System.out.println("un");
		System.out.println("pw");
		for (int i = 0; i < co.length; i++) {
			System.out.println(co[i]);
		}
		// 3. send the Responce
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>Online BookStore</h1>");
		out.println("<h2>Hi " + fn + " " + ln
				+ "Your Registration has been completed successfully");

		out.println("</center></body></html>");
	}

	public void destroy() {
		System.out.println("RequestServlet-destroy()");

	}
}
