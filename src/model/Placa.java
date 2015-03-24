package model;

import model.automovel.Veiculo;

/**
 * Essa Classe é um atributo para o {@link Veiculo}. Fazendo a composição com veiculo.
 * @author Lucas Miranda, Fábio Dias e Bruno Clementino
 *
 */
public class Placa {
	/**
	 * O código da placa são as três letras mais o quatro numeros.
	 */
	private String codigo;
	/**Estado em que o Veiculo foi emplacado.*/
	private String estado;
	/**Cidade em que foi emplacado.*/
	private String cidade;
	
	/**
	 * Metodo contrutor que foi definido com padrão que toda placa deve ter: codigo, estado e cidade.
	 * @param codigo
	 * @param estado
	 * @param cidade
	 */
	public Placa(String codigo, String estado, String cidade) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.cidade = cidade;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}	
}
