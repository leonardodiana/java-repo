package model;

public class Contatto {
	
	private String nome;
	private String numero;
	
	public Contatto(String nome) {
		this.nome = nome;
		this.numero = "sconosciuto";
		
	}
	public Contatto(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}
	//ora metodi getters per poter accedere alle proprietà settate come private, posso farlo con tasto destro, source, generate getters and setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", numero=" + numero + "]";
	}

	
	
	
	
	
	
	
	
}
