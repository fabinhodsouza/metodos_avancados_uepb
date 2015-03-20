package controller;

import java.util.ArrayList;
import java.util.List;



import model.Placa;
import model.automovel.Carro;

public class CarroCRUD {
	
	List<Carro> carros = new ArrayList<Carro>();
	
	public int qtdCarros(){
		return carros.size();
	}
	
	
	
	
	
	
	
	public boolean cadastrar(Carro carro){
		
		if(!carros.contains(carro)){
			return carros.add(carro);
		}
		return false;
		
	}
	
	public boolean remove(Placa placa){
		
		for(Carro carro : carros){
			if(carro.getPlaca().equals(placa)){
				return carros.remove(carro);
			}
		}
		
		return false;
	}
	
	public boolean atualizar(Placa placa, Carro carroAtualizado){
		
		for(Carro carro : carros){
			if(carro.getPlaca().equals(placa)){
				if(carros.remove(carro)){
					return carros.add(carroAtualizado);
					
				}
				return false;
			}
		}
		
		return false;
		
	}
	
	public List<Carro> consultar(Placa placa){
		List<Carro> carrosBusca = new ArrayList<Carro>();
		for(Carro carro : carros){
			if(carro.getPlaca().equals(placa)){
				carrosBusca.add(carro);
			}
		}
		System.out.println(carrosBusca);
		return carrosBusca;
	}
	
	public List<Carro> consultar(String marca){
		List<Carro> carrosBusca = new ArrayList<Carro>();
		for(Carro carro : carros){
			if(carro.getMarca().equals(marca)){
				carrosBusca.add(carro);
			}
		}
		return carrosBusca;
	}
	
	public List<Carro> getCarros(){
		
		return carros;
	}
	
	public String mostraCarro(Carro carro){
		Placa placa = carro.getPlaca();
		return (carro.getMarca()+"\t|\t"+carro.getCor()+"\t|\t"+
							carro.getModelo()+"\t|\t"+carro.getTipoModelo()+"\t|\t"+
							carro.getPorta()+"\t|\t"+placa.getCodigo()+" "+
							placa.getCidade()+"-"+placa.getEstado());
	}

}
