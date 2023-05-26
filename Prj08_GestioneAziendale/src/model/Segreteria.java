package model;

public class Segreteria {
	public static String creaID (String nome, String cognome, int annoNascita) {
		
		return nome.substring(0, 2) + cognome.substring(0, 2) + annoNascita;
	}
	
}
