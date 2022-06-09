package model;

import java.util.Date;

public class Livro {
	private int id;
	private String nome;
	private String autor;
	private String editora;
	private Date data_lancamento;
	
	
	
		
	public Livro() {
		super();
	}
	
	public Livro(String nome, String autor, String editora, Date data_lancamento) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.data_lancamento = data_lancamento;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Date getData_lancamento() {
		return data_lancamento;
	}
	public void setData_lancamento(Date data_lancamento) {
		this.data_lancamento = data_lancamento;
	}
	
	
	
	
}
