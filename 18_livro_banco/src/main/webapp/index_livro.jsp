<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Listagem de Livros</h1>
	<%@ page import="dao.ListarLivros, model.Livro, java.util.*" %>
	
	<%
		List<Livro> list = ListarLivros.lista();		
//Projeto Agenda
//Index_Livros.jsp

//Crie uma classe de conexão com o banco de dados
//Crie uma outra classe para envocar um select Mostre as informações do select dentro de uma 
//página JSP, utilizando a intervenção do JAVA com HTML
//Id_Livro    Nome_Livro
	%>
	
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Nome</th>
		</tr>		
			<%
			for(int x = 0; x < list.size(); x++){
				out.print("<tr>");
				out.print("<td>"+ list.get(x).getId() +"</td>");
				out.print("<td>"+ list.get(x).getNome() +"</td>");
				out.print("</tr>");
			}				
			%>
	</table>
	
</body>
</html>