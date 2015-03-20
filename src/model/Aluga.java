package model;
/**
 * 
 * @author Lucas Miranda, Fábio Dias e Bruno Clementino 
 */
import model.automovel.Veiculo;
import model.individuo.Cliente;

public class Aluga {
	
	private Cliente cliente;
	private Veiculo veiculo;
	private Double valor;
	
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
