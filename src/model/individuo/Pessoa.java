package model.individuo;

/**
 * Classe Pessoa que tem como atributos: nome, cpf, rg e telefone.
 * @author Lucas Miranda
 *
 */
public class Pessoa {
	
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	
	public Pessoa(String nome, String cpf, String rg, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
