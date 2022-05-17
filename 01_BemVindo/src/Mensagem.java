
public class Mensagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String produto;
		double valor;
		
		produto = "Mouse";
		valor = 25.53;
		
		System.out.print("Nome do produto é " + produto + " com valor de R$" + valor);
		System.out.println("");
		System.out.printf("Nome do produto é %s com valor de R$%.2f", produto, valor);

	}

}
