package view;

import java.util.Scanner;

import controller.Cadastrar;
import controller.Listar;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Cadastrar cadastrar = new Cadastrar();
		Listar lista = new Listar();
		
		boolean flAtivo = false;
		Scanner teclado1 = new Scanner(System.in);
		
		
		while(!flAtivo) {	
			
			System.out.println("Bem vindo");			
			System.out.println("Opção 1 - Cadastrar | Opção 2 - Ler Registros | Opção 3 - Sair");
			
			String opcao = teclado1.nextLine();
			
			switch(opcao) {
				case "1":
					cadastrar.cadastrarCliente();
					break;
				case "2":
					lista.listarClientes();
					break;
				default:
					flAtivo = true;
					break;
			}
			
			teclado1.close();
		}
		
	}

}
