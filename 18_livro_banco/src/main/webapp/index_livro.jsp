<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Listagem de Livros</h1>
	<%@ page import="dao.ListarLivros, model.Livro, java.util.*" %>	
	<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %> 
	
	<%
		List<Livro> list = ListarLivros.lista();
		request.setAttribute("list", list);	
//Projeto Agenda
//Index_Livros.jsp

//Crie uma classe de conex�o com o banco de dados
//Crie uma outra classe para envocar um select Mostre as informa��es do select dentro de uma 
//p�gina JSP, utilizando a interven��o do JAVA com HTML
//Id_Livro    Nome_Livro
	%>
	
	<table>
		<tr>
			<th>ID</th>
			<th>Nome</th>
		</tr>
		<tr>
		</tr>
	</table>
	
</body>
</html>