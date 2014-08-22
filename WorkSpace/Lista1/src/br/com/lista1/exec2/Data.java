package br.com.lista1.exec2;

import java.io.IOException;
import java.io.PrintWriter;


import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet({"/Data"})
public class Data extends HttpServlet{
	
	
	
	public Data(){
		super();
	}
	
	@SuppressWarnings("deprecation")
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		PrintWriter out = response.getWriter();
		Date dataAtual = new java.util.Date();
		
		
		out.println("<br/>Data atual "+dataAtual);
		
	}

}
