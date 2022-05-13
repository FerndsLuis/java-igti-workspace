import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ProcessaArquivoTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> produtos = new ArrayList<String>();		
		produtos.add("mouse");
		produtos.add("teclado");
		produtos.add("scanner");
		produtos.add("impressora");
		produtos.add("Monitor");		
		
		try {
			FileWriter arquivo = new FileWriter("C:\\Users\\luish\\Documents\\Estudo\\java-igti-workspace\\04_ArquivoTryCatch\\src\\arquivo.txt");
			PrintWriter gravandoArquivo = new PrintWriter(arquivo);
			
			gravandoArquivo.print("Data do cadastro: 13/05/2022 \n");
			
			for(int x = 0; x < produtos.size(); x++) {				
				gravandoArquivo.print(produtos.get(x) + "\n");
			}
			
			arquivo.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro: " + e.getMessage());
		}
		
		
	}

}
