import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) throws IOException  {
		
		int num = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual tabuada você deseja: ");
		num = teclado.nextInt();
		
		FileWriter arquivo = new FileWriter("C:\\Users\\luish\\Documents\\Estudo\\java-igti-workspace\\04_TabuadaGravar\\src\\teste.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		for(int x = 0; x <= 10; x++) {
			gravarArquivo.printf(x + "x"+ num + "=" + (x * num) + "\n");
		}
		
		
		//fechar arquivo
		arquivo.close();
		
	}
}
