<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "br.com.lista1JSP.exer4.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Contador</title>
</head>
<body>
<div> 
<%if(request.getAttribute(Contador.CONT)!=null){ %>
 
 <%
  out.println("Contador");
  out.println(request.getAttribute(Contador.CONT));
 
  }%>

</div>


</body>
</html>