package controller;

import java.util.ArrayList;
import java.util.List;

import model.Placa;
import model.automovel.Carro;
/**
 * Essa classe controla todo o fluxo de informação do sistema. 
 * Nela têm as funções de cadastrar, remover, atualizar, consultar,
 * mostrar carro. 
 * 
 * @author Lucas Miranda, Fabio Dias e Bruno Clementino.
 *
 */
public class CarroController {

	/*** vetor de {@link Carro} */
	private List<Carro> carros = new ArrayList<Carro>();

	/**
	 * Mostra a quantidade de {@link Carro}
	 * @return {@link Integer}
	 */
	public int qtdCarros() {
		return carros.size();
	}

	/**
	 * Adiciona o {@link Carro} no vetor. Caso já exista o {@link Carro} no vetor será retornado <code>false</code>
	 * @param carro
	 * @return {@link Boolean}
	 */
	public boolean cadastrar(Carro carro) {

		if (!carros.contains(carro)) {
			return carros.add(carro);
		}
		return false;

	}

	/**
	 * Remove o {@link Carro}, para encontrar o {@link Carro} usa-se a placa. Caso não seja encontrado retorna um <code>false</code> 
	 * 
	 * @param placa
	 * @return {@link Boolean}
	 */
	public boolean remove(Placa placa) {

		for (Carro carro : carros) {
			if (carro.getPlaca().equals(placa)) {
				return carros.remove(carro);
			}
		}

		return false;
	}

	/**
	 * Para atualizar o {@link Carro}, primeiro busca no vetor e depois remove o carro e depois adiciona no vetor.
	 * 
	 * @param placa
	 * @param carroAtualizado
	 * @return {@link Boolean}
	 */
	public boolean atualizar(Placa placa, Carro carroAtualizado) {

		for (Carro carro : carros) {
			if (carro.getPlaca().equals(placa)) {
				if (carros.remove(carro)) {
					return carros.add(carroAtualizado);
				}
				return false;
			}
		}

		return false;

	}

	/**
	 * Esse método retorna o {@link Carro} com a pesquisa utilizando-se a placa.  
	 *  
	 * @param placa
	 * @return {@link Carro}
	 */
	public Carro consultar(Placa placa) {
		
		for (Carro carro : carros) {
			if (carro.getPlaca().equals(placa)) {
				return carro;
			}
		}
		
		return null;
	}

	/**
	 * Retorna um vetor de {@link Carro} da mesma marca/fabricante.
	 * 
	 * @param marca
	 * @return {@link List>}
	 */
	public List<Carro> consultar(String marca) {
		List<Carro> carrosBusca = new ArrayList<Carro>();
		for (Carro carro : carros) {
			if (carro.getMarca().equals(marca)) {
				carrosBusca.add(carro);
			}
		}
		return carrosBusca;
	}

	/**
	 * Metodo que retorna o vetor de {@link Carro}
	 * @return {@link List}
	 */
	public List<Carro> getCarros() {
		return carros;
	}

	/**
	 * Um metodo que retorna as informações do {@link Carro}. (toString)
	 * @param carro
	 * @return {@link String}
	 */
	public String mostraCarro(Carro carro) { 
		Placa placa = carro.getPlaca();
		return (carro.getMarca() + "\t|\t" + carro.getCor() + "\t|\t"
				+ carro.getModelo() + "\t|\t" + carro.getTipoModelo() + "\t|\t"
				+ carro.getPorta() + "\t|\t" + placa.getCodigo() + " "
				+ placa.getCidade() + "-" + placa.getEstado());
	}
}