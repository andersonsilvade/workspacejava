package br.com.fatec.les;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OiMundoServlet", urlPatterns = { "/servlet" })
//@WebServlet(name = "OiMundoServlet", urlPatterns = { "/servlet/*" })
//@WebServlet(name = "OiMundoServlet", urlPatterns = {"/oi", "/ola"})
public class OiMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OiMundo() {
		super();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Date today = new Date();
		
		// escreve o texto
		out.println("<html>");
		out.println("<body>");
		out.println("Primeira servlet");
		out.println("<h1>Data atual: " + today + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}






