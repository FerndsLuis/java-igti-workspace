import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome_aluno;
		int nota1, nota2, nota3, nota4;
		double media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		nome_aluno = teclado.nextLine();
		
		System.out.println("Digite a nota1");
		nota1 = teclado.nextInt();
		System.out.println("Digite a nota5");
		nota2 = teclado.nextInt();
		System.out.println("Digite a nota3");
		nota3 = teclado.nextInt();
		System.out.println("Digite a nota4");
		nota4 = teclado.nextInt();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Nome do aluno é %s possui as seguinte notas nota1=%d, nota2=%d, nota3=%d, nota4=%d. Sua média é: %.2f" , 
							nome_aluno, nota1, nota2, nota3, nota4, media);
		
		System.out.println("");
		
		if(media < 5 ) {
			System.out.println("Aluno reprovado");
		} else if(media == 5) {
			System.out.println("Aluno recuperação");
		}else {
			System.out.println("Aluno aprovado");
		}
		
		
	}
	
}
