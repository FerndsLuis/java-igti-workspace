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
	<h1>Gerenciamento de Imagens</h1> 	
	<%	
	ArrayList<String> bandeiras = new ArrayList<>();
	
	bandeiras.add("Brasil");
	bandeiras.add("Mexico");
	bandeiras.add("Italia");
	bandeiras.add("Alemanha");
	
	out.print("<ul>");
	for(String bandeira: bandeiras){
		out.print(bandeira);
		out.print("<li> <img src=\"img/"+bandeira+".png\" width=\"100\"> </li>");		
	}
	out.print("</ul>");
	
	
	%>
</body>
</html>