package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {
	protected Connection connection = null;
	protected java.sql.Statement statement = null;
	protected ResultSet resultset = null;
	
	public void conectar() {
		String servidor = "jdbc:mysql://localhost/ICARROS";
		
		String usuario = "root";
		String senha = "root";
		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print("Error ao conectar: " + e.getMessage());
		}		
	}
	
	public void listarContatos(String id) {
		try {
			
			//variável para o retorno do mysql
			String query = "select * from icarros.icarros_contato where id="+id;
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			
			//Laço de repetição
			while(this.resultset.next()) {
				//variáveis para receber os campos do banco
				String meuID = resultset.getString("id");
				String meuNome = resultset.getString("nome");
				int minhaIdade = resultset.getInt("idade");
				String meuEmail = resultset.getString("email");
				String minhFuncao = resultset.getString("funcao");
				
				System.out.println(
				meuID +" | "+ meuNome +" | "+ minhaIdade +" | "+ meuEmail + " | "+ minhFuncao);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro ao listar: "+ e.getMessage());
		}
	}
	
	public void listarTodosContatos() {
		try {
			
			//variável para o retorno do mysql
			String query = "select * from icarros.icarros_contato";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			
			//Laço de repetição
			while(this.resultset.next()) {
				//variáveis para receber os campos do banco
				String meuID = resultset.getString("id");
				String meuNome = resultset.getString("nome");
				int minhaIdade = resultset.getInt("idade");
				String meuEmail = resultset.getString("email");
				String minhFuncao = resultset.getString("funcao");
				
				System.out.println(
				meuID +" | "+ meuNome +" | "+ minhaIdade +" | "+ meuEmail + " | "+ minhFuncao);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro ao listar: "+ e.getMessage());
		}
	}
	
	public void inserirContatos(String nome, String idade, String email, String funcao) {
		try {
			String query = "insert into icarros.icarros_contato (nome,idade,email,funcao) values('"+nome+"','"+ idade+"','"+email+"','"+ funcao+"')";
			this.statement.execute(query);			
			System.out.println(query);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	public void deletarContatos(String id) {
		try {
			String query = "delete from icarros.icarros_contato where id="+id;
			this.statement.execute(query);
			System.out.println(query);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	
}
