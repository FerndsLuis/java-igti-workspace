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
							class="sr-only">(current)</span></a> <a class="dropdown-item"
							href="modificar.jsp">Modificar</a>
					</div></li>
			</ul>
		</div>
	</nav>
	<!-- Criando o menu -->

	<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8">
				<form>
					<div class="input-group mb-3">
						<label class="input-group-text" for="inputGroupSelect01">Cursos</label>
						<select class="form-select" name="sl_curso"
							id="inputGroupSelect01">
							<option selected>Escolha o seu curso...</option>
							<option value="java">JAVA</option>
							<option value="javascript">JavaScript</option>
							<option value="c++">C++</option>
							<option value="phython">Phython</option>
							<option value="html">HTML</option>
							<option value="css">CSS</option>
						</select>
					</div>
					<div class="form-group">
						<label for="data">Data do cursos</label> <input type="date"
							class="form-control" name="lbl_data_curso" id="data">
					</div>
					<div class="form-group">
						<label for="lbl_hora">Hora do cursos</label> <input type="time"
							class="form-control" name="lbl_hora_curso" id="hora">
					</div>
					<div class="form-group">
						<label for="duracao">Duração do curso</label> <input type="number"
							class="form-control" name="lbl_duracao_curso" id="duracao">
					</div>
					<div class="form-group">
						<label for="resumo" class="form-label">Resumo do Curso</label>
						<textarea class="form-control" name="lbl_resumocurso" id="resumo"
							rows="3"></textarea>
					</div>

					<button type="submit" class="btn btn-primary">Inserir</button>
				</form>
				<%@ page
					import="br.com.MODEL.*, br.com.DAO.ConexaoDAO, java.util.*, java.sql.*, java.util.Date, java.text.SimpleDateFormat"%>
				<%
				ConexaoDAO dao = new ConexaoDAO();

				String curso = request.getParameter("sl_curso");
				String data = request.getParameter("lbl_data_curso");
				String hora = request.getParameter("lbl_hora_curso");
				String duracao = request.getParameter("lbl_duracao_curso");
				String resumo = request.getParameter("lbl_resumocurso");

				//out.print(curso +" - " + data +" - " + hora +" - " + duracao +" - " + resumo);	

				if (curso == null || data == null || duracao == null || resumo == null || curso.isEmpty() || data.isEmpty()
						|| duracao.isEmpty() || resumo.isEmpty()) {
					out.print("Dados invalidos");
				} else {
					Curso c = new Curso();

					java.util.Date data_formatada = new SimpleDateFormat("yyyy-MM-dd").parse(data);
					int duracao_formatada = Integer.valueOf(duracao);

					SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
					Date date = null;
					try {
						date = sdf.parse(hora.concat(":00"));
					} catch (Exception e) {
						e.printStackTrace();
					}
					String formattedTime = sdf.format(date);
					Time hora_formatada = java.sql.Time.valueOf(formattedTime);

					c.setNome(curso);
					c.setData(data_formatada);
					c.setHora(hora_formatada);
					c.setDuracao(duracao_formatada);
					c.setResumo(resumo);

					dao.inserir(c);
				}
				%>
			</div>
			<div class="col-2"></div>
		</div>
	</div>

</body>
</html>