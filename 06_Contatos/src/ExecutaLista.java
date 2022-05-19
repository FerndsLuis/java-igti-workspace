import java.util.ArrayList;

public class ExecutaLista {
	
	public static void main(String[] args) {
		
		//criando ArrayList
		ArrayList<GetSetContatos> contatos = new ArrayList<>();
		
		GetSetContatos contato1 = new GetSetContatos("luis", "ale@gama");
		GetSetContatos contato2 = new GetSetContatos("vera", "ale@gama");
		GetSetContatos contato3 = new GetSetContatos("igor", "verae@gama");
		GetSetContatos contato4 = new GetSetContatos("alex", "igo@gama");
		GetSetContatos contato5 = new GetSetContatos("bia", "miria@gama");		
		
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		contatos.add(contato5);	
		
		
		//total
		System.out.println("Total de registros: " + contatos.size());
		
		System.out.println("============");
		
		//Registro 2
		System.out.println(contatos.get(1).getNome() + " - " + contatos.get(1).getEmail());
		
		System.out.println("============");
		
		//Remove bia		
		for(int x = 0; x < contatos.size(); x++)
		{
			if(contatos.get(x).getNome() == "bia")
				contatos.remove(x);
		}
		
		System.out.println("============");
		
		for(GetSetContatos c:contatos) {
			System.out.println(c.getNome() + " - " + c.getEmail());			
		}
		
	}
	
}
