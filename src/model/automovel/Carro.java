package model.automovel;

import model.Placa;

public class Carro extends Veiculo {
	
	private Integer porta;
	
	public Carro(String marca, String cor, String modelo, String tipoModelo,
			Placa placa, Integer porta) {
		super(marca, cor, modelo, tipoModelo, placa);
		this.setPorta(porta);
	}
	

	public Integer getPorta() {
		return porta;
	}

	public void setPorta(Integer porta) {
		this.porta = porta;
	}	

}
