package controller;

import java.util.ArrayList;
import java.util.List;

import model.Placa;
import model.automovel.Carro;
import model.automovel.Veiculo;

/**
 * Classe que Insere, atualiza, remove e seleciona os dados da base de dados.
 * 
 * @author Lucas Miranda, Fábio Dias e Bruno Clementino
 *
 */
public class VeiculoCRUD {

	private List<Veiculo> veiculos = new ArrayList<Veiculo>();

	/**
	 * Retorna a quantidade de {@link Veiculo} da {@link List}.
	 * 
	 * @return
	 */
	public int qtdCarros() {
		return veiculos.size();
	}

	/**
	 * Cadastra um carro. Trata já existe o {@link Carro} na lista.
	 * 
	 * @param carro
	 * @return
	 */
	public boolean cadastrar_carro(Carro carro) {
		if (!veiculos.contains(carro)) {
			return veiculos.add(carro);
		}
		return false;
	}

	/**
	 * Remove o {@link Carro}, caso não encontre o {@link Carro} ele irá
	 * retornar <code>false</code>
	 * 
	 * @param placa
	 * @return
	 */
	public boolean remove_carro(Placa placa) {

		for (Veiculo veiculo : veiculos) {
			if (veiculo.getPlaca().equals(placa)) {
				return veiculos.remove(veiculo);
			}
		}

		return false;
	}

	/**
	 * Atualiza o dados do {@link Carro}. A pesquisa é feita por intermedio da
	 * {@link Placa}. Caso seja encontrado retornará <code>true</code> senão
	 * <code>false</code>
	 * 
	 * @param placa
	 * @param carroAtualizado
	 * @return
	 */
	public boolean atualizar(Placa placa, Carro carroAtualizado) {

		for (Veiculo carro : veiculos) {
			if (carro.getPlaca().equals(placa)) {
				if (veiculos.remove(carro)) {
					return veiculos.add(carroAtualizado);

				}
				return false;
			}
		}

		return false;

	}

	/**
	 * Imprime o {@link Carro} pesquisando pela lista de carros;
	 * 
	 * @param placa
	 * @return
	 */
	public List<Veiculo> consultar(Placa placa) {
		List<Veiculo> carrosBusca = new ArrayList<Veiculo>();
		for (Veiculo veiculo : veiculos) {
			if (veiculo.getPlaca().equals(placa)) {
				carrosBusca.add(veiculo);
			}
		}
		if (carrosBusca.isEmpty()) {
			return null;
		}
		System.out.println(carrosBusca);
		return carrosBusca;
	}

	
	public List<Veiculo> consultar(String marca) {
		List<Veiculo> carrosBusca = new ArrayList<Veiculo>();
		for (Veiculo carro : veiculos) {
			if (carro.getMarca().equals(marca)) {
				carrosBusca.add(carro);
			}
		}
		return carrosBusca;
	}

	public List<Veiculo> getVeiculo() { 
		return veiculos;
	}

	/**
	 * Verifica se alguem já alugou o veiiculo.
	 * 
	 * @param carro
	 * @return {@link Boolean}
	 */
	public boolean verificaDisponibilidade(Veiculo veiculo) {
		for (Veiculo list: veiculos) {
			if (!list.getMarca().equals(veiculo.getPlaca())) {
				return true; 
			}			
		}
		return false;
	}
	
	/**
	 * É o toString para mostrar o {@link Carro}
	 * @param carro
	 * @return
	 */
	public String mostraCarro(Carro carro) {
		Placa placa = carro.getPlaca();
		return (carro.getMarca() + "\t|\t" + carro.getCor() + "\t|\t"
				+ carro.getModelo() + "\t|\t" + carro.getTipoModelo() + "\t|\t"
				+ carro.getPorta() + "\t|\t" + placa.getCodigo() + " "
				+ placa.getCidade() + "-" + placa.getEstado());
	}

}
