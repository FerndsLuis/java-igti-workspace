
public class ProcessaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criando um array
		String[] carros = {"Gol","Uno","hb20"};
		
		int contador = 0;
		
		
		do
		{
			System.out.println(carros[contador]);
			
			contador++;
		}while(contador < carros.length);
	}

}
