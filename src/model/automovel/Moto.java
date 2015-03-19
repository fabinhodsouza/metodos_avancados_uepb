package model.automovel;

import model.Placa;

public class Moto extends Veiculo {
	
	private Integer roda;

	public Moto(String marca, String cor, String modelo, String tipoModelo,
			Placa placa, Integer roda) {
		super(marca, cor, modelo, tipoModelo, placa);
		this.setRoda(roda);
	}

	public Integer getRoda() {
		return roda;
	}

	public void setRoda(Integer roda) {
		this.roda = roda;
	}
	
}
