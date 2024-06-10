package com12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import packk.Jdbcj;

public class AddTests extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
	PrintWriter out=res.getWriter();
	Jdbcj exe1=new Jdbcj();
	String i=req.getParameter("n_test");
	long j=Integer.parseInt(req.getParameter("id_test"));
	long k=Integer.parseInt(req.getParameter("test_price"));
	long l=Integer.parseInt(req.getParameter("m_id"));
	
	}
}
