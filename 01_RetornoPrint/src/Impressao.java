
public class Impressao {
	
	public static void main(String[] args) {
		String nome, endereco, estado, email;
		int idade;
		
		nome = "Givaldo Vidal Marques";
		endereco = "Rua Deus me Chame, 1000";
		idade = 35;
		estado = "SP";
		email = "giva@gama.com.br";
		
		System.out.println("Nome: "+ nome +", idade: " + idade +", endereço: "+ endereco +", estado: "+ estado +", email: " + email);
		System.out.printf("Nome: %s, idade: %d, endereço: %s, estado: %s, email: %s ", nome, idade, endereco, estado, email);
		
	}
}
