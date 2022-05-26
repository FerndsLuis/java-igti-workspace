package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class Cadastrar {
	
	public void cadastrarCliente() {		
		boolean flAtivo = false;
		
		Cliente cliente = new Cliente();		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("**Cadastro de clientes**");
		
		while(!flAtivo) {	
			System.out.print("Digite o nome: ");
			cliente.setNome(teclado.nextLine());
		
			System.out.print("Digite o e-mail: ");
			cliente.setEmail(teclado.nextLine());
		
			System.out.print("Digite o telefone: ");
			cliente.setTelefone(teclado.nextLine());
		
			System.out.print("Digite a agência: ");
			cliente.setTelefone(teclado.nextLine());
		
			System.out.print("Digite a conta: ");
			cliente.setConta(teclado.nextLine());
		
			System.out.print("Digite o saldo: ");
			cliente.setSaldo(teclado.nextDouble());
			
			clientes.add(cliente);
			
			System.out.println("Deseja sair (S/N)? ");
			flAtivo =  teclado.nextLine().equals("S")? true : false;
		}
		teclado.close();		
	}
	
}
