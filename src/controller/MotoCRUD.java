package controller;

import java.util.ArrayList;
import java.util.List;

import model.Placa;
import model.automovel.Carro;
import model.automovel.Moto;

public class MotoCRUD {

List<Moto> motos = new ArrayList<Moto>();
	
	public int qtdMotos(){
		return motos.size();
	}
	
	public boolean cadastrar(Moto moto){
		
		if(!motos.contains(moto)){
			return motos.add(moto);
		}
		return false;
		
	}
	
	public boolean remove(Placa placa){
		
		for(Moto moto : motos){
			if(moto.getPlaca().equals(placa)){
				return motos.remove(moto);
			}
		}
		
		return false;
	}
	
	public boolean atualizar(Placa placa, Moto motoAtualizado){
		
		for(Moto moto : motos){
			if(moto.getPlaca().equals(placa)){
				if(motos.remove(moto)){
					return motos.add(motoAtualizado);
					
				}
				return false;
			}
		}
		
		return false;
		
	}
	
	public Moto consultar(Placa placa) {
		
		for (Moto moto : motos) {
			if (moto.getPlaca().equals(placa)) {
				return moto;
			}
		}
		
		return null;
	}
	
	
	public List<Moto> consultar(String marca){
		List<Moto> motosBusca = new ArrayList<Moto>();
		for(Moto moto : motos){
			if(moto.getMarca().equals(marca)){
				motosBusca.add(moto);
			}
		}
		return motosBusca;
	}
	
	public List<Moto> getMotos(){
		
		return motos;
	}
	
	/*public String mostraMoto(Moto moto){
		Placa placa = moto.getPlaca();
		return (moto.getMarca()+"\t|\t"+moto.getCor()+"\t|\t"+
							moto.getModelo()+"\t|\t"+moto.getTipoModelo()+"\t|\t"+
							moto.getRoda()+"\t|\t"+placa.getCodigo()+" "+
							placa.getCidade()+"-"+placa.getEstado());
	}*/
	
	
}
