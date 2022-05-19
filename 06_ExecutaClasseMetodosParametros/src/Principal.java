import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variáveis
		String nome, email;
		int idade;
		
		//Lendo o teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionário");
		nome = teclado.nextLine();
		
		System.out.println("Digite o e-mail do funcionário");
		email = teclado.nextLine();
		
		System.out.println("Digite a idade do funcionário");
		idade = teclado.nextInt();
		
		//Fazendo a chamada
		ProcessaMensagem executaMetodo = new ProcessaMensagem();
		executaMetodo.receberParamentros(nome, email, idade);
		
	}

}
