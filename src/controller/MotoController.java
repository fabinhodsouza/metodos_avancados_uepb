package controller;

import java.util.ArrayList;
import java.util.List;
import model.Placa;
import model.automovel.Moto;

/**
 * A classe {@link MotoController} controla todo o fluxo de dados do sistema de
 * {@link Moto}. Nela têm-se os metodos de cadastrar, remover, atualizar e
 * 
 * @author Lucas Miranda, Fabio Dias e Bruno Clementino.
 *
 */
public class MotoController {

	/** Vetor de {@link Moto} */
	private List<Moto> motos = new ArrayList<Moto>();

	/**
	 * Retorna a quantidade de {@link Moto} no vetor.
	 * 
	 * @return {@link Integer}
	 */
	public int qtdMotos() {
		return motos.size();
	}

	/**
	 * Adiciona no vetor {@link Moto}. Caso exista a {@link Moto} no vetor será
	 * retornado um <code>false</code>
	 * 
	 * @param moto
	 * @return {@link Boolean}
	 */
	public boolean cadastrar(Moto moto) {
		if (!motos.contains(moto)) {
			return motos.add(moto);
		}
		return false;
	}

	/**
	 * Remove a {@link Moto} do vetor. Para encontra-la é passado o parametro a
	 * placa. Caso não seja encontrada retorna um <code>false</code>
	 * 
	 * @param placa
	 * @return {@link Boolean}
	 */
	public boolean remove(Placa placa) {

		for (Moto moto : motos) {
			if (moto.getPlaca().equals(placa)) {
				return motos.remove(moto);
			}
		}

		return false;
	}

	/**
	 * Atualiza a {@link Moto} do vetor. Caso não seja encontrada a placa da
	 * {@link Moto} retornará um <code>false</code>
	 * 
	 * @param placa
	 * @param motoAtualizado
	 * @return {@link Boolean}
	 */
	public boolean atualizar(Placa placa, Moto motoAtualizado) {

		for (Moto moto : motos) {
			if (moto.getPlaca().equals(placa)) {
				if (motos.remove(moto)) {
					return motos.add(motoAtualizado);

				}
				return false;
			}
		}

		return false;

	}

	/**
	 * Busca a {@link Moto} no vetor e retorna a {@link Moto}, caso não seja
	 * encontrada retorna <code>null</code>.
	 * 
	 * @param placa
	 * @return {@link Moto} ou <code>null</code>
	 */
	public Moto consultar(Placa placa) {

		for (Moto moto : motos) {
			if (moto.getPlaca().equals(placa)) {
				return moto;
			}
		}

		return null;
	}

	/**
	 * Busca todas as motos de uma marca/fabricante específico e retorna em um
	 * vetor.
	 * 
	 * @param marca
	 * @return {@link List}
	 */
	public List<Moto> consultar(String marca) {
		List<Moto> motosBusca = new ArrayList<Moto>();
		for (Moto moto : motos) {
			if (moto.getMarca().equals(marca)) {
				motosBusca.add(moto);
			}
		}
		return motosBusca;
	}

	/**
	 * retorna no vetor {@link MotoController}.
	 * 
	 * @return {@link List}
	 */
	public List<Moto> getMotos() {

		return motos;
	}

	/**
	 * Retorna todas as informações da Moto. (toString).
	 * @param moto
	 * @return {@link String}
	 */
	public String mostraMoto(Moto moto) {
		Placa placa = moto.getPlaca();
		return (moto.getMarca() + "\t|\t" + moto.getCor() + "\t|\t"
				+ moto.getModelo() + "\t|\t" + moto.getModelo() + "\t|\t"
				+ moto.getRoda() + "\t|\t" + placa.getCodigo() + " "
				+ placa.getCidade() + "-" + placa.getEstado());
	}

}
