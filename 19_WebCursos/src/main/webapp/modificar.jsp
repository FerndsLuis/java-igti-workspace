<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
	crossorigin="anonymous"></script>
<!-- Bootstrap -->


</head>
<body>

<!-- Criando o menu -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Sistema de Cursos</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="index.jsp">Principal</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-expanded="false">
						CRUD </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="pesquisar.jsp">Pesquisa</a> <a
							class="dropdown-item" href="inserir.jsp">Inseir <span
							class="sr-only">(current)</span></a> 
							<a class="dropdown-item"
							href="modificar.jsp">Modificar</a>
					</div></li>
			</ul>
		</div>
	</nav>
	<!-- Criando o menu -->
	

	<!-- Demonstração da empresa -->
	<div class="container">
			<%@ page
					import="br.com.MODEL.*, br.com.DAO.ConexaoDAO, java.util.*, java.sql.*, java.util.Date, java.text.SimpleDateFormat"%>
				
				<table class="table table-hover">
					 <thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Curso</th>
							<th scope="col">Data curso</th>
							<th scope="col">Hora curso</th>
							<th scope="col">Duração curso</th>
							<th scope="col">Resumo do curso</th>
							<th scope="col">Opções</th>
						</tr>
					</thead>
					<tbody>
					<%
					ConexaoDAO dao = new ConexaoDAO();
					List<Curso> list = dao.listar();

					for (int x = 0; x < list.size(); x++) {
						out.print("<tr>");
						out.print("<th  scope=\"row\">" + list.get(x).getId() + "</th>");
						out.print("<td>" + list.get(x).getNome() + "</td>");
						out.print("<td>" + list.get(x).getData() + "</td>");
						out.print("<td>" + list.get(x).getHora() + "</td>");
						out.print("<td>" + list.get(x).getDuracao() + "</td>");
						out.print("<td>" + list.get(x).getResumo() + "</td>");
	out.print("<td> <button type=\"submit\" class=\"btn btn-primary\">Alterar</button> | <a type=\"submit\" href=\"?deletar=" + list.get(x).getId() + "\" class=\"btn btn-danger\">Excluir</a></td>");
						out.print("</tr>");
					}
					%>						
					</tbody>
				</table>
				
				<%
					String id = "";
					id = request.getParameter("deletar");
				
					if(id != null && !id.isEmpty()){
						dao.deletar(id);
					}
				%>
	</div>
</body>
</html>