import java.util.ArrayList;

public class Agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stu		
		BuscaDeContatos busca = new BuscaDeContatos();
		
		busca.conectar();

		if(busca.estaConectado()) {
			//System.out.println("Conectado ao banco");
			//busca.listarContatos();
			
			System.out.println("--------------------");
			//busca.listarContatos();		
			//busca.editarContato(5, "Carlos", 20, "carlos@hot", "Estagiario");
			//busca.listarContatos();
				
			String contatos[] = {"Joana","Matheus","Thales","Thaís","Lucas","Daniela","Caio","Lucas","Carina","Ricardo","Noa"};
				
			for(int x = 0; x < contatos.length; x++) {
				//busca.inserirContatos(contatos[x], contatos.length+5, contatos[x]+"@contato", "Dev");
			}
			
			busca.deletarContato(5);
			busca.listarContatos();
			
			
		} else {
			System.err.println("Erro ap conectar ao banco");
		}
	}

}
