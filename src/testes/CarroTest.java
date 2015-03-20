package testes;

import static org.junit.Assert.*;
import model.Placa;
import model.automovel.Carro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controller.CarroCRUD;

public class CarroTest {

	private CarroCRUD carroCRUD;
	private Carro carro;
	public Placa placa;
	
	@Before
	public void setUp(){
		placa = new Placa("abcd2015", "Paraíba", "Campina Grande");
		carro = new Carro("Fiat", "Branco", "Gol", "Quadrado", placa, 2);
		carroCRUD = new CarroCRUD();
	}
	
	@Test
	public void testCarro() {
		Assert.assertEquals(0, carroCRUD.qtdCarros());
		carroCRUD.cadastrar(carro);
		Assert.assertEquals(1, carroCRUD.qtdCarros());
		carroCRUD.remove(placa);
		Assert.assertEquals(0, carroCRUD.qtdCarros());
		
		carroCRUD.cadastrar(carro);
		
		placa.setCodigo("afaf2015");
		carro = new Carro("Chevrolet", "Branco", "Corsa", "Cedan", placa, 4);
		carroCRUD.cadastrar(carro);
		Assert.assertEquals(2, carroCRUD.qtdCarros());
		
		placa.setCodigo("afaf2015");
		carro = new Carro("Chevrolet", "Azul", "Corsa", "Cedan", placa, 4);
		carroCRUD.atualizar(placa, carro);
		Assert.assertEquals(2, carroCRUD.qtdCarros());
		
		
		
		
		
	}

}
