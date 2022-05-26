package model;

public class Cliente {
	private String Ag;
	private String Conta;
	private String Nome;
	private String Email;
	private String Telefone;
	private double Saldo;	
	
	
	public Cliente() {
		super();
	}

	public Cliente(String ag, String conta, String nome, String email, String telefone, double saldo) {
		super();
		Ag = ag;
		Conta = conta;
		Nome = nome;
		Email = email;
		Telefone = telefone;
		Saldo = saldo;
	}
	
	public String getAg() {
		return Ag;
	}
	public void setAg(String ag) {
		Ag = ag;
	}
	public String getConta() {
		return Conta;
	}
	public void setConta(String conta) {
		Conta = conta;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}	
}
