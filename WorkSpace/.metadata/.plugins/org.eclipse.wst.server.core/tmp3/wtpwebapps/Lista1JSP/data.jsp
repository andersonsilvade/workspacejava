
<%@ page contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="br.com.lista1JSP.exer2.*"%>

   

<html>
<head>
<title>DATA</title>
</head>
<body>
<div>
 
   <%
    	if(request.getAttribute(DataJSP.DATATUAL)!= null){
    %>
   Data Atual:
   <%
    	out.println(request.getAttribute(DataJSP.DATATUAL));
       }
    %>
 </div> 

</body>
</html>