package testes;

import model.Placa;
import model.automovel.Moto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controller.MotoCRUD;


public class MotoTest {

	private MotoCRUD motoCRUD;
	private Moto moto;
	public Placa placa;

	@Before
	public void setUp() {
		placa = new Placa("abc2015", "Paraíba", "Campina Grande");
		moto = new Moto("Honda", "Vermelho", "Fan", "2006", placa, 20);
		motoCRUD = new MotoCRUD();
		
	}

	@Test
	public void testCarro() {
		Assert.assertEquals(0, motoCRUD.qtdMotos());
		motoCRUD.cadastrar(moto);
		Assert.assertEquals(1, motoCRUD.qtdMotos());
		motoCRUD.remove(placa);
		Assert.assertEquals(0, motoCRUD.qtdMotos());

		motoCRUD.cadastrar(moto);

		placa.setCodigo("afa2015");
		moto = new Moto("Yamaha", "Preto", "Brós", "2009", placa, 120);
		motoCRUD.cadastrar(moto);
		Assert.assertEquals(2, motoCRUD.qtdMotos());

		placa.setCodigo("afa2015");
		moto = new Moto("Yamaha", "Vermelho", "Brós", "2009", placa, 120);
		motoCRUD.atualizar(placa, moto);
		Assert.assertEquals(2, motoCRUD.qtdMotos());
		
		
	}

}
