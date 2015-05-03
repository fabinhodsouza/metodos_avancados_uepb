
import model.ListaVeiculos;
import model.Locacao;
import model.Placa;
import model.automovel.Veiculo;


public class Main {

	public static void main(String[] args) {
		Locacao locacao = new Locacao();
		Placa placa = new Placa("jdf 000-212", "Paraíba", "Campina Grande");
		Veiculo veiculo = new Veiculo("VW", "vermelho", "Gol", placa, 200);
		
		ListaVeiculos lista = new ListaVeiculos();
			lista.setQuantidade(2);
			lista.setVeiculo(veiculo);
		locacao.setListaVeiculos(lista);
		
		System.out.println(locacao.getValor());
	}

}
