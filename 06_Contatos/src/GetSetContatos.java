
public class GetSetContatos {
	
	//vari�veis
	private String nome;
	private String email;
	
	//m�todo
	public  GetSetContatos(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
