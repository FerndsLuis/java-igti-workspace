import java.util.HashMap;
import java.util.Scanner;

public class ProcessaDadosMap {
	public static void main(String[] args) {
		
//		Criar um super menu
//		1�) Inserir Registro - While 5
//		2�) Lista todos os Registros
//		3�) Lista somente o registro a ser consultado  Pesquisa = Marca
//		4�) Exclua o registro com base no �tem consultado Exclus�o por Produto
//		5�) Sair
//
//		Produto,Valor,Marca

		int opcao = 0;
		Scanner teclado = new Scanner(System.in);
		
		HashMap<String, String> dados = new HashMap<String, String>();
		
		System.out.println("1 - inserir \n2 - listar \n3 - listar pela marca \n4 - excluir por produto \n5 - sair");		
		
		switch(opcao) {
		case 1:
			int x = 0;
			System.out.println("Adi��o");	
			do{
				
			}while(x < 5);
			break;
		case 2:
			System.out.println("Subtra��o");
			break;
		case 3:
			System.out.println("divis�o");
			break;
		case 4:
			System.out.println("multiplica��o");				
			break;
		case 5:
			System.out.println("sair");
			break;
		}
	}
}
