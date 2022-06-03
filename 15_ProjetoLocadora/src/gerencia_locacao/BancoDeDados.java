package gerencia_locacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Filme;
import Model.Genero;

public class BancoDeDados {
	
	//criando váriaveis privadas
	protected Connection connection = null;
	protected java.sql.Statement statement = null;
	protected ResultSet resultset = null;
	
	ArrayList<Filme> filmes = new ArrayList<Filme>();
	ArrayList<Genero> generos = new ArrayList<Genero>();
	
	public void conectar() {
		
		//criando variáveis de conexão
		String servidor = "jdbc:mysql://localhost/ICARROS";
		
		//usuário do banco e senha
		String usuario = "root";
		String senha = "root";
		
		//varável para vincular o Driver de conexão
		String driver = "com.mysql.cj.jdbc.Driver";
		
		//verificar se o banco efetuou a conexão
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print("Error ao conectar: " + e.getMessage());
		}		
	}
	
	//testar conexão
	public boolean estaConectado() {
		if(this.connection != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void listarFilmes() {		
		try {			
			//variável para o retorno do mysql
			String query = "select * from icarros.filme";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			
			//Laço de repetição
			while(this.resultset.next()) {
				Filme campo = new Filme();
				
				//variáveis para receber os campos do banco
				campo.setId_filme(Integer.valueOf(resultset.getString("id_filme")));
				campo.setNome_filme(resultset.getString("nome_filme"));
				campo.setDuracao_filme(resultset.getString("duracao_filme"));
				campo.setData_lancamento_filme(resultset.getString("data_lancamento_filme"));
				campo.setGenero_filme(resultset.getString("genero_filme"));				
				campo.setImagem_filme(resultset.getString("imagem_filme"));
				campo.setSinopse_filme(resultset.getString("sinopse_filme"));
				
				filmes.add(campo);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro ao listar: "+ e.getMessage());
		}
	}
	
	public void inserirFilme(Filme filme) {
		try {
			String query = "insert into icarros.filme (nome_filme,duracao_filme,genero_filme,"
													+ "data_lancamento_filme,sinopse_filme,imagem_filme,data_modificacao_filme) "
						  + "values('"+ filme.getNome_filme()+"','"
						  			 + filme.getDuracao_filme()+"','"
						             + filme.getGenero_filme()+"','"
						  			 + filme.getData_lancamento_filme()+"','"
						  		     + filme.getSinopse_filme()+"','"
						  		     + filme.getImagem_filme()+"','"
						  		     + java.time.LocalDate.now()+"')";
			this.statement.execute(query);			
			System.out.println(query);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	public void deletarFilme(int id) {
		try {
			String query = "delete from icarros.filme where id_filme=" + id;
			this.statement.execute(query);			
			System.out.println(query);			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro: " + e.getMessage());
		}
	};
	
	public void listarGenero() {
				
		try {
			//variável para o retorno do mysql
			String query = "select * from icarros.genero";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			
			//Laço de repetição
			while(this.resultset.next()) {
				Genero campo = new Genero();
				
				//variáveis para receber os campos do banco
				campo.setIdGenero(resultset.getInt("id_genero"));
				campo.setGenero(resultset.getString("genero"));
				
				generos.add(campo);	
			}
			
			//System.out.println(generos.size());
			
			//for(int x = 0; x < generos.size(); x++) {
			//	System.out.println(generos.get(x).getGenero());
			//}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro ao listar: "+ e.getMessage());
		}
	}
	
		
}
