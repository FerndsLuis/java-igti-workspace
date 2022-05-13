import java.util.ArrayList;
import java.util.Scanner;

public class ProcessaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = 0;
		ArrayList<String> nomes = new ArrayList<String>();
		
		
		Scanner teclado = new Scanner(System.in);		
		
		for(int y = 0; y < 50; y++) {
			
		System.out.println("Escolha uma opção: \n 1 - Cadastro \n 2 - Consulta \n 3 - Visualização \n 4 - Exclua um registro \n 5 - Modifica um registro");
		opcao = teclado.nextInt();
			
		switch(opcao) {
		case 1:
			for(int x = 0; x < 3; x++)
			{				
				System.out.println("Digite o nome: ");
				nomes.add(teclado.nextLine());
			}
			break;
		case 2:
			System.out.println("Qual ID? ");
			System.out.println(nomes.get(teclado.nextInt()));
			break;
		case 3:
			System.out.println(nomes);
			break;
		case 4:
			System.out.println("Qual ID deseja excluir?  ");
			nomes.remove(teclado.nextInt());
			break;
		case 5:
			System.out.println("Qual ID é para modificar? ");
			int id = teclado.nextInt();
			System.out.println("Qual novo valor: ");
			nomes.set(id, teclado.nextLine());			
			break;
		}
		
		opcao = 0;
		}
		
		
		
	}

}
 