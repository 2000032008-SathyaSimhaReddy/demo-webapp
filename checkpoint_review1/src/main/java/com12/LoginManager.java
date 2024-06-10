package com12;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import packk.Jdbcj;

public class LoginManager extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		Jdbcj exe1=new Jdbcj();
		String i=req.getParameter("m_uname");
		String j=req.getParameter("pass_m");
		if(exe1.check_m(i, j)) {
		    res.sendRedirect("http://localhost:1234/checkpoint_review1/manager.html");
		}
		else {
			res.sendRedirect("http://localhost:1234/checkpoint_review1/failedmlogin.html");
		}
	}
	

}