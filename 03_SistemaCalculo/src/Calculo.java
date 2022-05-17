import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

//			Sistema de Cálculo
//		===============================
//		1 - adição
//		valor1 + valor 2 mostrar resultado
//		2 - subtração
//		valor1 -valor2 = resultado
//		3 - divisão
//		4 - multiplicação
//		5 - sair
//		default
//		Opção Inválida
//		do while
//		Opções serão SWCase
//		tratar a entrada de dados com If	
		
		int opcao=0;
		int x,y;
		
		do{
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("1 - adição \n2 - subtração \n3 - divisão \n4 - multiplicação \n5 - sair");
			opcao = teclado.nextInt();			
			
			if(opcao <= 0 || opcao >= 6)
			{
				System.out.println("Opção inválida");
			}
			else
			{
				switch(opcao) {
				case 1:					
					System.out.println("Adição");
					System.out.print("Valor1: ");
					x = teclado.nextInt();	
					System.out.print("Valor2: ");
					y = teclado.nextInt();
					
					System.out.println("Resultado: "+ y+x);
					break;
				case 2:
					System.out.println("Subtração");
					System.out.print("Valor1: ");
					x = teclado.nextInt();	
					System.out.print("Valor2: ");
					y = teclado.nextInt();
					
					System.out.println("Resultado: "+ (y - x));
					break;
				case 3:
					System.out.println("divisão");
					System.out.print("Valor1: ");
					x = teclado.nextInt();	
					System.out.print("Valor2: ");
					y = teclado.nextInt();
					
					System.out.println("Resultado: "+ (y / x));
					break;
				case 4:
					System.out.println("multiplicação");
					System.out.print("Valor1: ");
					x = teclado.nextInt();	
					System.out.print("Valor2: ");
					y = teclado.nextInt();
					
					System.out.println("Resultado: "+ (y * x));					
					break;
				case 5:
					System.out.println("sair");
					break;
					default:
						System.out.println();
				}
			}
			
			System.out.println("--------------------");
			
		}while(opcao != 5);
		


	}

}
