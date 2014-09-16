package br.com.lista1JSP.exer1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastroJSP")
public class CadastroLivro extends HttpServlet{
	
	public static final String NOME = "n";
	public static final String AUTOR = "a";
	public static final String ANO = "a";
	public static final String EDITORA = "e";
	public static final String VERSAO = "v";
	public static final String TELEFONE = "t";
	public static final String CONTATO = "c";
	public static final String NUMEROR = "nR";
	
	public CadastroLivro(){
		super();
	}
	public  void service(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException{
		
		String nome = request.getParameter("nome");
		String autor = request.getParameter("autor");
		String ano = request.getParameter("ano");
		String editora = request.getParameter("editora");
		String versao = request.getParameter("versao");
		String telefone = request.getParameter("telefone");
		String contato = request.getParameter("contato");
		String numeroRegistro = request.getParameter("numeroR");
		
	
		
		request.setAttribute(NOME,nome);
		request.setAttribute(CONTATO, contato);
		request.setAttribute(TELEFONE, telefone);
		request.setAttribute(VERSAO, versao);
		request.setAttribute(EDITORA, editora);
		request.setAttribute(ANO, ano);
		request.setAttribute(AUTOR, autor);
		request.setAttribute(NUMEROR, numeroRegistro);
		
		RequestDispatcher rd = request.getRequestDispatcher("cadastro.jsp");
		rd.forward(request, response);

}
}
