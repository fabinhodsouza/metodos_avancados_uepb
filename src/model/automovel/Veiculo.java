package model.automovel;

import model.Aluga;
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
	private String tipoModelo;
	private Placa placa;
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
	public Veiculo(String marca, String cor, String modelo, String tipoModelo,
			Placa placa) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.tipoModelo = tipoModelo;
		this.placa = placa;
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

	public String getTipoModelo() {
		return tipoModelo;
	}

	public void setTipoModelo(String tipoModelo) {
		this.tipoModelo = tipoModelo;
	}

	public Placa getPlaca() {
		return placa;
	}

	public void setPlaca(Placa placa) {
		this.placa = placa;
	}
}
