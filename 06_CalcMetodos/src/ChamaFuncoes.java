import java.util.Scanner;

public class ChamaFuncoes {

	public static void main(String[] args) {
		
		boolean ativo = false;
		int opcao;
		int num1 = 0;
		int num2 = 0;
		Scanner teclado = new Scanner(System.in);
		
		Divisao div = new Divisao();
		Multiplicacao mul = new Multiplicacao();
		Soma som = new Soma();
		Subtracao sub = new Subtracao();
		
		while(!ativo)
		{
			System.out.println("Escolha uma opção");
			System.out.println("1-adição\n2-subtracao\n3-divisao\n4-multiplicao\n5-sair");
			opcao = teclado.nextInt();			
			switch (opcao) {
			case 1: 
				System.out.println("Numero 1 = ");
				num1 = teclado.nextInt();
				System.out.println("Numero 2 = ");
				num2 = teclado.nextInt();				
				som.Calcular(num1, num2);
				break;
			case 2: 
				System.out.println("Numero 1 = ");
				num1 = teclado.nextInt();
				System.out.println("Numero 2 = ");
				num2 = teclado.nextInt();				
				sub.Calcular(num1, num2);
				break;
			case 3: 
				System.out.println("Numero 1 = ");
				num1 = teclado.nextInt();
				System.out.println("Numero 2 = ");
				num2 = teclado.nextInt();				
				div.Calcular(num1, num2);
				break;
			case 4:
				System.out.println("Numero 1 = ");
				num1 = teclado.nextInt();
				System.out.println("Numero 2 = ");
				num2 = teclado.nextInt();				
				mul.Calcular(num1, num2);
				break;
			case 5: 
				ativo = true;
				break;
			}
			System.out.println("=================");
		}	
		

	}

}
