package model;

import model.automovel.Veiculo;
import model.individuo.Cliente;
/**
 * Essa classe definir� o que ser� necess�rio para alugar o ve�culo. Que no caso s�o: {@link Cliente}, {@link Veiculo} e Valor do aluguel.
 *  
 * @author Lucas Miranda, F�bio Dias e Bruno Clementino 
 */
public class Aluga {
	
	private Cliente cliente;
	private Veiculo veiculo;
	private Double valor;
	
	/**
	 * 
	 * @param cliente
	 * @param veiculo
	 * @param valor
	 */
	public Aluga(Cliente cliente, Veiculo veiculo, Double valor) {
		super();
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
