import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int ano_atual, ano_nascimento, idade;
		
		ano_atual = 2022;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcion�rio: ");
		nome = teclado.nextLine(); //armazenando dados - next=ap�s espa�o grava - nextline=armazena a linha
		System.out.println("Digite o ano de nascimento: ");
		ano_nascimento = teclado.nextInt();
		
		System.out.println("Seja bem vindo "+ nome);	
		idade = ano_atual - ano_nascimento;
		System.out.println("A sua idade � "+ idade);
		
		
	}

}