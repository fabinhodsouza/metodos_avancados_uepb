package testes;

import java.util.ArrayList;
import java.util.List;

import model.Placa;
import model.automovel.Moto;
import model.automovel.Moto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controller.MotoCRUD;
import controller.MotoCRUD;


public class MotoTest {

	private MotoCRUD motoCRUD;
	
	private Moto moto1, moto2, moto3; 
	private List<Moto> motos;
	public Placa placa1, placa2, placa3;

	@Before
	public void setUp() {
		placa1 = new Placa("ABC-2015", "Paraíba", "Campina Grande");
		moto1 = new Moto("Honda", "Vermelho", "Biz" , placa1, 2);
		motoCRUD = new MotoCRUD();
		motos = new ArrayList<Moto>();
		
	}

	@Test
	public void testMoto() {
		Assert.assertEquals(0, motoCRUD.qtdMotos());
		motoCRUD.cadastrar(moto1);
		Assert.assertEquals(1, motoCRUD.qtdMotos());
		motoCRUD.remove(placa1);
		Assert.assertEquals(0, motoCRUD.qtdMotos());

		motoCRUD.cadastrar(moto1);

		placa2 = new Placa("OFF-2015", "Paraíba", "Campina Grande");
		moto2 = new Moto("Chevrolet", "Branco", "Corsa", "Sedan", placa2, 4);
		motoCRUD.cadastrar(moto2);
		Assert.assertEquals(2, motoCRUD.qtdMotos());

		moto3 = new Moto("Chevrolet", "Azul", "Corsa", "Hatch", placa1, 2);
		motoCRUD.atualizar(placa1, moto3);
		Assert.assertEquals(2, motoCRUD.qtdMotos());
		
		motos.add(moto2);
		motos.add(moto3);
		Assert.assertEquals(motos, motoCRUD.consultar("Chevrolet"));
		
		Assert.assertEquals(moto3, motoCRUD.consultar(placa1));
		
		
	}

}
