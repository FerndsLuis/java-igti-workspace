import java.io.FileWriter;
import java.io.PrintWriter;

public class CriaArquivo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Gerando informa��es de registro
		String[] nomes = {"luis","carlos","jos�","m�ria","joana"};
		
		//Gerar arquivos
		FileWriter arquivo = new FileWriter("C:\\Users\\luish\\Documents\\Estudo\\java-igti-workspace\\05_GerarArquivo\\src\\teste.txt");
		
		//permite escrever/gravar
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		gravarArquivo.printf("Nome das pessoas: " + "%n");
		
		for(int registros = 0; registros < nomes.length; registros++)
		{
			gravarArquivo.printf(nomes[registros] + "%n");
		}
	
		gravarArquivo.close();
		
		
		
	}

}
