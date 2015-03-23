package model.automovel;

import model.Placa;
/**
 * Classe Moto herda da classe {@link Veiculo}.
 * @author Lucas Miranda, Fábio Dias e Bruno Clementino
 *
 */
public class Moto extends Veiculo {
	/**
	 * Quantidade de roda da {@link Moto}. A Moto pode ser comum, triciculos ou que tenha quatro os quadriciclos.
	 */
	private Integer roda;

	/**
	 * Método contrutor defaul da classe.
	 * @param marca
	 * @param cor
	 * @param modelo
	 * @param tipoModelo
	 * @param placa
	 * @param roda
	 */
	public Moto(String marca, String cor, String modelo,
			Placa placa, Integer roda) {
		super(marca, cor, modelo, placa);
		this.setRoda(roda);
	}
	
	/**
	 * Retorna a quantidade de rodas da {@link Moto} 
	 * @return Integer
	 */
	public Integer getRoda() {
		return roda;
	}
	/**
	 * Modifica a quantidade de rodas
	 * @param roda
	 */
	public void setRoda(Integer roda) {
		this.roda = roda;
	}	
}
