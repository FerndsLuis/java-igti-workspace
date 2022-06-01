package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Listar {
	
	public void listarClientes() {
		System.out.println("**Listagem de clientes**");
		
		String mostra = "";
		String nomeArquivo = Paths.get("").toAbsolutePath().toString() + "\\arquivo.txt";
		String linha = "";
		
		File arquivo = new File(nomeArquivo);
		
		if(arquivo.exists())
		{
			try {
				//lendo
				FileReader reader = new FileReader(arquivo);				
				//Colocando na mem�ria
				BufferedReader leitor = new BufferedReader(reader);
				
				//la�o para ler o conte�do - esvaziar pilha
				while(true)
				{
					//for�ar a sa�da					
					if(linha == null) break;
					
					linha = leitor.readLine();
					System.out.println(linha);					
				}
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("Erro: " + e.getMessage());
			}
		}		
		
	}
}
