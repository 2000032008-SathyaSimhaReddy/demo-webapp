package com12;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import packk.Jdbcj;
public class LoginSignup extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		Jdbcj exe1=new Jdbcj();
	    String nam=req.getParameter("name");
	    String ema=req.getParameter("Email");
	    String pa=req.getParameter("pass");
	    String con_pa=req.getParameter("confirm_pass");
	    String dat=req.getParameter("dob");
	    String phone=req.getParameter("ph");
	    String addre=req.getParameter("address");
	    boolean z=exe1.check(nam,ema,pa,con_pa,dat,phone,addre);
	    if(z) {
	    	res.sendRedirect("http://localhost:1234/First1/login.html");
	    }
	}
}

