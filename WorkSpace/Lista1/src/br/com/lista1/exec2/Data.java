package br.com.lista1.exec2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/data")

public class Data extends HttpServlet{
	
   private static final long serialVersionUID = 1L;
   public static final String DATATUAL = "dt";
	
	public Data(){
		super();
	}
	

	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		
		Date dataAtual = new java.util.Date();
		
		request.setAttribute(DATATUAL, dataAtual);
		
		RequestDispatcher  rd = request.getRequestDispatcher("data.jsp");
		
		rd.forward(request, response);
		
	    
		
	}

}
