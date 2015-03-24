package testes;

import java.util.ArrayList;
import java.util.List;

import model.Placa;
import model.automovel.Carro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controller.CarroController;
/**
 * O projeto consiste em uma empresa que deseja informatizar o sistema de
 * aluguel de veiculos. A empresa trabalha com aluguel de carros e motos. Para
 * isso ele quer cadastrar os ve�culos informando: placa, cor, modelo,
 * fabricante, etc;
 * 
 * Aqui ser� feito os testes referentes ao carro.
 * 
 * @author Lucas Miranda, F�bio Dias e Bruno Clementino.
 *
 */
public class CarroTest {

	private CarroController carroCRUD;
	
	private Carro carro1, carro2, carro3; 
	private List<Carro> carros;
	public Placa placa1, placa2, placa3;

	@Before
	public void setUp() {
		placa1 = new Placa("ABC-2015", "Para�ba", "Campina Grande");
		carro1 = new Carro("Fiat", "Branco", "Siena", "Sedan", placa1, 4);
		carroCRUD = new CarroController();
		carros = new ArrayList<Carro>();
		
	}

	@Test
	public void testCarro() {
		Assert.assertEquals(0, carroCRUD.qtdCarros());
		carroCRUD.cadastrar(carro1);
		Assert.assertEquals(1, carroCRUD.qtdCarros());
		carroCRUD.remove(placa1);
		Assert.assertEquals(0, carroCRUD.qtdCarros());

		carroCRUD.cadastrar(carro1);

		placa2 = new Placa("OFF-2015", "Para�ba", "Campina Grande");
		carro2 = new Carro("Chevrolet", "Branco", "Corsa", "Sedan", placa2, 4);
		carroCRUD.cadastrar(carro2);
		Assert.assertEquals(2, carroCRUD.qtdCarros());

		carro3 = new Carro("Chevrolet", "Azul", "Corsa", "Hatch", placa1, 2);
		carroCRUD.atualizar(placa1, carro3);
		Assert.assertEquals(2, carroCRUD.qtdCarros());
		
		carros.add(carro2);
		carros.add(carro3);
		Assert.assertEquals(carros, carroCRUD.consultar("Chevrolet"));
		
		Assert.assertEquals(carro3, carroCRUD.consultar(placa1));
		
		
	}

}
