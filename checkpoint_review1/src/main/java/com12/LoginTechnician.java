package com12;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import packk.Jdbcj;

public class LoginTechnician extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		Jdbcj exe1=new Jdbcj();
		String i=req.getParameter("t_uname");
		String j=req.getParameter("pass_t");
		if(exe1.check_t(i, j)) {
		    PrintWriter out=res.getWriter();
			out.println(i+j);
		}
		else {
			res.sendRedirect("http://localhost:1234/First1/failedmlogin.html");
		}
	}
	

}
