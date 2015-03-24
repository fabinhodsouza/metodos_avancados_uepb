package model.automovel;

import model.Placa;

/**
 * Essa classe herda da classe {@link Veiculo} Tem como atributos: porta: Integer
 * 
 * @author Lucas Miranda, Fábio Dias e Bruno Clementino
 */

public class Carro extends Veiculo {
	/** Atributo que indica qual o modelo do carro. Ex: Sedan ou hatch */
	private String tipoModelo;
	
	/** Atributo que mostra a quantidade de porta do carro. */
	private Integer porta;
	
	
	/**
	 * Método contrutor: recebe seis parametros: 
	 * 	<li>marca</li>
	 * 	<li>cor</li>
	 * 	<li>modelo</li>
	 * 	<li>tipoModelo</li>
	 * 	<li>placa</li>
	 * 	<li>porta</li>
	 * 
	 */
	public Carro(String marca, String cor, String modelo, String tipoModelo,
			Placa placa, Integer porta) {
		super(marca, cor, modelo, placa);
		this.setPorta(porta);
		this.setTipoModelo(tipoModelo);
	}
	
	/**
	 * Retorna a quantidade de porta do {@link Carro}
	 * @return {@literal Integer}
	 */
	public Integer getPorta() {
		return porta;
	}
	
	/**
	 * Modifica a quantidade de porta.
	 * @param porta
	 */
	public void setPorta(Integer porta) {
		this.porta = porta;
	}

	public String getTipoModelo() {
		return tipoModelo;
	}

	public void setTipoModelo(String tipoModelo) {
		this.tipoModelo = tipoModelo;
	}
	
	

}
