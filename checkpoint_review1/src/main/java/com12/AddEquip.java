package com12;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import packk.Jdbcj;

public class AddEquip extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		PrintWriter out=res.getWriter();
		Jdbcj exe1=new Jdbcj();
		String i=req.getParameter("n_equip");
		long j=Integer.parseInt(req.getParameter("id_equip"));
		long k=Integer.parseInt(req.getParameter("cost"));
		long l=Integer.parseInt(req.getParameter("s_price"));
		long m=Integer.parseInt(req.getParameter("quant"));
		long n=Integer.parseInt(req.getParameter("m_id"));
		if(exe1.check_addequip(i,j,k,l,m,n)) {
			out.println("Added Successfully");
		}
		else {
			out.println("Failed to add Equipment");
		}
	}
}

