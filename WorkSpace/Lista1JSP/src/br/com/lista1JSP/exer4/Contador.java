package br.com.lista1JSP.exer4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/contador")
public class Contador extends HttpServlet{
	
	public static final String CONT = "0";
	int cont = 0;
	public Contador(){
		super();
	}
	public  void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
		 
	    cont++;
				
		request.setAttribute(CONT, cont);
		
		RequestDispatcher rd = request.getRequestDispatcher("contador.jsp");
		rd.forward(request, response);
		
		
	}
	
	
	
}
