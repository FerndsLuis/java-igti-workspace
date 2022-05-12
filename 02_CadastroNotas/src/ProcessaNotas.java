import java.util.Scanner;

public class ProcessaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nome = {"","",""};
		int nota[] = {0,0,0};
		Double media;
		
		for(int x = 0; x < 3; x++)
		{
			Scanner teclado = new Scanner(System.in);
			System.out.println("Qual nome: ");
			nome[x] = teclado.nextLine();				
			
				System.out.println("Nota1: ");
				nota[0] = teclado.nextInt();
				System.out.println("Nota2: ");
				nota[1] = teclado.nextInt();
				System.out.println("Nota3: ");
				nota[2] = teclado.nextInt();	
			
			System.out.println("Nome : "+ nome[x] + ", nota1: "+ nota[0] + ", nota2: "+ nota[1] + ", nota3:"+ nota[2] );
			media = Double.valueOf((nota[0] + nota[1] + nota[2])/3);
			if(media < 4)
			{
				System.out.println("Reprovado");
			}else if (media == 5)
			{
				System.out.println("Recuperação");	
			}else
			{
				System.out.println("Aprovado");	
			}
			
			System.out.println("-------------------------");
			
		}
	}

}
