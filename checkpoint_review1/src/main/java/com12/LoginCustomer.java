package com12;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import packk.Jdbcj;

public class LoginCustomer extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.print("hello");
		PrintWriter out=res.getWriter();
		Jdbcj exe1=new Jdbcj();
		String i=req.getParameter("uname1");
		String j=req.getParameter("pass1");
		if(exe1.check(i, j)) {
			out.println("login success");
			System.out.println("hello");
		}
		else {
			res.sendRedirect("http://localhost:1234/checkpoint_review1/failedlogin.html");
		}
		
	}

}