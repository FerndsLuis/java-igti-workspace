import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

//			Sistema de C�lculo
//		===============================
//		1 - adi��o
//		valor1 + valor 2 mostrar resultado
//		2 - subtra��o
//		valor1 -valor2 = resultado
//		3 - divis�o
//		4 - multiplica��o
//		5 - sair
//		default
//		Op��o Inv�lida
//		do while
//		Op��es ser�o SWCase
//		tratar a entrada de dados com If	
		
		int opcao=0;
		int x,y;
		
		do{
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("1 - adi��o \n2 - subtra��o \n3 - divis�o \n4 - multiplica��o \n5 - sair");
			opcao = teclado.nextInt();			
			
			if(opcao <= 0 || opcao >= 6)
			{
				System.out.println("Op��o inv�lida");
			}
			else
			{
				switch(opcao) {
				case 1:					
					System.out.println("Adi��o");
					System.out.print("Valor1: ");
					x = teclado.nextInt();	
					System.out.print("Valor2: ");
					y = teclado.nextInt();
					
					System.out.println("Resultado: "+ y+x);
					break;
				case 2:
					System.out.println("Subtra��o");
					System.out.print("Valor1: ");
					x = teclado.nextInt();	
					System.out.print("Valor2: ");
					y = teclado.nextInt();
					
					System.out.println("Resultado: "+ (y - x));
					break;
				case 3:
					System.out.println("divis�o");
					System.out.print("Valor1: ");
					x = teclado.nextInt();	
					System.out.print("Valor2: ");
					y = teclado.nextInt();
					
					System.out.println("Resultado: "+ (y / x));
					break;
				case 4:
					System.out.println("multiplica��o");
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
