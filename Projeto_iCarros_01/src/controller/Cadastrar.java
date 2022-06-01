package controller;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dto.ClienteDTO;
import model.Cliente;

public class Cadastrar {	
			
		
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	Scanner teclado = new Scanner(System.in);
	
	
	public void cadastrarCliente() {	
		
		boolean flAtivo = false;		
		
		System.out.println("**Cadastro de clientes**");
		
		while(!flAtivo) {	
			
			ClienteDTO clienteDTO = new ClienteDTO();
			
			System.out.print("Digite o nome: ");
			clienteDTO.validaNome(teclado.nextLine());
		
			System.out.print("Digite o e-mail: ");
			clienteDTO.validaEmail(teclado.nextLine());
		
			System.out.print("Digite o telefone (xx)xxxxx-xxxx: ");
			clienteDTO.validaTelefone(teclado.nextLine());
		
			System.out.print("Digite a agência: ");
			clienteDTO.validaAgencia(teclado.nextLine());
		
			System.out.print("Digite a conta: ");
			clienteDTO.validaConta(teclado.nextLine());
		
			System.out.print("Digite o saldo (0.00): ");
			clienteDTO.validaSaldo(teclado.nextLine());
			
			clientes.add(clienteDTO);
			
			System.out.println("Deseja sair (S/N)? ");
			flAtivo =  teclado.nextLine().equals("S")? true : false;
			//teclado.nextLine();
			System.out.println("----------------------------------------------");
		}
		teclado.close();
		
		gravarArquivo(clientes);
	}	
	
	public void gravarArquivo(ArrayList<Cliente> clientes) {		
		try {
			String arquivoDiretorio = Paths.get("").toAbsolutePath().toString() + "\\arquivo.txt";
			FileWriter arquivo = new FileWriter(arquivoDiretorio);
			PrintWriter gravandoArquivo = new PrintWriter(arquivo);
			
			for(int x = 0; x < clientes.size(); x++) {				
				gravandoArquivo.println(
						"Nome: " + clientes.get(x).getNome()
						+" | E-mail: " + clientes.get(x).getEmail()
						+" | Telefone: " + clientes.get(x).getTelefone()
						+" | Agência: " + clientes.get(x).getAg()
						+" | Conta: " + clientes.get(x).getConta()
						+" | Saldo: " + clientes.get(x).getSaldo());
			}
			
			arquivo.close();			
			System.out.println("Dados Gravados no arquivo: "+ arquivoDiretorio);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	
}
