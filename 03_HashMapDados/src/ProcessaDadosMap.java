import java.util.HashMap;
import java.util.Scanner;

public class ProcessaDadosMap {
	public static void main(String[] args) {
		
//		Criar um super menu
//		1º) Inserir Registro - While 5
//		2º) Lista todos os Registros
//		3º) Lista somente o registro a ser consultado  Pesquisa = Marca
//		4º) Exclua o registro com base no ítem consultado Exclusão por Produto
//		5º) Sair
//
//		Produto,Valor,Marca

		int opcao = 0;
		Scanner teclado = new Scanner(System.in);
		
		HashMap<String, String> dados = new HashMap<String, String>();
		
		System.out.println("1 - inserir \n2 - listar \n3 - listar pela marca \n4 - excluir por produto \n5 - sair");		
		
		switch(opcao) {
		case 1:
			int x = 0;
			System.out.println("Adição");	
			do{
				
			}while(x < 5);
			break;
		case 2:
			System.out.println("Subtração");
			break;
		case 3:
			System.out.println("divisão");
			break;
		case 4:
			System.out.println("multiplicação");				
			break;
		case 5:
			System.out.println("sair");
			break;
		}
	}
}
