
public class FuncaoSe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criar uma variável 
		int media;
		media = 5;
		
		System.out.println("A média é "+ media);
		
		//criando uma condição verdadeira ou falso com IF = se
		if(media < 5 ) {
			System.out.println("Aluno reprovado");
		} else if(media == 5) {
			System.out.println("Aluno recuperação");
		}else {
			System.out.println("Aluno aprovado");
		}
	}

}
