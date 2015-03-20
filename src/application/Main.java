package application;

import controller.VeiculoCRUD;
import model.Placa;
import model.automovel.Carro;
import model.automovel.Veiculo;

/**
 * 
 * @author Lucas Miranda, Fábio Dias e Bruno Clementino.
 *
 */
public class Main {
	
	Placa placa = new Placa("abcd2015", "Paraíba", "Campina Grande");
	Carro carro = new Carro("Fiat", "Branco", "Gol", "Quadrado", placa, 2);
	
	VeiculoCRUD carroCRUD = new VeiculoCRUD();
	
	public Main() {
		carroCRUD.cadastrar_carro(carro);
	
		mostrarTodosOsCarros();
	
	}
	
	public void mostrarTodosOsCarros(){
		int cont = 1;
		System.out.println("Carros cadastrados:\n");
		System.out.println("MARCA\t|\tCOR\t|\tMODELO\t|\tTIPO DO CARRO\t|\tPORTAS\t|\tPLACA");
		for(Veiculo carro : carroCRUD.getVeiculo()){
			System.out.println(cont+" "+carroCRUD.mostraCarro(carro.getMarca()));
			cont++;
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
