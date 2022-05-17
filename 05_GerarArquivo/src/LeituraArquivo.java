import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variáveis
		String mostra = "";
		String nomeArquivo = "C:\\Users\\luish\\Documents\\Estudo\\java-igti-workspace\\05_GerarArquivo\\src\\teste.txt";
		String linha = "";
		
		//abrir o arquivo
		File arquivo = new File(nomeArquivo);
		
		//verificando se o arquivo existe
		if(arquivo.exists())
		{
			mostra = "Arquivo: " + nomeArquivo + " \naberto com sucesso";
			
			//mostra o resultado
			mostra += " - tamanho do arquivo: " + Long.toString(arquivo.length()) + " bytes";
			System.out.println(mostra);
			
			try {
				//lendo
				FileReader reader = new FileReader(arquivo);
				
				//Colocando na memória
				BufferedReader leitor = new BufferedReader(reader);
				
				//laço para ler o conteúdo - esvaziar pilha
				while(true)
				{
					linha = leitor.readLine();
					System.out.println(linha);
					
					//forçar a saída					
					if(linha == null) break;
				}
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("Erro: " + e.getMessage());
			}
			
		}
		
	}

}
