<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Chamda da biblioteca do bootstrap  -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</head>
<body>
	<h1>Listagem de Livros</h1>
	<%@ page import="dao.BancoDeDados, model.Livro, java.util.*" %>
	
	<%
		List<Livro> list = BancoDeDados.lista();		
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
			<th>Autor</th>
			<th>Editora</th>
			<th>Data lançamento</th>
		</tr>		
			<%
			for(int x = 0; x < list.size(); x++){
				out.print("<tr>");
				out.print("<td>"+ list.get(x).getId() +"</td>");
				out.print("<td>"+ list.get(x).getNome() +"</td>");
				out.print("<td>"+ list.get(x).getAutor() +"</td>");
				out.print("<td>"+ list.get(x).getEditora() +"</td>");
				out.print("<td>"+ list.get(x).getData_lancamento() +"</td>");
				out.print("</tr>");
			}				
			%>
	</table>
	
	 <br>
	 <hr>
	<a href="inserir.jsp">Inserir dados</a> | <a href="procurar_livro.jsp">Buscar</a>
	
</body>
</html>