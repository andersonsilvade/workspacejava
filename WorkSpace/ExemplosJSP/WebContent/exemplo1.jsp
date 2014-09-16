<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemplo 1</title>
</head>
<body>
    <%! String msg = "Scriplet defindo uma String msg"; %>
    <%out.println("exemplo 1 do jsp"); %></br>
    <%out.println(msg); %></br>
    <% String msg = "toda declaração fica dentro de um scriptlet";
    out.println(msg);%></br>
    <%! String msg1 = "valor qualquer"; %>
    <%=msg1 %></br>
    <%=msg1 +": "+ new java.util.Date()+" PI: "+Math.PI %></br>
    <%--Apresenta uma mensagem agora --%>
    <%out.println("mensagem qualquer </br>"); %>
</body>
</html>