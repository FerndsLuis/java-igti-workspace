import java.util.Scanner;

public class ProcessaTudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ativo = false; 
		
		MostraPrecoImprossora pImpressora = new MostraPrecoImprossora();
		MostraPrecoMonitor pMonitor = new MostraPrecoMonitor();
		MostraPrecoMouse pMouse = new MostraPrecoMouse();
		MostraPrecoScanner pScanner = new MostraPrecoScanner();
		MostraPrecoTeclado pTeclado = new MostraPrecoTeclado();
		
		while(!ativo)
		{
			Scanner teclado = new Scanner(System.in);
			int opcao;
			
			System.out.println("Escolha uma opção:");
			System.out.println(" 1 - Mouse\n 2 - Teclado\n 3 - Impressora\n 4 - Scannern\n 5 - Monitor\n 6 - Sair\n");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1: 
				pMouse.Preco();
				break;
			case 2: 
				pTeclado.Preco();
				break;
			case 3: 
				pImpressora.Preco();
				break;
			case 4: 
				pScanner.Preco();
				break;
			case 5: 
				pMonitor.Preco();
				break;
			case 6: 
				ativo = true;
				break;
			}		
			
		}

	}

}
