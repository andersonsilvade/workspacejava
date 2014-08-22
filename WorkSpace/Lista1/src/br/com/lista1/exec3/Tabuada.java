package br.com.lista1.exec3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet({"/Tabuada"})
public class Tabuada extends HttpServlet{
	
	
	public Tabuada(){
		super();
		
	}
	

public void service (HttpServletRequest request ,HttpServletResponse response) throws IOException{
	PrintWriter out = response.getWriter();
	String tab = request.getParameter("valor");
	Integer t = 0;
	
	out.println("<html><form action = 'Tabuada' method = post >Valor <input type = text name = 'valor'/> ");
	out.println("</br>");
	out.println(" <input type = 'submit' value = 'Calcular'></form></html>");


	try{
	 t = Integer.valueOf(tab); 
	}catch(NumberFormatException e){
		out.println("<br> erro o digitado não é número<br/>");
		return;
	}catch(Exception ex){
		out.println("<br>erro<br/>");
		return;
	}
	
	for(int x = 0;x < 11;x++){
		out.println("<br> "+t+" X "+x+" = "+(t*x)+"<br/>");
	}
	
	
}

}
