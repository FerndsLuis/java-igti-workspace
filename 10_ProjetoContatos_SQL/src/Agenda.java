
public class Agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stu		
		BuscaDeContatos busca = new BuscaDeContatos();
		
		busca.conectar();

		if(busca.estaConectado()) {
			System.out.println("Conectado ao banco");
			busca.listarContatos();
			
			System.out.println("--------------------");
			busca.listarComFiltro();
		} else {
			System.err.println("Erro ap conectar ao banco");
		}
	}

}