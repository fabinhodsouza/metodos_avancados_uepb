package model;

import java.util.ArrayList;
import java.util.Collection;

public class Locacao {
 	 
	private Collection<ListaVeiculos> listaVeiculos = new ArrayList<ListaVeiculos>();
	private double valor;
	
	public Collection<ListaVeiculos> getListaVeiculos() {
		return listaVeiculos;
	}

	public void setListaVeiculos(ListaVeiculos listaVeiculos) {
		this.listaVeiculos.add(listaVeiculos);
	}

	public double getValor() {
		double valorTotal = 0.0;

        for (ListaVeiculos lista : listaVeiculos) {
			double subTotalItem;
            ListaVeiculos cada = lista;
			subTotalItem = cada.subTotal();
			valorTotal += subTotalItem;
        }
        return valorTotal;
	}
}