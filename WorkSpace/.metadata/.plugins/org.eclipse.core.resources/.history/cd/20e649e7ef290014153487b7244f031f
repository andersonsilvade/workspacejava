package br.com.lista1.exerc4;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/cont"})
public class Contador extends HttpServlet {
	
	public Contador(){
		super();
	}
	private int contador = 0;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
			// pega o escritor
			PrintWriter out = resp.getWriter();
			// escreve o texto
			while(contador < 5){
			out.println("<html><body>");
			out.println("Valor do contador: " + contador);
			out.println("<br/>");
			out.println("</body></html>");
			contador++;
			}
			
}
}
