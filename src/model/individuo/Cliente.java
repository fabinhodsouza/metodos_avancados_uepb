package model.individuo;

import model.Endereco;

public class Cliente extends Pessoa {
	
	private Endereco endereco;

	public Cliente(String nome, String cpf, String rg, String telefone, Endereco endereco) {
		super(nome, cpf, rg, telefone);
		this.setEndereco(endereco);
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
