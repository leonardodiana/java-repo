package test;

import java.util.ArrayList;
import java.util.List;

import model.Automobile;
import model.Trattore;
import model.Veicolo;

public class Autosalone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Veicolo> veicoli = new ArrayList<>();
		
		veicoli.add(new Automobile("ferrari"));
		veicoli.add(new Trattore("lamborghini"));
		veicoli.add(new Automobile("porsche"));
		System.out.println(veicoli);
	}

}
