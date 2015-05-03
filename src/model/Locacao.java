package model;

import java.util.ArrayList;
import java.util.Collection;

public class Locacao {
 	 
	private Collection<ListaVeiculos> listaVeiculos = new ArrayList<ListaVeiculos>();

	public Collection<ListaVeiculos> getListaVeiculos() {
		return listaVeiculos;
	}

	public void setListaVeiculos(Collection<ListaVeiculos> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}
}
 
