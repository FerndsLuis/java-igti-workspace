package dto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Cliente;

public class ClienteDTO extends Cliente {
	
	//Cliente cliente = new Cliente();
	Scanner teclado = new Scanner(System.in);
	
	public void validaNome(String nome) {
		boolean flAtivo = false;
		
		while(!flAtivo) {	
			if(nome.length() > 0 && nome != null) {
				setNome(nome);
				flAtivo = true;
			}else {
				System.out.println("Nome inválido. Digite novamente");
				nome = teclado.nextLine();
			}
		}
	}
	
	public void validaEmail(String email) {
		boolean flAtivo = false;
		
		while(!flAtivo) {	
			//https://stackoverflow.com/questions/624581/what-is-the-best-java-email-address-validation-method
			String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
			Pattern pattern = Pattern.compile(regex);  
			Matcher matcher = pattern.matcher(email);
			
			if(matcher.matches()) {
				setEmail(email);
				flAtivo = true;
			}else {
				System.out.println("E-mail inválido. Digite novamente");
				email = teclado.nextLine();
			}
		}
		
	}
	
	public void validaTelefone(String telefone) {
		boolean flAtivo = false;
		
		while(!flAtivo) {	
			if(telefone.length() == 14 && telefone != null) {
				setTelefone(telefone);
				flAtivo = true;
			}else {
				System.out.println("Telefone inválido. Digite novamente");
				telefone = teclado.nextLine();
			}
		}		
	}
	
	public void validaAgencia(String agencia) {
		boolean flAtivo = false;
		
		while(!flAtivo) {	
			if(agencia.length() >= 1  && agencia.length() <= 4) {
				setAg(agencia);
				flAtivo = true;
			}else {
				System.out.println("Agência inválido. Digite novamente");
				agencia = teclado.nextLine();
			}
		}		
	}
	
	public void validaConta(String conta) {
		boolean flAtivo = false;
		
		while(!flAtivo) {	
			if(conta.length() >= 1  && conta.length() <= 6) {
				setConta(conta);
				flAtivo = true;
			}else {
				System.out.println("Conta inválido. Digite novamente");
				conta = teclado.nextLine();
			}
		}		
	}
	
	public void validaSaldo(String saldo) {
		boolean flAtivo = false;
		
		while(!flAtivo) {	
			if(saldo.matches("-?(0|[1-9]+.[0-9]+)")) {
				setSaldo(Double.parseDouble(saldo));
				flAtivo = true;
			}else {
				System.out.println("Saldo inválido. Digite novamente");
				saldo = teclado.nextLine();
			}
		}
	}
}
