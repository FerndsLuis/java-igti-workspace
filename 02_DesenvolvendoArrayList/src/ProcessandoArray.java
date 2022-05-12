import java.util.ArrayList;

public class ProcessandoArray {
	
	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("renam");
		nomes.add("luis");
		nomes.add("carlos");
		
		
		//mostrando os dados
		System.out.println(nomes);
		
		//alterando dado do arraylist
		nomes.set(0, "munizes");
		System.out.println(nomes);
		
		//Removendo um registro do arraylist
		nomes.remove(1);
		System.out.println(nomes);
		
		//tamanho do array
		System.out.println(nomes.size());
	}
	
}
