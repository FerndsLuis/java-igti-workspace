import java.util.Scanner;

public class ProcessaTabuada {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int guardaNumero;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Tabuada deseja: ");
		guardaNumero = teclado.nextInt();	
		
		
		if(guardaNumero >= 1 && guardaNumero <= 9) {
			for(int x = 0; x <= 10; x++) {
				System.out.println(x + " x " + guardaNumero + " = "+ x * guardaNumero);
			}
		}else {
			System.out.println("Número inválido");		
		}
	}	


}
