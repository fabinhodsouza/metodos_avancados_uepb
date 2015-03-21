package model;

/**
 * Estrutura que guarda e gera o endereço.
 * @author Lucas Miranda, Fábio Dias e Bruno Clementino
 *
 */
public class Endereco {
	
	private String rua;
	private String bairro;
	private Integer numero;
	
	public Endereco(String rua, String bairro, Integer numero) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
