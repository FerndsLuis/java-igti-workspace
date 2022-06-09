<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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


<div class="container">
	<div class="row">
		<div class="col-6">
			<form id="inserir" method="get">
				<label class="form-label">Nome do livros</label>
				<input type="text" name="lbl_nomeLivro" class="form-control" aria-describedby="passwordHelpBlock" placeholder="Digite o nome do livro">
								
				<button type="submit" class="btn btn-primary mt-4">Buscar</button>
			</form>
			
			<%@ page import="model.Livro, dao.BancoDeDados, java.util.*" %>			
			<table border="1">
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Autor</th>
				<th>Editora</th>
				<th>Data lançamento</th>
			</tr>		
			<%
			String nomeLivro = request.getParameter("lbl_nomeLivro");
			
			if(nomeLivro != null && !nomeLivro.isEmpty())
			{
			out.print("<hr>");
				
			List<Livro> list = BancoDeDados.buscaLivro(nomeLivro);
			
				for(int x = 0; x < list.size(); x++){
					out.print("<tr>");
					out.print("<td>"+ list.get(x).getId() +"</td>");
					out.print("<td>"+ list.get(x).getNome() +"</td>");
					out.print("<td>"+ list.get(x).getAutor() +"</td>");
					out.print("<td>"+ list.get(x).getEditora() +"</td>");
					out.print("<td>"+ list.get(x).getData_lancamento() +"</td>");
					out.print("</tr>");
				}	
			}
			%>
		</table>
		</div>
		<div class="col-6">
			<p>imagem</p>
		</div>
	</div>	 
	 <br>
	 <hr>
	 <a href="index_livro.jsp">Listar dados</a> | <a href="inserir.jsp">Inserir dados</a> 
</div>	
	
</body>
</html>