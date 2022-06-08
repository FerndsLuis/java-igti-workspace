<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<String> produtos = new ArrayList<String>();
		
		produtos.add("mouse"); 
		produtos.add("teclado"); 
		produtos.add("scanner");
		produtos.add("impressora"); 
		produtos.add("monitor");
		
		out.print("<ul>");
			for(int x = 0; x < produtos.size(); x++){
				out.println("<li>"+produtos.get(x)+"</li>");
			}					
		out.print("</ul>");
	
	%>
	
	<a href="index.html">
		Voltar para home
	</a>
</body>
</html>