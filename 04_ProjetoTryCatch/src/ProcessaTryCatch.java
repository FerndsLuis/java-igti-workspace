
public class ProcessaTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//contextos
		String frase = null;
		String novaFrase = null;
		
		
		try
		{
			novaFrase = novaFrase.toUpperCase();
		}
		catch(NullPointerException e)
		{
			System.out.println("Se a frase estiver nulla,");
			frase = "Frase vázia";
		}
		finally
		{
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println(frase + " - " + novaFrase);
	}

}
