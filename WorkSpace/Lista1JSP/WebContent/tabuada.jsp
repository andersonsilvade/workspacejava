<%@ page contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "br.com.lista1JSP.exer3.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Tabuada</title>
</head>
<body>
<form action="tabuada">
<font face="Arial" size="3"><b>N�mero</b></font> <input type = "text" name = "numero" />
<input type = "submit" value = "Calcular"/>


<div>
<%if(request.getAttribute(Tabuada.T)!= null){
%>
  
 <%
 try{
   String aux = String.valueOf(request.getAttribute(Tabuada.T));
   Integer v = Integer.valueOf(aux);
    out.println("Tabuada do "+v);
 for(Integer i = 0;i < 11;i++){
	 out.println("<br> "+v+" X "+i+" = "+(v*i));
 }
 }catch(Exception e){
	 out.println("Por favor digite um numero");
 }
 }%>
</div>

</form>
</body>
</html>