package cesusc.hotel;

import java.util.ArrayList;

public class ControleHotel {
	
	private ArrayList<Hotel> listaHoteis;
	
	
	public ControleHotel() {
		super();
		listaHoteis = new ArrayList<Hotel>();
	}
	
	public void adicionaHotel(Hotel h) {
		listaHoteis.add(h);
	}
	
	public void deletaHotel (Hotel h) {
		listaHoteis.clear();
	}
	
	
	public String[] getListaHotel() {
		String[] aux = new String[listaHoteis.size()];
		
		for (int i=0; i<listaHoteis.size(); i++) {
			aux[i] = listaHoteis.get(i).getNome();			
		}
		return aux;
	}
}
