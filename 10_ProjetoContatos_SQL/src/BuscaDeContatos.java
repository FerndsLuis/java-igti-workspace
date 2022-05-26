import java.util.Scanner;

public class BuscaDeContatos extends BancoDeDados {
		
	public void listarComFiltro() {
		String email = "";		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual nome deseja pesquisar? ");
		email = teclado.nextLine();
		
		try {			
			String query1 = "select * from icarros.icarros_contato where email like '%"+ email +"%' ";					
			
			this.resultset = this.statement.executeQuery(query1);
			this.statement = this.connection.createStatement();
			
			
			if(resultset != null)
			{
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
			} else {
				System.out.println("Nenhum e-mail encontrado");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro: " + e.getMessage());
		}
		
	}
}
