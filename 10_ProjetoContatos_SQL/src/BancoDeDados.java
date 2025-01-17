import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class BancoDeDados {
	
	//criando v�riaveis privadas
	protected Connection connection = null;
	protected java.sql.Statement statement = null;
	protected ResultSet resultset = null;
	
	//iremos neste processo se conectar ao banco de dados
	//fazendo a passagem de par�metros
	public void conectar() {
		
		//criando vari�veis de conex�o
		String servidor = "jdbc:mysql://localhost/ICARROS";
		
		//usu�rio do banco e senha
		String usuario = "root";
		String senha = "root";
		
		//var�vel para vincular o Driver de conex�o
		String driver = "com.mysql.cj.jdbc.Driver";
		
		//verificar se o banco efetuou a conex�o
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print("Error ao conectar: " + e.getMessage());
		}		
	}
	
	//testar conex�o
	public boolean estaConectado() {
		if(this.connection != null) {
			return true;
		} else {
			return false;
		}
	}
	
	//listar os registro no banco
	public void listarContatos() {
		try {
			
			//vari�vel para o retorno do mysql
			String query = "select * from icarros.icarros_contato";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			
			//La�o de repeti��o
			while(this.resultset.next()) {
				//vari�veis para receber os campos do banco
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
	
	
	//atualizar registro
	public void editarContato(int id, String nome, int idade, String email, String funcao) {
		try {			
			String query = "update icarros.icarros_contato set nome ='"+nome+"',idade="+idade+",email='"+email+"',funcao='"+funcao+"' where id="+id;
			//System.out.println(query);
			this.statement.executeUpdate(query);			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	//inserindo registros
	public void inserirContatos(String nome, int idade, String email, String funcao) {
		try {
			String query = "insert into icarros.icarros_contato (nome,idade,email,funcao) values('"+nome+"',"+ idade+",'"+email+"','"+ funcao+"')";
			this.statement.execute(query);			
			System.out.println(query);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	//exclus�o de registros
	public void deletarContato(int id) {
		try {
			String query = "delete from icarros.icarros_contato where id= "+id+";";
			this.statement.executeUpdate(query);
			System.out.println(query);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
}
