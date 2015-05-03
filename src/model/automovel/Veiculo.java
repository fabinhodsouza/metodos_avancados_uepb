package model.automovel;

import model.Placa;
/**
 * Super Classe. Ele é a classe que é chamada por herança. 
 * 
 * @author Lucas Miranda, Fábio Dias e Bruno Clementino
 *
 */
public abstract class Veiculo {
	
	private String marca;
	private String cor;
	private String modelo;
	private Placa placa;
	private double precoAluguel;
	/**
	 * Nesse construtor têm os parametros que são básicos para seja considerado apto para {@link Aluga}. 
	 * Sem esses parametros não poderam, ou não deveriam ser cadastrados.  
	 * 
	 * @param marca
	 * @param cor
	 * @param modelo
	 * @param tipoModelo
	 * @param placa
	 */
	public Veiculo(String marca, String cor, String modelo,
			Placa placa, double precoAluguel) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.placa = placa;
		this.precoAluguel = precoAluguel;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Placa getPlaca() {
		return placa;
	}

	public void setPlaca(Placa placa) {
		this.placa = placa;
	}

	public double getPrecoAluguel() {
		return precoAluguel;
	}

	public void setPrecoAluguel(double precoAluguel) {
		this.precoAluguel = precoAluguel;
	}
}
