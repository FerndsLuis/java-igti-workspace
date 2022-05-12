
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] frutas = {"uva", "morango", "laranja"};
		
		System.out.println(frutas[0]);
		
		for(int i = 0; i < frutas.length; i++)
		{
			int x = i + 1;
			System.out.println(x + "-" + frutas[i]);			
		}
	}

}
