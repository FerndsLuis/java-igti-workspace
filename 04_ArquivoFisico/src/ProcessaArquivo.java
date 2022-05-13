import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProcessaArquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Variável
		String nome = "Petrolina";		
		
		//criar arquivo
		FileWriter arquivo = new FileWriter("C:\\Users\\luish\\Documents\\Estudo\\java-igti-workspace\\04_ArquivoFisico\\src\\teste.txt");
		//Gravando arquivo
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		//Escrevendo no arquivo
		gravarArquivo.printf("Resultado %s", nome);
		
		//fechar arquivo
		arquivo.close();
	}
}
