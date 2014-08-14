package br.com.les.calculadora.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.les.calculadora.servelets.exceptions.CalculadoraException;

//@WebServlet("/test")
public class Test  extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			BuilderCalculo.build("soma").calcular(10, 10);
			
		} catch (CalculadoraException e) {
			e.printStackTrace();
		}
	}
	
	
	
		
	}
	


