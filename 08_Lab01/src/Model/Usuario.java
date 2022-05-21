package Model;

public class Usuario {
	private String nome;
	private String email;
	private String idade;
	private String profissao;	
	
	
	public Usuario() {
		super();
	}

	public Usuario(String nome, String email, String idade, String profissao) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.profissao = profissao;
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
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
