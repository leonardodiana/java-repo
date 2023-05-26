package controller;

public class Rubrica {

	private String nome;
	
	private Contatto[] contatti;
	
	public Rubrica(String nome, int numeroContatti) {
		
		this.nome = nome;
		this.contatti = new Contatto[];
	}
	
	public void addContatto(Contatto c, int posizione) {
		this.contatti[pos] = c;
	}
	public void addContatto(String nome, String numero, int pos) {
		this.contatti[pos] = c;
	}

	
}
