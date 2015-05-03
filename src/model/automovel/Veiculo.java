package model.automovel;

import model.Placa;
/**
 * Super Classe. Ele � a classe que � chamada por heran�a. 
 * 
 * @author Lucas Miranda, F�bio Dias e Bruno Clementino
 *
 */
public abstract class Veiculo {
	
	private String marca;
	private String cor;
	private String modelo;
	private Placa placa;
	private double precoAluguel;
	/**
	 * Nesse construtor t�m os parametros que s�o b�sicos para seja considerado apto para {@link Aluga}. 
	 * Sem esses parametros n�o poderam, ou n�o deveriam ser cadastrados.  
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
