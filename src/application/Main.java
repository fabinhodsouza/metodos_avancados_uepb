package application;

import controller.CarroCRUD;
import model.Placa;
import model.automovel.Carro;

public class Main {
	
	Placa placa = new Placa("abcd2015", "Para�ba", "Campina Grande");
	Carro carro = new Carro("Fiat", "Branco", "Gol", "Quadrado", placa, 2);
	
	CarroCRUD carroCRUD = new CarroCRUD();
	
	public Main() {
		carroCRUD.cadastrar(carro);
		mostrarTodosOsCarros();
	}
	
	public void mostrarTodosOsCarros(){
		int cont = 1;
		System.out.println("Carros cadastrados:\n");
		System.out.println("MARCA\t|\tCOR\t|\tMODELO\t|\tTIPO DO CARRO\t|\tPORTAS\t|\tPLACA");
		for(Carro carro : carroCRUD.getCarros()){
			System.out.println(cont+" "+carroCRUD.mostraCarro(carro));
			cont++;
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
