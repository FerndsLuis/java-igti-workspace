<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Criando a nossa p�gina com Java JSP</h1>
	<%
		//out.print("Seja bem vindo" + "<p>Lu�s</p>");
		for(int contador = 0; contador <= 10; contador++){
			out.print("<span>"+contador+"</span>");
			out.print(contador < 10? ", ": ".");
		}
	%>
	
	<!-- Chamada de outra p�gina -->
	<a href="noticia.html">Noticias</a>
</body>
</html>