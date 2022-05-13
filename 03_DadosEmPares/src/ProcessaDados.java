import java.util.HashMap;

public class ProcessaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> capitaisCidades = new HashMap<String, String>();
		
		
		capitaisCidades.put("RJ", "Nova Iguaçu");
		capitaisCidades.put("SP", "Capital");
		capitaisCidades.put("MG", "Belo Horizonte");
		capitaisCidades.put("BH", "Salvador");
		
		//recupera todos os dados
		System.out.println(capitaisCidades);		
		
		//recupera um dado / pesquisa
		System.out.println(capitaisCidades.get("RJ"));
		
		//remover um registro
		capitaisCidades.remove("RJ");
		System.out.println(capitaisCidades);	
		
	}

}
