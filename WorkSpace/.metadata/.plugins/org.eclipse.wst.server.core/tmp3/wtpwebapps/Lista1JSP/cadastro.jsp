<%@ page  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "br.com.lista1JSP.exer1.*"%>

<html>
<head>
<title>Cadastro Livro</title>
</head>
<body>
<form action="cadastroJSP">
<font face="Arial" size="3"><b>Nome</b></font> <input type = "text" name = "nome" />
</br>
<font face = "Arial" size="3"><b>Autor</b></font><input type = "text" name = "autor"/>
</br>
<font face="Arial" size="3"><b>Ano</b></font><input type = "text" name = "ano"/>
</br>
<font face="Arial" size="3"><b>Editora</b></font> <input type = "text" name = "editora"/>
</br>
<font face="Arial" size="3"><b>Versão</b></font> <input type = "text" name = "versao"/>
</br>
<font face="Arial" size="3"><b>Telefone</b></font><input type = "text" name = "telefone"/>
</br>
<font face="Arial" size="3"><b>Contado</b></font> <input type = "text" name = "contato"/>
</br>
<font face="Arial" size="3"><b>NumeroRegistro</b></font><input type = "text" name = "numeroR"/>
</br>
<input type = 'submit' value = 'Cadastrar'/>

        

<div>
<%
if(request.getAttribute(CadastroLivro.NOME )!= null){
	 %>
   NOME: 
  <%
  out.println(request.getAttribute(CadastroLivro.NOME)); 
  }
  %>
 </div>
 <div>
  <%
 if(request.getAttribute(CadastroLivro.AUTOR)!=null){
  %>
  AUTOR:
  <%out.println(request.getAttribute(CadastroLivro.AUTOR));} %>
  </div>
  <div>
  <%
  if(request.getAttribute(CadastroLivro.ANO)!=null){
  %>
  ANO:
  <%out.println(request.getAttribute(CadastroLivro.ANO));} %>
  </div>
  <div>
  <%
  if(request.getAttribute(CadastroLivro.EDITORA)!=null){
  %>
  EDITORA:
  <%out.println(request.getAttribute(CadastroLivro.EDITORA));} %>
  </div>
  <div>
  <%
  if(request.getAttribute(CadastroLivro.VERSAO)!=null){
  %>
  VERSÃO:
  <%out.println(request.getAttribute(CadastroLivro.VERSAO));} %>
  </div>
  <div>
  <%
  if(request.getAttribute(CadastroLivro.TELEFONE)!=null){
  %>
  TELEFONE:
  <%out.println(request.getAttribute(CadastroLivro.TELEFONE));} %>
  </div>
 <div>
  <%
  if(request.getAttribute(CadastroLivro.CONTATO)!=null){
  %>
  Contato:
  <%out.println(request.getAttribute(CadastroLivro.CONTATO));} %>
  </div> 
 <div>
  <%
  if(request.getAttribute(CadastroLivro.NUMEROR)!=null){
  %>
  NÙMERO REGISTRO:
  <%out.println(request.getAttribute(CadastroLivro.NUMEROR));} %>
  </div> 
  </form>
</body>

</html>