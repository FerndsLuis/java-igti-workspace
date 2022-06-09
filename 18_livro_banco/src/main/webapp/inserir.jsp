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
				
				<label class="form-label">Nome do Autor</label>
				<input type="text" name="lbl_nomeAutor" class="form-control" aria-describedby="passwordHelpBlock" placeholder="Digite o nome do autor">
				
				<label class="form-label">Nome da editora</label>
				<input type="text" name="lbl_nomeEditora" class="form-control" aria-describedby="passwordHelpBlock" placeholder="Digite o nome da editora">
				
				<label for="inputPassword5" class="form-label">Data de lançamento livros</label>
				<input type="date" name="lbl_dataLancamentoLivro" class="form-control" aria-describedby="passwordHelpBlock">
				
				<button type="submit" class="btn btn-primary mt-4">Gravar</button>
			</form>
		</div>
		<div class="col-6">
			<p>imagem</p>
		</div>
	</div>
	<%@ page import="model.Livro, dao.BancoDeDados, java.util.*, java.util.Date, java.text.SimpleDateFormat" %>
		
	 <% 	 	
	 	SimpleDateFormat formata = new SimpleDateFormat("yyyy/MM/dd");
						
	 	String nomeLivro = request.getParameter("lbl_nomeLivro");
		String nomeAutor = request.getParameter("lbl_nomeAutor");
		String nomeEditora = request.getParameter("lbl_nomeEditora");
		String dataLancamentoLivro = request.getParameter("lbl_dataLancamentoLivro");
				
		if(nomeLivro == null && nomeAutor == null && nomeEditora == null && dataLancamentoLivro == null
			|| nomeLivro.isEmpty() && nomeAutor.isEmpty() && nomeEditora.isEmpty() && dataLancamentoLivro.isEmpty()){
			//out.print("Campos vázios");
		} else {
			Livro livro = new Livro();
			
			java.util.Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dataLancamentoLivro);
						
			livro.setNome(nomeLivro);
			livro.setAutor(nomeAutor);
			livro.setEditora(nomeEditora);
			livro.setData_lancamento(date1);
			
			BancoDeDados.inserir(livro);
			out.print(nomeLivro +"-"+ nomeAutor +"-"+ nomeEditora +"-"+ date1 +"-");
		}
		
	 %>
	 
	 <br>
	 <hr>
	 <a href="index_livro.jsp">Listar dados</a> | <a href="procurar_livro.jsp">Buscar</a>
</div>
	
	
</body>
</html>