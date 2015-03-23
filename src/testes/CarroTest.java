package testes;

import model.Aluga; 
import model.Endereco;
import model.Placa;
import model.automovel.Carro;
import model.individuo.Cliente;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controller.CarroCRUD;

public class CarroTest {

	private CarroCRUD carroCRUD;
	private Carro carro;
	public Placa placa;

	@Before
	public void setUp() {
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

		Endereco e1 = new Endereco("Rua 01", "Bairro 01", 2);
		Cliente c2 = new Cliente("Lucas", "23123", "8381283189", "83123123", e1);
		
		Aluga alugar = new Aluga(c2, carro, 339.0);
		Aluga alugar2 = new Aluga(c2, carro, 339.0);
		
		
	}

}
