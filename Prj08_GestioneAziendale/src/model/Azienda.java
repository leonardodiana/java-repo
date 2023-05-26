package model;

import java.util.ArrayList;

public class Azienda {
	private ArrayList<Impiegato> impiegati;
	
	public Azienda() {
		impiegati = new ArrayList<>();
	}
	public void addImpiegato(String nome, String cognome, int annoNascita) {
		Impiegato i = new Impiegato(nome, cognome, annoNascita);
		impiegati.add(i);
	}
	public void addImpiegato(Impiegato i) {
		impiegati.add(i);
	}
	public int stipendioTOT() {
		int totale = 0;
		for (Impiegato impiegato : impiegati ) {
			totale += impiegato.getStipendio();
			}
		return totale;
	}
	public ArrayList<Impiegato> getImpiegati(){
		return impiegati;
	}
	
}
