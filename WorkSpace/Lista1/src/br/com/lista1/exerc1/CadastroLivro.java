package br.com.lista1.exerc1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({ "/cl" })
public class CadastroLivro extends HttpServlet {
	
	public CadastroLivro(){
		super();
	}
	
	public void service(HttpServletRequest request , HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		String autor = request.getParameter("autor");
		String ano = request.getParameter("ano");
		String editora = request.getParameter("editora");
		String versao = request.getParameter("versao");
		String telefone = request.getParameter("telefone");
		String contato = request.getParameter("contato");
		String numeroRegistro = request.getParameter("numeroR");
		
		if(nome.isEmpty()|| nome == null){
			out.println("campo nome n�o foi preenchido");
			return;
			}
		if(autor.isEmpty()){
			out.println("campo autor n�o foi preenchido");
			return;
			}
		if(ano.isEmpty()){
			out.println("campo ano n�o foi preenchido");
			return;
			}
		if(editora.isEmpty()){
			out.println("campo editora n�o foi preenchido");
			return;
				}
		if(versao.isEmpty()){
			out.println("campo vers�o n�o foi preenchido");
			return;
					}
		if(telefone.isEmpty()){
			out.println("campo telefone n�o foi preenchido");
				return;
						}
		if(contato.isEmpty()){
			out.println("campo contato n�o foi preenchido");
			return;
		}
		if(numeroRegistro.isEmpty()){
			out.println("campo n�mero de registro n�o foi preenchido");
			return;
			}
		
		out.println("DADOS---------------");
		out.println("<br/>Nome: "+nome);
		out.println("<br/>Autor: "+autor);
		out.println("<br/>Ano: "+ano);
		out.println("<br/>Editora: "+editora);
		out.println("<br/>Vers�o: "+versao);
		out.println("<br/>Telefone: "+telefone);
		out.println("<br/>Contato: "+contato);
		out.println("<br/>N�mero registro "+numeroRegistro);
	}
	
}
