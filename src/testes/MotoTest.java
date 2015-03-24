package testes;

import java.util.ArrayList;
import java.util.List;

import model.Placa;
import model.automovel.Moto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controller.MotoController;

/**
 * Testes referentes a  {@link Moto} 
 * @author Lucas Miranda, Fábio Dias e Bruno Clementino.
 *
 */
public class MotoTest {

	private MotoController motoCRUD;
	
	private Moto moto1, moto2, moto3; 
	private List<Moto> motos;
	public Placa placa1, placa2, placa3;

	@Before
	public void setUp() {
		placa1 = new Placa("ABC-2015", "Paraíba", "Campina Grande");
		moto1 = new Moto("Honda", "Vermelho", "Biz" , placa1, 2);
		motoCRUD = new MotoController();
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
		moto2 = new Moto("ByCristo", "Preto", "Triciclo", placa2, 3);
		motoCRUD.cadastrar(moto2);
		Assert.assertEquals(2, motoCRUD.qtdMotos());

		moto3 = new Moto("Honda", "Amarelo", "TRX 420 FourTrax", placa1, 4);
		motoCRUD.atualizar(placa1, moto3);
		Assert.assertEquals(2, motoCRUD.qtdMotos());
		
		motos.add(moto3);
		Assert.assertEquals(motos, motoCRUD.consultar("Honda"));
		
		Assert.assertEquals(moto3, motoCRUD.consultar(placa1));
		
		
	}

}
